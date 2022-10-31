/* RockPaperScissors.java
 * Module 3 Assignment 
 * Name: Brittany Kyncl
 * Date: 10.27.22
 * Course: CSD320
 * Program to simulate Rock Paper Scissors game with random number generation 1 - 3
 * 1 = Rock
 * 2 = Paper
 * 3 = Scissors
 * */

import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String player; // player name
        int computerChoice = (int)(Math.random() * 3 + 1); // randomly generate computer choice 1-3
        int playerChoice; // player choice
        int playAgain;

        
            // program message
            System.out.println("\nWelcome to Rock, Paper, and Scissors game!!!");
            System.out.print("Please enter player name: "); // get user's name
            player = input.nextLine();

            do {
                
            // player options prompt
            System.out.println("\nWelcome " + player + "!" + "\nPlease choose your weapon..."
                            + "\n1 - ROCK \n2 - PAPER \n3 - SCISSORS");
            
            // User choice validation loop
            while (true) {

                computerChoice = (int)(Math.random() * 3 + 1); // randomly generate computer choice 1-3

                try {
                    System.out.print("\nEnter choice: "); // user choice prompt
                    playerChoice = input.nextInt();
                    if(playerChoice == computerChoice) { // check for tie
                        System.out.println("\nYou Tied. Try again!");// let user try again
                    }
                    else if (playerChoice >= 0 && playerChoice <= 3) {
                        break; // verify choice ic valid
                    }
                    // else if (InputMismatchException)
                    else {
                        System.out.println("Please enter a number between 1-3."); // error message
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("You must enter and ~integer~ between 1-3.");
                    
                }
                
            }

            // switching player choice 1-3 to cooresponding weapon options for print statement
            switch (playerChoice) {
                case 1: System.out.println("\n" + player +  " chose: \"ROCK\""); break;
                case 2: System.out.println("\n" + player +  " chose: \"PAPER\""); break;
                case 3: System.out.println("\n" + player +  " chose: \"SCISSORS\""); break;
            }

            // switching copmuter choice 1-3 to cooresponding weapon options for print statement
            switch (computerChoice) {
                case 1: System.out.println("Your oppenent chose: \"ROCK\""); break;
                case 2: System.out.println("Your oppenent chose: \"PAPER\""); break;
                case 3: System.out.println("Your oppenent chose: \"SCISSORS\""); break;
            }

            // check player choice against computerchoice
            if (playerChoice == 1 && computerChoice == 3
                    || playerChoice == 3 && computerChoice == 2
                    || playerChoice == 2 && computerChoice == 1) {
                System.out.println("--- YOU WON!! ---");// winning statement
            }
            else {
                System.out.println("--- You lost :( ---"); // losing statement
            }
        
            System.out.print("\nTo play again enter 1 to exit press 2: ");
            playAgain = input.nextInt();

        } while(playAgain == 1);

    
        input.close();
        
    }
}
