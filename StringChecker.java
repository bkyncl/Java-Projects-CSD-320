/* StringChecker.java
 * Module 4 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.2.22
 * Course: CSD320
 * Program to check if either entered string is a substring of the other
 * */

import java.util.Scanner;

public class StringChecker {

    public static void main(String[] args) {
        
        String checkAgain; // check more strings variable
        Scanner input = new Scanner(System.in);
        String String_one; // fisrt entered string variable
        String String_two; // second entered string variable
        String whiteSpaces; // check only white spaces varibale

        do { // loop to run again

            // loop to check user input
            while (true) { 
                System.out.print("\nEnter string one: "); // string entry prompt
                String_one = input.nextLine();
                
                System.out.print("Enter string two: "); // string entry prompt
                String_two = input.nextLine();
                
                if (String_one == "" || String_two == "") { // check if entry is null
                    System.out.println("You can't pass null strings..");
                }
                else if (String_one.isBlank() && String_two.isBlank()) { // cehck if entry is only white spaces
                    System.out.println("\nIt's really to fun to compare only white spaces...");
                    System.out.print("Is that what you wish to do? (y/n): ");
                    whiteSpaces = input.nextLine();
                        // break if user wishes to compare two strings containing only white spaces
                        if (whiteSpaces.equalsIgnoreCase("y")) {
                            break;
                        }
                }else { // break if entry != null 
                    break;
                }
            }

            // check is string two is substring of string one
            if (String_one.indexOf(String_two) != -1) {
                System.out.printf("%n\"%s\" is a substring of \"%s\"%n", String_two, String_one);
            }
            // check is string one is substring of string two
            else if (String_two.indexOf(String_one) != -1) {
                System.out.printf("%n\"%s\" is a substring of \"%s\"%n", String_one, String_two);
            }
            // print statement if neither string is a substring of the other
            else { 
                System.out.printf("%nNeither \"%s\" or \"%s\" is a substring of the other.%n", String_one, String_two);
            }

            // promt user is they want to check more strings
            System.out.print("\nCheck more strings? (y/n): ");
            checkAgain = input.nextLine();

        } while (checkAgain.equalsIgnoreCase("y")); // check more strings loop

        System.out.println("Goodbye...");
        
        input.close();
    }

}
