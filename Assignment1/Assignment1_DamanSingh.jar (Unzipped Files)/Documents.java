
/**
 * A document has an id and a "tag".  (e.g., download, read) it.
 * This "tag" represents what the document is all about (for a music file, it could represent its genre), but it is not known to the user until he/she gets to "evaluate"
 * @author (Daman Singh) 
 * @version (version 1 / Monday, October 12th 2015)
 */
public class Documents
{
    
    private int id = 0;
    private String tag;
    private static int ID_COUNT = 0;
    

    /**
     * Constructor for objects of class Documents
     */
    public Documents(String tag)
    {
        this.tag = tag;
        ID_COUNT++;
        id = ID_COUNT;
       
    }

    public int getId()
    {
        return id;
        
    }
    
       public String getTag()
    {
        return tag;
        
    }
}
