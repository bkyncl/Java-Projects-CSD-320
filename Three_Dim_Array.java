/* Three_Dim_Array.java
 * Name: Brittany Kyncl
 * Date: 12.7.22
 * Course: CSD320
 * Return locations of largets and smallest element of three dimensional arrays passsed to method
 * returning one dimensional array with indices of element location.
 */

import java.util.*;

public class Three_Dim_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // function message
        System.out.println("\nDisplaying three dimensional arrays and the indices of the min/max element locations..\n");
     
        int numberOfSides, numberOfRows, numberOfColumns; // vars to hold user inputs
        // promting user for 3d array num of sides,rows, and columns
        System.out.print("Enter number of sides: ");
        numberOfSides = input.nextInt();
        System.out.print("Enter number of rows: ");
        numberOfRows = input.nextInt();
        System.out.print("Enter number of columns: ");
        numberOfColumns = input.nextInt();

        //declaring and filling int and double type 3d arrays parsing user input to fill methods
        int[][][] intArray = intArray(numberOfSides,numberOfRows,numberOfColumns);
        double[][][] doubleArray = doubleArray(numberOfSides,numberOfRows,numberOfColumns);

        // declaring arrays to hold indices of largest element location returned from method
        int[] max = locateLargest(intArray); 
        // declaring array to hold indices of smallest element location returned from method
        int[] min = locateSmallest(intArray);

        // declaring arrays to hold indices of largest element location returned from method
        int[] max1 = locateLargest(doubleArray); 
        // declaring array to hold indices of smallest element location returned from method
        int[] min1 = locateSmallest(doubleArray);

        System.out.println("\nInt 3D Array");
        printArray(intArray); // printing contents

        // displaying int 3d array results
        System.out.println("The max element is located on side index, at row index, column index: " + Arrays.toString(max));
        System.out.println("Max Element value: " + intArray[max[0]][max[1]][max[2]]); // displaying value held at max location
        System.out.println("The min element is located on side index, at row index, column index: " + Arrays.toString(min));
        System.out.println("Min Element value: " + intArray[min[0]][min[1]][min[2]]); // displaying value held at min location
        System.out.println();

        
        System.out.println("\nDouble 3D Array");
        printArray(doubleArray); // printing contents

        // displaying int 3d array results
        System.out.println("The max element is located on side index, at row index, column index: " + Arrays.toString(max1));
        System.out.println("Max Element value: " + doubleArray[max1[0]][max1[1]][max1[2]]); // displaying value held at max location
        System.out.println("The min element is located on side index, at row index, column index: " + Arrays.toString(min1));
        System.out.println("Min Element value: " + doubleArray[min1[0]][min1[1]][min1[2]]); // displaying value held at min location
        System.out.println();

        input.close();
    }
    // method to fill 3D array with random numbers 1-10 with params for # of sides/rows/colums
    public static int[][][] intArray(int x, int y, int z){
        int[][][] array = new int [x][y][z];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = (int)(Math.random() * 10 + 1);
                }
            }
        }
        return array;
    }
    // method to fill 3D array with random numbers 1-10 with params for # of sides/rows/colums
    public static double[][][] doubleArray(int x, int y, int z){
        double[][][] array = new double [x][y][z];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = (double)(Math.random() * 10 + 1);
                }
            }
        }
        return array;
    }
    // method to return location of largets value of 3D array paramenter
    public static int[] locateLargest(double[][][] arrayParam) {
        int max[]= {0,0,0}; // max array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				for(int k=0;k<arrayParam[i][j].length; k++){
                    if(arrayParam[i][j][k]>arrayParam[max[0]][max[1]][max[2]]) {
                        max[0]=i;
                        max[1]=j;
                        max[2]=k;
                    }
                }
			}
		}
		return max;
    } 
    // method to return location of largets value of 3D array paramenter
    public static int[] locateLargest(int[][][] arrayParam) {
        int max[]= {0,0,0}; // max array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				for(int k=0;k<arrayParam[i][j].length; k++){
                    if(arrayParam[i][j][k]>arrayParam[max[0]][max[1]][max[2]]) {
                        max[0]=i;
                        max[1]=j;
                        max[2]=k;
                    }
                }
			}
		}
		return max;
    } 
    // method to return location of smallest value of 3D array parameter
    public static int[] locateSmallest(double[][][] arrayParam) {
        int min[]= {0,0,0}; // min array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				for(int k=0;k<arrayParam[i][j].length; k++){
                    if(arrayParam[i][j][k]<arrayParam[min[0]][min[1]][min[2]]) {
                        min[0]=i;
                        min[1]=j;
                        min[2]=k;
                    }
                }
			}
		}
		return min;
    } 
    // method to return location of smallest value of 3D array parameter
    public static int[] locateSmallest(int[][][] arrayParam) {
        int min[]= {0,0,0}; // min array to hold indices
		for(int i=0;i<arrayParam.length;i++) {
			for(int j=0;j<arrayParam[i].length;j++) {
				for(int k=0;k<arrayParam[i][j].length; k++){
                    if(arrayParam[i][j][k]<arrayParam[min[0]][min[1]][min[2]]) {
                        min[0]=i;
                        min[1]=j;
                        min[2]=k;
                    }
                }
			}
		}
		return min;
    } 
    // method to print elements in 3D array
    public static void printArray(int[][][] arrayParam){
        for(int i = 0; i < arrayParam.length; i++){
            System.out.println("---------------------------------------");
            System.out.println("Side " + i);
            System.out.println("---------------------------------------");
            for(int j = 0; j < arrayParam[i].length; j++){
                System.out.print("Row " + j + " | ");
                for(int k = 0; k < arrayParam[i][j].length; k++){
                    System.out.print(arrayParam[i][j][k] + " ");
                }System.out.println();
            }System.out.println();
        }
    }
    // method to print elements in 3D array
    public static void printArray(double[][][] arrayParam){
        for(int i = 0; i < arrayParam.length; i++){
            System.out.println("---------------------------------------");
            System.out.println("Side " + i);
            System.out.println("---------------------------------------");
            for(int j = 0; j < arrayParam[i].length; j++){
                System.out.print("Row " + j + " | ");
                for(int k = 0; k < arrayParam[i][j].length; k++){
                    System.out.print(arrayParam[i][j][k] + " ");
                }System.out.println();
            }System.out.println();
        }
    }
}
