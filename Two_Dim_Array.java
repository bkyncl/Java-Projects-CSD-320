/* Two_Dim_Array.java
 * Module 11 Assignment 
 * Name: Brittany Kyncl
 * Date: 12.7.22
 * Course: CSD320
 * Return locations of largets and smallest element of two dimensional arrays passsed to method
 * returning one dimensional array with indices of element location.
 */
import java.util.*;

public class Two_Dim_Array {
    public static void main(String[] args) {
        // function message
        System.out.println("\nDisplaying two dimensional arrays and the indices of the min/max element locations..\n");

        // Displaying and finding min max on int type 2d array
        // declaring int type 2d array filled with random numbers retunred from array generation method
        int [][] intArray = intArray();
        printArray(intArray);// calling print method for display
        System.out.println();
        // declaring array to hold indices of largest element location returned from method
        int[] max = locateLargest(intArray); 
        // declaring array to hold indices of smallest element location returned from method
        int[] min = locateSmallest(intArray);

        // displaying results
        System.out.println("The max element is located at row index, column index: " + Arrays.toString(max));
        System.out.println("Max Element value: " +intArray[max[0]][max[1]]); // displaying value held at max location
        System.out.println("The min element is located at row index, column index: " + Arrays.toString(min));
        System.out.println("Min Element value: " +intArray[min[0]][min[1]]); // displaying value held at min location
        System.out.println();

        // Displaying and finding min max on doubly type 2d array
        // declaring double type 2d array filled with random numbers retunred from array generation method
        double [][] doubleArray = doubleArray();
        printArray(doubleArray); // calling print method for display
        System.out.println();
        // declaring array to hold indices of largest element location returned from method
        int[] max2 = locateLargest(doubleArray);
        // declaring array to hold indices of smallest element location returned from method
        int[] min2 = locateSmallest(doubleArray);

        // displaying results
        System.out.println("The max element is located at row index, column index: " + Arrays.toString(max2));
        System.out.println("Max Element value: " + doubleArray[max2[0]][max2[1]]); // displaying value held at max location
        System.out.println("The min elementis located at row index, column index: " + Arrays.toString(min2));
        System.out.println("Min Element value: " + doubleArray[min2[0]][min2[1]]); // displaying value held at min location
        System.out.println();
        
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
    public static int[][] intArray() {
        Random rand = new Random();
        int[][] array = new int[2][5];
        // fill array with random numbers
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }
    //method to fill double type 2d array with randomized values
    public static double[][] doubleArray() {
        Random rand = new Random();
        double[][] array = new double[2][5];
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
        System.out.println("Int 2D Array Elements: ");
        for(int i = 0; i < arrayParam.length; i++){
            System.out.print("[");
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
        System.out.println("Double 2D Array Elements: ");
        for(int i = 0; i < arrayParam.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayParam[i].length; j++)
                if(j < arrayParam[i].length -1)
                    System.out.print(arrayParam[i][j] + ", ");
                else
                    System.out.print(arrayParam[i][j]);
             System.out.println("]");
        }
    }
    public static void printRow(int[][] arrayParam) {
        // method to print 2d  array row by row
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++)
                System.out.print(arrayParam[i][j] + " ");
             System.out.println();
        }
    }
    public static void printColumn(int[][] arrayParam) {
        // method to print 2d array column by column
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam.length; j++)
                System.out.print(arrayParam[j][i] + " ");
             System.out.println();
        }
    }
}
