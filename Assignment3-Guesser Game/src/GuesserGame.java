import java.util.*;

	
		class Guesser
	{
		int guessNum;
	    int guessNum()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Guesser kindly give a  the number between 1 and 100");
			guessNum=scan.nextInt();
			return guessNum;
		}	
	}

	class Umpire
	{
		int numFromGuesser;
		int numFromPlayer1;
		
		void collectNumFromGuesser()
		{
			Guesser g=new Guesser();
			numFromGuesser=g.guessNum();
		}
		
		void compare()
		{  
			int turns=0;
			int i=0;
			boolean win=false;
			
			int playerr;
			Scanner scan=new Scanner(System.in);
			System.out.println("Guess a number between 1 to 100, You will have 10 turns!");
			while(win==false) 
			{
				
				playerr=scan.nextInt();
				turns++;
				if(numFromGuesser==playerr)
				{
				   win=true;
				}
				else if(i>8)
				{
			      System.out.println("You loose! the right answer was: "+ numFromGuesser);
				      return;
			    }
				else if(numFromGuesser<playerr)
				{
			      i++;
			      System.out.println("Yor Guess is Higher than the right guess! Turns left: "+(10-i));    
			    }
				else if(numFromGuesser>playerr)
				{
				    i++;
				    System.out.println("Your Guess Is Lower Than THe Right Guess! Turns left: "+(10-i));
				     
				   }
				
				}
			System.out.println("YOu win!");
			
			System.out.println("You used "+turns+" turns to guess the right number");
		
		}
	}
		
	public class GuesserGame {

		public static void main(String[] args) {
			
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				
				u.compare();

		}

	}


