/* Get_Array.java
 * Module 9 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.30.22
 * Course: CSD320
 * Program that reads and fills an array with 20 integers. Then using the array elements, calculates
 * the data to find and display...
 * 1. The highest value entered
 * 2. The lowest value entered
 * 3. The average of the numbers entered
 * 4. The sum of the numbers entered
 * */

import java.util.*;
public class Get_Array {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        final int n = 20; // set number of array elements

        System.out.println("Generate your own array(1) or use a randomly generated array(2)?");
    
        while(true){
            System.out.print("(1/2): ");
            try{
				int path = input.nextInt();
				if(path == 1){ // user generated array
                    int[] myList = new int[n]; // declaring user generated array variable
                    // populating array with user input values
                    System.out.println("Enter " + myList.length + " values: ");
                    for(int i =0; i < myList.length; i++){
                        myList[i] = input.nextInt();
                    }
                    System.out.println();
                    printArray(myList); // print array
                    System.out.println("Max value from array: " + getMax(myList));// getmax number method from array
                    System.out.println("Min Value from array: " + getMin(myList));// getmin number method from array
                    System.out.println("Average of array: " + averageArray(myList) );// getaverage method on array method
                    System.out.println("Sum of array: " + getSum(myList));// getsum method on array elements
                    System.out.println();
                    break;
				}
				else if(path == 2){ // randomly generated array
                    // call randomArray method to return and assign random numbers to array
                    int [] randoArray = randomArray(n);
                    System.out.println();
                    printArray(randoArray); // print array
                    System.out.println("Max value from array: " + getMax(randoArray));// getmax number method from array
                    System.out.println("Min Value from array: " + getMin(randoArray));// getmin number method from array
                    System.out.println("Average of array: " + averageArray(randoArray) );// getaverage method on array method
                    System.out.println("Sum of array: " + getSum(randoArray));// getsum method on array elements
                    System.out.println();
                    break;
				}else{ // number out of range
					continue;
				}
			}
			catch (InputMismatchException e) { // exception on input
				input.nextLine();
				System.out.println("Invalid Input.");
			}
        }
        input.close();

    }
    public static double averageArray(int[] array){
        // finding average of numbers inside array
        double sum = getSum(array);
        return sum / array.length;
    }
    public static double getMax(int[] array){
        // finding the highest value inside array
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max) 
                max = array[i];
        }
        return max;
    }
    public static double getMin(int[] array){
        // finding the lowest value inside array
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static double getSum(int[] array){
        // finding the sum of all values inside array
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void printArray(int[] array){
        // method to print array contents
        System.out.println("Array contents...");
        for(int e: array) // foreach loop
            System.out.print(e + " ");
        System.out.println("\n");
    }
    public static int[] randomArray(int n){
        // method to initialize array with random numbers 1 - 20
        int[] array = new int[n]; // declaring array variable
        for(int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * 20);
        }
        return array;
    }
}

