/* Array_Overload.java
 * Module 10 Assignment 
 * Name: Brittany Kyncl
 * Date: 11.30.22
 * Course: CSD320
 * Four overloaded methods that return the average of an array with the following headers..
 * 1. public static short average(short [] array)
 * 2. public static int average(int [] array)
 * 3. public static long average(long [] array)
 * 4. public static double average(double [] array)
 * Write a test program that invokes each method and displays the average value returned along
 * with the original array elements. Each array sent into the methods must be different sizes to ensure
 * the method code is correctly written
 * */
import java.util.*;
public class Array_Overload {
    public static void main(String[] args){

        // output test
        Test.outputTest();
        Scanner input = new Scanner(System.in);
        Random rn = new Random();
        int rng;

        // get array range for random generation
        while(true){
            System.out.print("Enter desired range of array number generation. From 0 - ");
            try{
                rng = input.nextInt(); // store array range 
                if(rng < 0){
                    continue;
                }
                break;
            }
            catch (InputMismatchException e) { // exception on input
                input.nextLine();
            }
        }
        // declaring short, int, long, and double type arrays of various size
        short[] shortArray = new short[rn.nextInt(15-3)+3];
        Methods.fillArray(shortArray, rng); //initializing array with random numbers
        int[] intArray = new int[rn.nextInt(15-3)+3];
        Methods.fillArray(intArray, rng); //initializing array with random numbers
        long[] longArray = new long[rn.nextInt(15-3)+3];
        Methods.fillArray(longArray, rng); //initializing array with random numbers
        double[] doubleArray = new double[rn.nextInt(15-3)+3];
        Methods.fillArray(doubleArray, rng); //initializing array with random numbers

        //printing and displayilng average returned from getAverage method for shortArray
        System.out.println();
        System.out.println("Short Array: \n" + Arrays.toString(shortArray));
        System.out.println("Short array AVG: " + Methods.getAverage(shortArray));
        System.out.println();
        //printing and displayilng average returned from getAverage method for intArray
        System.out.println("Int Array: \n" + Arrays.toString(intArray));
        System.out.println("Int array AVG: " + Methods.getAverage(intArray));
        System.out.println();
        //printing and displayilng average returned from getAverage method for longArray
        System.out.println("Long Array: \n" + Arrays.toString(longArray));
        System.out.println("Long array AVG: " + Methods.getAverage(longArray));
        System.out.println();
        //printing and displayilng average returned from getAverage method for doubleArray
        System.out.println("Double Array: \n" + Arrays.toString(doubleArray));
        System.out.println("Double array AVG: " + Methods.getAverage(doubleArray));
        System.out.println();

        input.close();
    }
}
class Methods { // methods class
    // get average of array
    public static short getAverage(short[] array){
        // finding the sum of all values inside array
        short sum = 0;
        for(short i: array){
            sum += i;
        }
        return (short) (sum / array.length); // return average
    }
    // get average of array
    public static int getAverage(int[] array){
        // finding the sum of all values inside array
        int sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum / array.length; // return average
    }
    // get average of array
    public static long getAverage(long[] array){
        // finding the sum of all values inside array
        long sum = 0;
        for(long i: array){
            sum += i;
        }
        return sum / array.length; // return average
    }
    // get average of array
    public static double getAverage(double[] array){
        // finding the sum of all values inside array
        double sum = 0;
        for(double i: array){
            sum += i;
        }
        return sum / array.length; // return average
    }
    // method to fill array
    public static void fillArray(short[] shortArray, int rng){
        // fill short type array
        for(int i =0; i < shortArray.length; i++){ 
            shortArray[i] = (short) (Math.random() * rng);
        }
    }
    // method to fill array
    public static void fillArray(int[] intArray, int rng){
        // fill int type array
        for(int i =0; i < intArray.length; i++){ 
            intArray[i] = (int) (Math.random() * rng);
        }
    }
    // method to fill array
    public static void fillArray(long[] longArray, int rng){
        // fill long type array
        for(int i =0; i < longArray.length; i++){ 
            longArray[i] = (long) (Math.random() * rng);
        }
    }
    // method to fill array
    public static void fillArray(double[] doubleArray, int rng){
        // fill double type array
        for(int i =0; i < doubleArray.length; i++){ 
            doubleArray[i] = (double) (Math.random() * rng);
        }
    }
}
class Test { // output test class
    public static void outputTest(){
        // short type array
        short[] shortArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}; // intializing array variable

        // int type array
        int[] intArray = {1,2,3,4,5,6,7,8,9,10}; // intializing array variable

        // long type array
        long[] longArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14}; // intializing array variable

        // double type array
        double[] doubleArray = {1,2,3,4,5,6,7}; // intializing array variable

        // output test parsing different arrays to overloaded getaverage method
        System.out.println("\n-----------Output Test-----------");
        System.out.println("Short Array: \n" + Arrays.toString(shortArray));
        System.out.println("Short array AVG: " + Methods.getAverage(shortArray));
        System.out.println("Int Array: \n" + Arrays.toString(intArray));
        System.out.println("Int array AVG: " + Methods.getAverage(intArray));
        System.out.println("Long Array: \n" + Arrays.toString(longArray));
        System.out.println("Long array AVG: " + Methods.getAverage(longArray));
        System.out.println("Double Array: \n" + Arrays.toString(doubleArray));
        System.out.println("Double array AVG: " + Methods.getAverage(doubleArray));
        System.out.println("-----------Output Test-----------\n");
    }
}