import java.util.Random;
import java.util.Scanner;

public class DiceGame{

	private int PlayerRoll;
	private int CompRoll;
	
	private int max = 6;
	private int min = 1;
	private int PlayerCash = 100, CompCash = 100;
	private int bet;
	private boolean check = false;
	
	
	
	public static void main(String args[])
	{
		DiceGame game = new DiceGame();
		System.out.println("lets Play!!");
		game.play();

	}	
	
	public void play()
	{
	
	do{
		Scanner sc = new Scanner(System.in);  
	  	System.out.println("Player 1 bet: ");  
  		int bet = sc.nextInt(); 
  		
  		if( bet > 0){
  		
  			
  			Random randomGenerator = new Random();
			int PlayerRoll = randomGenerator.nextInt(max - min) + min;
			System.out.println("\nPlayer 1 Rolls: " + PlayerRoll); 
		
			int CompRoll = randomGenerator.nextInt(max - min) + min;
			System.out.println("\nComputer Rolls: " + CompRoll);
		
			if(PlayerRoll > CompRoll)
			{
				System.out.println("\nPlayer 1 wins!!");
				PlayerCash = PlayerCash + bet; 
				CompCash = CompCash - bet;
			}
			else if( PlayerRoll == CompRoll)
			{
				System.out.println("\nIt's a tie. Try again.");
			}
			else
			{
				System.out.println("\nComputer wins!!");
				PlayerCash = PlayerCash - bet; 
				CompCash = CompCash + bet;
			}
		}
		else
		{ 
			System.out.println("\nEnding Game");
			System.exit(0);
		}
		
		System.out.println("\nPlayer 1 has: $" + PlayerCash);
		System.out.println("\nComputer has: $" + CompCash);
		
		if(PlayerCash <= 0 || CompCash <= 0)
		{
			check = true;
		}
	
				
		
	}while(check == false);
		
	if(PlayerCash > CompCash)
	{
		System.out.println("\nPlayer 1 Wins!!");
	}
	else
	{
		System.out.println("\nComputer Wins!!");
		System.exit(0);
	}
			
	}


}