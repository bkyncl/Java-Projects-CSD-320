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
        int rng;
        int lng[] = new int[4]; // array to hold array data type variable based on user input
        int a,b,c,d; // variables to hold each data type for arrays

        // get desired length of arrays for each array data type
        System.out.println("Enter desired length of each array data type..."
                        + "\n1. Short"
                        + "\n2. Integer"
                        + "\n3. Long"
                        + "\n4. Double\n"); 
        for(int i = 0; i< lng.length; i ++){ // loop to take in user input for data type holder array
            System.out.print(i + 1 +": ");
            try{
                lng[i]= input.nextInt();
                if(lng[i] < 1){ // if less than 1 reset counter
                    i -= 1;
                }
            }
            catch (InputMismatchException e) { // exception on input
                input.nextLine();
                i -= 1; // reset counter
            }
        }
        a=lng[0]; // assign value at index of data type array to cooresponding variable
        b=lng[1]; // assign value at index of data type array to cooresponding variable
        c=lng[2]; // assign value at index of data type array to cooresponding variable
        d=lng[3]; // assign value at index of data type array to cooresponding variable

        // get array range for random generation
        while(true){
            System.out.print("Now enter desired range of array number generation. From 0 - ");
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
        // calling methods to generate random arrays parsing cooresponding array size and number gen. range
        short[] shortArray = Methods.randomShrtArray(a, rng);
        int[] intArray = Methods.randomIntArray(b, rng);
        long[] longArray = Methods.randomLongArray(c, rng);
        double[] doubleArray = Methods.randomDoubleArray(d, rng);

        Printing.printArray(shortArray); // printing short array
        // calling getaverage method and printing
        System.out.println("Short array AVG: " + Methods.getAverage(shortArray));
        Printing.printArray(intArray); // printing int array
        // calling getaverage method and printing
        System.out.println("Int array AVG: " + Methods.getAverage(intArray));
        Printing.printArray(longArray); // printing long array
        // calling getaverage method and printing
        System.out.println("Long array AVG: " + Methods.getAverage(longArray));
        Printing.printArray(doubleArray); // printing double array
        // calling getaverage method and printing
        System.out.println("Double array AVG: " + Methods.getAverage(doubleArray));
        System.out.println();

        input.close();
    }
}
class Methods { // methods class
    // get average of array
    public static double getAverage(short[] array){
        // finding the sum of all values inside array
        double sum = 0;
        for(short i: array){
            sum += i;
        }
        return sum / array.length; // return average
    }
    // get average of array
    public static double getAverage(int[] array){
        // finding the sum of all values inside array
        double sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum / array.length; // return average
    }
    // get average of array
    public static double getAverage(long[] array){
        // finding the sum of all values inside array
        double sum = 0;
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
    // method to generate random number using nextDouble() method of Random class
    public static double randomRange(int rng){
        return (
            new Random().nextDouble(rng + 1)
        );
    }
    // method to generate random number array
    public static short[] randomShrtArray(int lng, int rng){
        // short type array
        short[] shortArray = new short[lng]; // intializing array variable
        for(int i =0; i < shortArray.length; i++){ 
            shortArray[i] = (short) randomRange(rng);
        }
        return shortArray;
    }
    // method to generate random number array
    public static int[] randomIntArray(int lng, int rng){
        // int type array
        int[] intArray = new int [lng]; // intializing array variable
        for(int i =0; i < intArray.length; i++){ 
            intArray[i] = (int) randomRange(rng);
        }
        return intArray;
    }
    // method to generate random number array
    public static long[] randomLongArray(int lng, int rng){
        // int type array
        long[] longArray = new long [lng]; // intializing array variable
        for(int i =0; i < longArray.length; i++){ 
            longArray[i] = (long) randomRange(rng);
        }
        return longArray;
    }
    // method to generate random number array
    public static double[] randomDoubleArray(int lng, int rng){
        // int type array
        double[] doubleArray = new double [lng]; // intializing array variable
        for(int i =0; i < doubleArray.length; i++){ 
            doubleArray[i] = randomRange(rng);
        }
        return doubleArray;
    }
}
class Printing { // printing format class
    public static void printArray(short[] array){
        // method to print array contents
        System.out.println("\nShort Array contents...");
        for(short e: array) // foreach loop
            System.out.print(e + " ");
        System.out.println();
    }
    public static void printArray(int[] array){
        // method to print array contents
        System.out.println("\nInt Array contents...");
        for(int e: array) // foreach loop
            System.out.print(e + " ");
        System.out.println();
    }    
    public static void printArray(long[] array){
        // method to print array contents
        System.out.println("\nLong Array contents...");
        for(long e: array) // foreach loop
            System.out.print(e + " ");
        System.out.println();
    }
    public static void printArray(double[] array){
        // method to print array contents
        System.out.println("\nDouble Array contents...");
        for(double e: array) // foreach loop
            System.out.print(e + " ");
        System.out.println();
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