/* Arithmetic Operation
Ask the user to select:

1. Addition
2. Subtraction
3. Multiplication
4. Modulus */


package mypackage.Switch;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Enter your choice : ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Modulus");
        System.out.println("5.Exit");
        int choice = sc.nextInt();
        if(choice == 5){
            System.out.println("Exiting...");
            sc.close();
            return;
        }
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Sum : " +result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Difference : " +result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("product : " + result );
                break;
            case 4:
                if(num2 != 0){
                    result = (float)num1 / num2;
                    System.out.println("Quotient : " + result);
                }else{
                    System.out.println("divisible by Zero not possible");
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        
        }
        

    }
}
