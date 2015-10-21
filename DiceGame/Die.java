import java.util.Random;



public class Die
{
	
	
	public static void main(String[] Args)
	{
		Random randomGenerator = new Random();
		for (int idx = 1; idx <= 3; ++idx)
		{
      		 int randomInt = randomGenerator.nextInt(6);
      		 System.out.println("Rolled : " + randomInt);
    	}
    
    	System.out.println("Done.");
	
	}
	
	public void roll()
	{
		Random randomGenerator = new Random();
		int roll = randomGenerator.nextInt(6);
		System.out.println("Roll: " + roll);
	
	}


}