package RockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "Rock", "Paper", or "Scissors"
	String computerPlay = " ";  //Computer's play -- "R", "P", or "S" some changes
	int computerInt;  //Randomly generated number used to determine
	
	Scanner scan = new Scanner(System.in);						//computer's play
	Random generator = new Random();
	
	computerInt = generator.nextInt(3) + 1;
	//Get player's play -- note that this is stored as a string
	System.out.print("Enter Rock, Paper, or Scissors for rock paper or scissors: ");
	personPlay = scan.nextLine();
	//Translate computer's randomly generated play to string
	switch (computerInt){
	case 1:
		computerPlay = "Rock";
		break;
	case 2:
		computerPlay = "Paper";
		break;
	case 3:
		computerPlay = "Scissors"; //there are changes being made to this file currently so i can push this to my repository
		break;
	}

	//Print computer's play
	System.out.println("The computer chose " + computerPlay + ".");
	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equals(computerPlay))  
		
	    System.out.println("It's a tie!");
	    
	else if (personPlay.equals("Rock")) 
		
	    if (computerPlay.equals("Scissors")) 
	    	
	    	System.out.println("Rock crushes scissors.  You win!!");
	    
	    else 
	    	System.out.println("Paper suffocaes rock. You lose!!");
	    
	
	else if(personPlay.equals("Paper"))
		if (computerPlay.equals("Scissors")) 
			System.out.println("Scissor cuts paper. You lose!!");
		
		else 
			System.out.println("Paper suffocates rock. You win!!");
		
	
	else if(personPlay.equals("Scissors")) 
		
		if(computerPlay.equals("Paper")) 
			System.out.println("Scissors cuts paper. You win!!");
		
		else 
			System.out.println("Rock crushes scissors. You lose!!");
		
	}
}