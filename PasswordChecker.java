/* PasswordChecker.java
 * Module 7 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.16.22
 * Course: CSD320
 * Program to check if entered password meets certain criteria:
 * 1. Have at least 8 characters
 * 2. Contains both letters and digits
 * 3. Contain at least one uppercase character
 * 4. Contain at least one lowercase character
 * */

import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {  //main function
    
        Scanner input = new Scanner(System.in); //to take user input
        boolean again; // enter new password flag
        do{
            System.out.println(
                    "\nPassword Rules....\n" +
                    "1. Must have at least 8 characters.\n" +
                    "2. Must contain both letters and digits.\n" +
                    "3. Must contain at least one uppercase character.\n" +
                    "4. Must contain at least one lowercase character.");

            boolean noPass; //password check flag

            do{ 

                System.out.print("\nEnter Password: "); //prompt user for password
                String password = input.nextLine();

                if(checkPassword(password)) { //invoke password validation method
                    System.out.println("Password Accepted");   //print valid password
                    System.out.println("\nYour new password is: " + password);
                    noPass = false; // set sentinel to false

                }else {    //otherwise password is not valid
                    System.out.println("Please try again");  //print password is not valid
                    noPass = true; //set sentinel to true
                }
            }while(noPass); //while password is invalid

            System.out.print("\nTo try a different password enter 'y'." +
                            "\nTo exit press 'enter': ");
            String entry = input.nextLine();
            if(entry.equalsIgnoreCase("y")) {
                again = true;
            }else {
                again = false;
            }
            
        }while(again); // user wishes to enter new password
        input.close();
    }

    public static boolean checkPassword(String password) {  //method for password validation

        //Condition #1 if password has length less than 8
        if(password.length()<8) { 
            System.out.println("Password must have at least 8 characters.");
            return false;   //return false for failed condition 1
        }

        //Condition #2-4 is password has digits, uppercase AND lowercase.
        boolean isNums = false; //check for digit flag
        boolean isUpper = false; //check for upper flag
        boolean isLower = false; //check for lowercase flag
        char ch;

        for(int i = 0; i < password.length(); i++) { // traverse each character in password
            ch = password.charAt(i);
            if(Character.isDigit(ch)) { // if character is digit
                isNums = true; // digit flag true
            }else if(Character.isUpperCase(ch)) { // if character is upper
                isUpper = true; // upperflag true
            }else if(Character.isLowerCase(ch)) { // if character is lower
                isLower = true; // lowerflag true
            }
            if(isUpper && isLower && isNums) { // if all condition flags true
                return true; // return true for passed conditions 2-3
            }
        }
        if(!isNums){ // if contains no digits
            System.out.println("Password must contain both letters and digits."); //print error type
        }else if(!isUpper || !isLower){ // if no upper AND lowercase
            System.out.println("Password must contain at least one uppercase AND lowercase letter."); //print error type
        }
        return false; // return false for failed conditions 2-3

    }
}