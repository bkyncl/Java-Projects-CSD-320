/* Pyramid.java
 * Module 6 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.7.22
 * Course: CSD320
 * Program using nested loops to output 
 *                      1               @
 *                    1 2 1             @
 *                  1 2 4 2 1           @
 *                1 2 4 8 4 2 1         @
 *             1 2 4 8 16 8 4 2 1       @
 *          1 2 4 8 16 32 16 8 4 2 1    @
 *       1 2 4 8 16 32 64 32 16 8 4 2 1 @
 * */
      
public class Pyramid {

    public static void main(String [] args) {
        
        int row = 6; //set row limit

        // outer loop to increment row print until row limit
        for(int i = 0;  i <= row; i++) {
            int printNum = 0; //set printed number to zero

            for (int j = i; j <= row; j++) { // upwards decreasing triangle
                System.out.print("   "); // 3 white spaces each
            }
            for (int j = 0; j < i; j++) { // upwards incresing triangle 
                // print 2^num and increment num each iteration
                System.out.printf("%3d",(int)Math.pow(2,printNum), printNum++); 
            }
            for (int j = 0; j <= i; j++) { // downwards decreasing triangle 
                // print 2^num and decrement num each iteration
                System.out.printf("%3d",(int)Math.pow(2,printNum), printNum--); 
            }
            for (int j = i; j <= row; j++) { // upwards decreasing triangle 
                System.out.print("   "); // 3 whtite spaces each
                if (j == row) { // if column limit reached
                    System.out.print("@"); // print @
                }
            }

            System.out.println(); // print each row on new line
            
        }
        
    }   
    
}
