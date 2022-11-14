
import java.util.*;

public class Questions {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char again = 'y';
    int game;
    
    do {
        System.out.println("\nWhich game would you like to play?"+
                            "\nEnter 1 for random number guessing game."+
                            "\nEnter 2 for quiz game.");
        
        do {
            System.out.print("Enter (1/2): ");
            game = input.nextInt();
        } while(game < 1 || game > 2);

        while (game == 1){
            int randomNum = (int)(Math.random() * 100 -1);
            int guess= -1;

            System.out.println("\nEnter a number between 1 - 100: ");
            
                while (guess != randomNum){
                    System.out.print("\nEnter your guess: ");
                    guess = input.nextInt();
                    if (guess > randomNum){
                        System.out.println("That guess is too high.");
                        System.out.println(randomNum);
                    }
                    else if (guess < randomNum){
                        System.out.println("That guess is too low"); 
                        System.out.println(randomNum);  
                    }               
                }
                System.out.println("\nThat is correct. \nYou guessed: " + guess + 
                                    "\nThe random number was: " + randomNum);
                game = 3;
        }

        while (game == 2) {
            final int NUMBER_OF_QUESTIONS = 5; // number of questions
            int correctCount = 0; // count the number of correct answers
            int count = 0; // count the number of questions
            long startTime = System.currentTimeMillis();
            String output = " "; // output string is intially empty
            

            while(count != NUMBER_OF_QUESTIONS){
                
                //generate two random num
                int num1 = (int) (Math.random() * 30);
                int num2 = (int) (Math.random() * 30);

                // promt for answer to addition questions
                System.out.print("\nwhat is " + num1 + " + " + num2 + " = ");
                int answer = input.nextInt();

                if (num1 + num2 == answer){
                    System.out.println("Correct answer");
                    correctCount++;
                }
                else
                    System.out.println("Incorrect answer");

                // increase question count
                count++;

                output += "\n" + num1 + " + " + num2 + " = " + answer + 
                ((num1 + num2 == answer) ? " correct": " wrong");

                }

            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("\nCorrect count is: " + correctCount + "\nTest time is: "
            + testTime / 1000 + " secconds\n" + output);  
            game = 3;
        }    


        System.out.print("\nPlay again? (y/n): ");
        again = input.next().charAt(0);
    } while (again == 'y');


    input.close();
} 
}
