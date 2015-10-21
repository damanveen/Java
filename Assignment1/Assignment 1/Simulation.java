import java.util.ArrayList;
/**
 * A simulation consists for now of a list of users and a list of documents.  
 * "Running" the simulation consists of iterating through the users and asking them to "act".
 * The simulation also provides a search method to the users so they can retrieve the top documents.
 * 
 * @author (Daman Singh) 
 * @version (version 1 / Monday, October 12th 2015)
 */
public class Simulation
{
    // instance variables - replace the example below with your own
    private ArrayList<Users> users;
    private ArrayList<Documents> documents;

    /**
     * Constructor for objects of class Simulation
     */
    public Simulation()
    {
        // initialise instance variables
        users = new ArrayList<Users>();
        documents = new ArrayList<Documents>();
    }
    
    public void addDocument(Documents d)
    {
        documents.add(d);

    }
    
    public void addUser(Users u)
    {
        users.add(u);
       
    }
    
    public void run()
    {
        for(Users Users: users){
            Users.act();
        }
       
    }
    
    public ArrayList<Documents> search()
    {
        return documents;
        
    }
}
