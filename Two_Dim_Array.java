/* Two_Dim_Array.java
 * Module 11 Assignment 
 * Name: Brittany Kyncl
 * Date: 12.7.22
 * Course: CSD320
 * Return locations of largets and smallest element of two dimensional arrays passsed to method
 * returning one dimensional array with indices of element location.
 */
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Two_Dim_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // function message
        System.out.println("\nDisplaying two dimensional arrays and the indices of the min/max element locations..\n");

        //re-run loop
        while(true){
            int numberOfRows, numberOfColumns; // vars to hold user inputs
            // promting user for 2d array num of rows and columns
            System.out.print("\nEnter desired number of rows in 2D array: ");
            try{
                numberOfRows = input.nextInt();
            }
            catch(InputMismatchException e){
                input.nextLine();
                continue;
            }
            System.out.print("\nEnter desired number of columns in 2D array: ");
            try{
                numberOfColumns = input.nextInt();
            }
            catch(InputMismatchException e){
                input.nextLine();
                continue;
            }

            // declaring int type 2d array filled with random numbers retunred from array generation method
            int [][] intArray = intArray(numberOfRows, numberOfColumns); // parsing user input
            // declaring double type 2d array filled with random numbers retunred from array generation method
            double [][] doubleArray = doubleArray(numberOfRows, numberOfColumns); //parsing user input

            // declaring array to hold indices of largest element location returned from method
            int[] max = locateLargest(intArray); 
            // declaring array to hold indices of smallest element location returned from method
            int[] min = locateSmallest(intArray);

            // declaring array to hold indices of largest element location returned from method
            int[] max2 = locateLargest(doubleArray);
            // declaring array to hold indices of smallest element location returned from method
            int[] min2 = locateSmallest(doubleArray);
        
            // Displaying and finding min max on int type 2d array
            System.out.println();
            printArray(intArray); // calling print method for display
            System.out.println();

            // displaying results for int type 2d array
            System.out.println("The max element is located at row index, column index: " + Arrays.toString(max));
            System.out.println("Max Element value: " +intArray[max[0]][max[1]]); // displaying value held at max location
            System.out.println("The min element is located at row index, column index: " + Arrays.toString(min));
            System.out.println("Min Element value: " +intArray[min[0]][min[1]]); // displaying value held at min location
            System.out.println();

            // Displaying and finding min max on doubly type 2d array
            printArray(doubleArray); // calling print method for display
            System.out.println();
            
            // displaying results for double type 2d array
            System.out.println("The max element is located at row index, column index: " + Arrays.toString(max2));
            System.out.println("Max Element value: " + doubleArray[max2[0]][max2[1]]); // displaying value held at max location
            System.out.println("The min elementis located at row index, column index: " + Arrays.toString(min2));
            System.out.println("Min Element value: " + doubleArray[min2[0]][min2[1]]); // displaying value held at min location
            System.out.println();

            System.out.print("To exit press enter, or type something to continue: ");
            input.nextLine();
            String in = input.nextLine();
            if(in.equals(""))
                break;
        }
        input.close();
        
    } 
    // method to return location of largets value of 2d array paramenter
    public static int[] locateLargest(double[][] arrayParam) {
        int max[]= {0,0}; // max array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				if(arrayParam[i][j]>arrayParam[max[0]][max[1]]) {
					max[0]=i;
					max[1]=j;
				}
			}
		}
		return max;
    } 
    // method to return location of largets value of 2d array paramenter
    public static int[] locateLargest(int[][] arrayParam) {
        int max[]= {0,0}; // max array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				if(arrayParam[i][j]>arrayParam[max[0]][max[1]]) {
					max[0]=i;
					max[1]=j;
				}
			}
		}
		return max;
    } 
    // method to return location of smallest value of 2d array parameter
    public static int[] locateSmallest(double[][] arrayParam) {
        int min[]= {0,0}; // min array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				if(arrayParam[i][j]<arrayParam[min[0]][min[1]]) {
					min[0]=i;
					min[1]=j;
				}
			}
		}
		return min;
    } 
    // method to return location of smallest value of 2d array parameter
    public static int[] locateSmallest(int[][] arrayParam) {
        int min[]= {0,0}; // min array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				if(arrayParam[i][j]<arrayParam[min[0]][min[1]]) {
					min[0]=i;
					min[1]=j;
				}
			}
		}
		return min;
    } 
    //method to fill int type 2d array with randomized values
    public static int[][] intArray(int x, int y) {
        Random rand = new Random();
        int[][] array = new int[x][y];
        // fill array with random numbers
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }
    //method to fill double type 2d array with randomized values
    public static double[][] doubleArray(int x, int y) {
        Random rand = new Random();
        double[][] array = new double[x][y];
        // fill array with random numbers
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextDouble(100);
            }
        }
        return array;
    }
    public static void printArray(int[][] arrayParam) {
        // method to print 2d  array row by row with formatting
        System.out.println("----------------------------------");
        System.out.println("Int 2D Array Elements: ");
        System.out.println("----------------------------------");
        for(int i = 0; i < arrayParam.length; i++){
            System.out.print("Row " + i + " |  [");
            for(int j = 0; j < arrayParam[i].length; j++)
                if(j < arrayParam[i].length -1)
                    System.out.print(arrayParam[i][j] + ", ");
                else
                    System.out.print(arrayParam[i][j]);
             System.out.println("]");
        }
    }
    public static void printArray(double[][] arrayParam) {
        // method to print 2d  array row by row with formatting
        System.out.println("----------------------------------");
        System.out.println("Double 2D Array Elements: ");
        System.out.println("----------------------------------");
        for(int i = 0; i < arrayParam.length; i++){
            System.out.print("Row " + i + " |  [");
            for(int j = 0; j < arrayParam[i].length; j++)
                if(j < arrayParam[i].length -1)
                    System.out.print(arrayParam[i][j] + ", ");
                else
                    System.out.print(arrayParam[i][j]);
             System.out.println("]");
        }
    }
    public static void printIndArray(int[][] arrayParam) {
        System.out.println("----------------------------------");
        System.out.println("Int 2D Array Elements: ");
        System.out.println("----------------------------------");
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printIndArray(double[][] arrayParam) {
        System.out.println("----------------------------------");
        System.out.println("Double 2D Array Elements: ");
        System.out.println("----------------------------------");
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
    }
       
}
