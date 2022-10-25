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
  
    public static void main(String[] args) { // main method

        Scanner input = new Scanner(System.in); // create scanner object
        String runAgain;

        // program re-run loop
        do {

            // display program function
            System.out.println("\nThis specific heat calculator program calculates the energy\n"
                                + "needed to heat an amount of water from\n"
                                + "an initial temperatureto a final temperature."); 

            // offer conversion from fahrenheit to celsius                   
            System.out.print("\nThis calculator takes in tepmeratures in degrees Celcius." +
                            "\nDo you need to convert your initial and final temperature from" +
                            "\nFahernehit to Celcius? Enter (y/n): ");
            // store user answer to convert degree option
            String convertDegree = input.next();


            // run conversion bases on y choice
            if (convertDegree.equalsIgnoreCase("y")) {

                // promt user to enter intial fahrenheit conversion one
                System.out.print("\nEnter the initial temperature of the water in Fahrenheit: ");
                // read in value
                double fahrenheit1 = input.nextDouble();
                // run value through conversion method and assign to temperature variable
                double temperature = temperatureConversion(fahrenheit1); 

                // promt user to enter desire final fahrenheit conversion two
                System.out.print("\nEnter the desired final temperature of the water in Fahrenheit: ");
                // read in value
                double fahrenheit2 = input.nextDouble();
                // run value through conversion method and assign to finalTemperature variable
                double finalTemperature = temperatureConversion(fahrenheit2);

                // prompt user for amount of water
                System.out.print("\nEnter the amount of water in kilograms: ");
                // read in value
                double kilograms = input.nextDouble();

                // display conversion results
                System.out.println("\nConversion Results:\n" + fahrenheit1 + "°F: " + (float) temperature + "°C\n" +
                fahrenheit2 + "°F: " + (float) finalTemperature + "°C"); 

                // invoke energy calculaton method with converted temperatures and display results
                calculateEnergy(kilograms, finalTemperature, temperature);

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

                // invoke energy calculation method and display results
                calculateEnergy(kilograms, finalTemperature, temperature);
               
            } 

            // user promt to re-run program
            System.out.print("Do you want to perform another calculation? (y/n):  ");
            runAgain = input.next();
            
        } while(runAgain.equalsIgnoreCase("y")); // re-run loop
    
        input.close(); // close scanner

    }
    
    // specific heat calculation method
    static void calculateEnergy(double kilograms, double finalTemperature, double temperature) {

        // calculate energy needed to heat water
        double energy = kilograms * (finalTemperature - temperature) * 4184;

        // display result
        System.out.println("\nThe energy needed to heat " + kilograms + "kg of water." +
        "\nFrom an initial temperature of " + (float) temperature + "°C." + "\nTo a final temperature of " +
       (float) finalTemperature + "°C" + " is: \n" + (float) energy + " Joules.\n");
    
    }

    // fahrenheit to celcius conversion method
    static double temperatureConversion(double fahrenheit) {

        // convert first initial temp to fahrenheit to celsius
        double celcius = ((fahrenheit - 32.0) / 1.8);
        return celcius;

    }

}