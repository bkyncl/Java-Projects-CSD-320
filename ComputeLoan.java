import java.util.Scanner; // scanner is in the java.util package

public class ComputeLoan {


    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner (System.in);

        // annual interest rate in %
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        

        // number of years
        System.out.print("Enter number of years: ");
        double numberYears = input.nextDouble();

        // loan amount
        System.out.print("Enter loan ammount: ");
        double loanAmount = input.nextDouble();

        // calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / 
        ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberYears * 12));
        // calculate total payment over years
        double totalPayment = monthlyPayment * numberYears * 12;

        // display results
        // monthly payment is rounded up 2 dec places to round down <(monthlyPayment * 100) / 100.0>
        System.out.println("Monthly payment: $" + (int) (monthlyPayment * 100 + 0.5) / 100.0); 
        // totaly payment is rounded up 2 dec to round down <(totalPayment * 100) / 100.0>
        System.out.println("Total payment after " + numberYears + " is: $" + (int) (totalPayment * 100 + 0.5) / 100.0);

        input.close();

    }
}
