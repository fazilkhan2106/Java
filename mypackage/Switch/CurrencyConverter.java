/* Currency Converter
Ask the user to choose:

1. USD to INR
2. EUR to INR
3. GBP to INR */

package mypackage.Switch;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice : ");
            System.out.println("1.USD to INR");
            System.out.println("2.EUR to INR");
            System.out.println("3.GBP to INR");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            
            if(choice == 4){
                System.out.println("Exiting....");
                sc.close();
                return;
            }
            double rupees;
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of dollar: ");
                    double dollar = sc.nextDouble();
                    rupees = dollar * 95.36;
                    System.out.println( dollar + " USD = " + rupees  + " INR");
                    break;
                case 2:
                    System.out.println("enter the number of euro : ");
                    double euro = sc.nextDouble();
                    rupees = euro * 109.99;
                    System.out.println( euro + " EUR = " + rupees  + " INR");
                    break;
                case 3:
                    System.out.println("Enter the British Pound: ");
                    double pound = sc.nextDouble();
                    rupees = pound * 128.92;
                    System.out.println( pound + " GBP = " + rupees  + " INR");
                    break;
                default:
                    System.out.println("Invalid Input, please try again");
                    break;
            }
        }
        
    }
}
