/* ForOperations.java
 * Module 5 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.7.22
 * Course: CSD320
 * For loops to display the following math operations smaller to larger order and then larger to smaller order:
 * Denominator: 3 - 99
 * 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 * 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 * */

public class ForOperations {
    public static void main(String[] args) {

        // sum from smaller to larger order
        double sum1 = 0;
        // sum from larger to smaller order
        double sum2 = 0;
   

        System.out.println("\nThe following math operations are done first with the \ndenominator being 3 - 99" +
                            " incrementing by 2.\nThen with the denominator being 99 - 3 decremting by 2.");

        System.out.println("\nHere is the result of the smaller to larger math operation... \n");

        //loop to print incrementing math operations with denominator incrementing +2 from 3-99
        for (double c = 3; c <= 99; c += 2.0) { 
            if (c < 99){ // control to eliminate + sign at last iteration print
                System.out.printf("1/%.1f + ", c); // print formatting
            }
            else { // control to eliminate + sign at last iteration print
                System.out.print("1/99.0 = "); // print formatting
            }
        }

        for (double incrementDen = 3.0; incrementDen <= 99 ; incrementDen += 2.0) {
            sum1 += (1.0/incrementDen);
        }
        System.out.printf("%.8f\n",sum1); // print result rounded to 8 decimals

        System.out.println("\nHere is the result of the larger to smaller math operation... \n");

        // loop to print decrementing math operations with denominator decrementing -2 from 99-3
        for (double j = 99; j >= 3; j -= 2.0) {
            if (j > 3) { // control to eliminate + sign at last iteration print
                System.out.printf("1/%.1f + ", j); // print formatting
            }
            else { // control to eliminate + sign at last iteration print
                System.out.print("1/3.0 = "); // print formatting
            }
        }

        for (double decrementDen = 99.0; decrementDen >= 3 ; decrementDen -= 2.0) {
            sum2 += (1.0/decrementDen);
        }
        System.out.printf("%.8f\n",sum2); // print result rounded to 8 decimals

        System.out.printf("\nHere are both results printed again... " +
        "\nThe sum of incrementing operation: %.8f\nThe sum of decrementing operation: %.8f", sum1, sum2);

    }   
}
