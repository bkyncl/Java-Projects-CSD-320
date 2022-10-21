
/* Mod_1.java
 * Module 1 Assignment 
 * Name: Brittany Kyncl
 * Date: 10.18.22
 * Course: CSD320
 * Java program to display and compare two similar calculations. */


/* Every line of java code must be within a class
 Name of java file must match  main class name */
public class Mod_1 {

    // Every program must contain the main() method
    public static void main(String[] args) {

        // Using the System output printline() method to print output of following calculations
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )); // Output: 3.2837384837384844
        System.out.println( 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )); // Output: 4

        // The same calculations attributed to variables with the float data type
        float Fans1= (float) (4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0));
        float Fans2= 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
        System.out.println(Fans1); // Output: 3.2837384
        System.out.println(Fans2 ); // Output: 4.0

        // The same calculations attributed to variables with the double data type
        double Dans1= 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);
        double Dans2= 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
        System.out.println(Dans1); // Output: 3.2837384837384844
        System.out.println(Dans2 ); // Output: 4.0
    }
}

/* The output of the first equation is 3.2837384837384844
 * The output of the Second equation is 4
 * The first output is due to the numbers being in decimal form so Java will return a floating point value. 
 * The second ouput is due to the numbers being in int form so Java then returns an int value.
 * The floating point number output is best for instances where we need more accuracy in calclulations.
 * Integer number output is better when it is not necessary to bother with fraction values.
 * Following the initial calculations, show examples of floating point data types.
 * The float data type is a single precision number format that stores six or seven digits. 
 * The double data type is a double precision number format that stores about fifteen digits.
 * The double floating point type is a more precise number format.
 */