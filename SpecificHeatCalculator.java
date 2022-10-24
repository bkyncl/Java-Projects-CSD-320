
/* SpecificHeatCalculator.java
 * Module 2 Assignment 
 * Name: Brittany Kyncl
 * Date: 10.19.22
 * Course: CSD320
 * Specific heat calculator that calculates energy needed to heat water from initial temp to final temp
 * User input water amount in kg and initial/final temp of water
 * Q Joules = waterMass kg (finatTemp C - initialTemp C) * 4184 */

import java.util.Scanner; // import scanner class

public class SpecificHeatCalculator {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create scanner object


        // display program function
        System.out.println("\nThis specific heat calculator program calculates the energy\n"
                            + "needed to heat an amount of water from\n"
                            + "an initial temperatureto a final temperature."); 

        // offer conversion from fahrenheit to celsius                   
        System.out.print("\nThis calculator takes in tepmeratures in degrees Celcius." +
                        "\nDo you need to convert your initial and final temperature from" +
                        "\nFahernehit to Celcius? Enter (y/n): ");
        // store user answer to convert degree option
        String convertDegree = input.nextLine();

            // run conversion bases on y choice
            if (convertDegree.equalsIgnoreCase("y")) {

                // promt user to enter fahrenheit conversion one
                System.out.print("\nEnter the initial temperature of the water in Fahrenheit: ");
                // read in value
                double fahrenheit1 = input.nextDouble();
                // convert first initial temp to fahrenheit to celsius
                double celcius1 = ((fahrenheit1 - 32.0) / 1.8);

                // promt user to enter fahrenheit conversion two
                System.out.print("\nEnter the final temperature of the water in Fahrenheit: ");
                // read in value
                double fahrenheit2 = input.nextDouble();
                // convert second final tempt to fahrenheit to celsius
                double celcius2 = ((fahrenheit2 - 32.0) / 1.8);

                // prompt user for amount of water
                System.out.print("\nEnter the amount of water in kilograms: ");
                // read in value
                double kilograms = input.nextDouble();

                // calculate energy needed to heat water
                double energy = kilograms  * (celcius2 - celcius1) * 4184;

                // display conversion results
                System.out.println("\nConversion Results:\n" + fahrenheit1 + "°F: " + (float) celcius1 + "°C\n" +
                fahrenheit2 + "°F: " + (float) celcius2 + "°C"); 

                // display energy calculation result
                System.out.println("\nThe energy needed to heat " + kilograms + "kg of water." +
                "\nFrom an initial temperature of " + (float) celcius1 + "°C." + "\nTo a final temperature of " +
                (float) celcius2 + "°C" + " is: \n" + (float) energy + " Joules.");

            }
            
            // run caclulation based on n choice
            if (convertDegree.equalsIgnoreCase("n")) {

                // promt user for initial water temp
                System.out.print("\nEnter the initial temperature of the water in Celcius: ");
                // read in value
                double temperature = input.nextDouble();

                // promt user to enter desire final temperature
                System.out.print("\nEnter the desired final temperature of the water in Celcius: ");
                // read in value
                double finalTemperature = input.nextDouble();

                // prompt user for amount of water
                System.out.print("\nEnter the amount of water in kilograms: ");
                // read in value
                double kilograms = input.nextDouble();

                // calculate energy needed to heat water
                double energy = kilograms  * (finalTemperature - temperature) * 4184;

                // display result
                System.out.println("\nThe energy needed to heat " + kilograms + "kg of water." +
                "\nFrom an initial temperature of " + temperature + "°C." + "\nTo a final temperature of " +
                finalTemperature + "°C" + " is: \n" + (float) energy + " Joules.\n");
                
            }


        input.close();

    }
    
}
