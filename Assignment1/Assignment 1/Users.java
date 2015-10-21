import java.util.ArrayList;
import java.util.List;

/**
 * .
 * 
 * @author (Daman Singh) 
 * @version (version 1 / Monday, October 12th 2015)
 */
public class Users
{
    // instance variables - replace the example below with your own
    private static int ID_COUNT = 0;
    private int id = 0;
    private String taste;
    private ArrayList<Documents> likes;
    Simulation sim = new Simulation();
   
    /**
     * Constructor for objects of class Users
     */
    public Users(Simulation sim, String taste)
    {
        this.taste = taste;
        likes = new ArrayList<Documents>();
        this.sim = sim;
        id = ID_COUNT;
        ID_COUNT++;
    }

    public int getId()
    {
        return id;
    }
    
    public String getTaste()
    {
        return taste;
    }
    
    public void like(Documents d)
    {
       likes.add(d);
    }
    
    public boolean likes(Documents d)
    {
        if (d.getTag() == taste)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public void act()
    {
        for(Documents tag : sim.search()){
            
            if( tag.getTag() == taste)
            {
                like(tag);
            }
        }
    }

}
