import java.util.*;


public class Practice {

	public static void main(String[] args) {

        List <Integer>  list = new ArrayList <Integer> ();
        Set <Integer> set = new HashSet <Integer> ();
        Integer intObject;
        for(int i = 0; i < 100; ++i){
            intObject = new Integer ((int) (Math.random() * 10 + 1));
            list.add(intObject);
            set.add(intObject);
        }
        System.out.println("List size = " + list.size()); 
        System.out.println("Set size = " + set.size());
        System.out.println();
        for(int e: list){
            System.out.print(e + " ");
        }
        System.out.println("\n");
        for(int e: set){
            System.out.print(e+ " ");
        }
        System.out.println();

        
        String s1 = "5";
        String s2 = "8";

        int intVar1 = 0;
        int intVar2 = 0;

        int n1 =1;
        int n2 =2;
        System.out.println("Before num1: " + n1 + " num2: " + n2);
        swap(n1, n2);
        System.out.println("After num1: " + n1 + " num2: " + n2);

        Practice.newLine(10);
        System.out.println(s1 +s2);
        System.out.println();

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        System.out.println();

        intVar1 = Integer.parseInt(s1);
        intVar2 = Integer.parseInt(s2);

        System.out.println(intVar1 +intVar2);

        System.out.println(Practice.grade(92));
        System.out.println(Practice.grade(88));
        System.out.println(Practice.grade(73));
        System.out.println(Practice.grade(68));
        System.out.println(Practice.grade(55));
        System.out.println(Practice.grade(0));

        System.out.println(Practice.largest(2, 3.423));
        System.out.println(Practice.largest(2.454, 3));
        System.out.println(Practice.largest(2.3453, 3.423));
        System.out.println(Practice.largest(4, 3.423));
        System.out.println(Practice.largest(4.454, 3));
        System.out.println(Practice.largest(4.34353, 3.423));
        System.out.println(Practice.largest(4,3));
        System.out.println(Practice.largest(2,3));

	}
    public static void swap(int n1, int n2){
        System.out.println("Inside swap n1: " + n1 + " n2: " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swap n1: " + n1 + " n2: " + n2);
    }
    public static double largest(int param1, int param2){
        return Practice.largest((double)param1, (double)param2);
    }
    public static double largest(int param1, double param2){
        return Practice.largest((double)param1, param2);
    }
    public static double largest(double param1, int param2){
        return Practice.largest(param1, (double)param2);
    }
    public static double largest(double param1, double param2){
        return (param1 > param2 ? param1 : param2); //ternary operator
    }
    public static char grade(int grade){

        if(grade >= 90){
            return 'A';
        }
        else if(grade >= 80 ){
            return 'B';
        }
        else if(grade >= 70 ){
            return 'C';
        }
        else if(grade >= 60 ){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void newLine(int linenum){
        for(int i = 1; i <= linenum; i++){
            System.out.println("-----" + i);
        }
    }
}



    //    while(true) {
    //     if (JOptionPane.showConfirmDialog(null, "Continue?") == JOptionPane.YES_OPTION){
    //         JOptionPane.showMessageDialog(null, "This program will continue...");
    //     }
    //     else{
    //         JOptionPane.showMessageDialog(null, "This program will end..");
    //         break;
    //     }
    //    }

    //    int row;
    //    int column;
    //    int space;
       
    //    for (row  = 1; row <= 6; row++){
    //     for(space = 6; space > row; space--){
    //         System.out.print("  ");
    //     }
    //         for (column = 1; column <= row; column++){
    //             System.out.print(column + " ");
    //         }
    //     System.out.println(" :  " + row);
    //    }

    //    for( int i = 0; i < 10; ++i){
    //         System.out.println("---------------------------------------------");

    //         for (int j = 0; j < 10; ++j){
    //             if ((i == (int) (Math.random() *3 + 1)) || (j == (int) (Math.random() *3 + 1))) {

    //                 //exit all the inner loop iterations
    //                 System.out.println("continue");
    //                 continue;
    //             }
    //             System.out.printf("i = %d, j = %d\n", i, j);
    //         }
    //    }

        // for (int i = 2; i < 4; i++){
        //     for (int j = 3; j < 5; j++){
        //         for (int k = 4; k < 7; k++){
        //             System.out.printf("%2d * %2d * %2d = %4d\n", i, j, k, (i *j *k));
        //         }
        //     }
        // }
        // System.out.println();

        // for (int i = 1; i < 10; i++){
        //     for (int j = 1; j < 10; j++) {
        //         System.out.printf("%4d", (i *j));
        //     }
        // System.out.println();
        // }

        // int i = 0;
        // do {
        //     i = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer to continue: "));
        //     System.out.printf("The value entered is %d\n", i);
        // } while (i > 0);
        // System.out.println("The program has ended");
