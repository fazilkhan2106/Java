/* Simple Calculator
Take two numbers and an operator (+, -, *, /) and perform the operation */

package mypackage.Switch;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 +" number is : " + sum);
                break;
            case '-':
                int sub = num1 - num2;
                System.out.println("The sub of " + num1 + " and " + num2 +" number is : " +sub);
                break;
            case '*':
                float mul = num1 * num2;
                System.out.println("The multiplication of " + num1 + " and " + num2 +" number is : " +mul);    
                break;
            case '/':
                if(num2 != 0){
                    float div = (float) num1 / num2;
                    System.out.println("The divison of " + num1 + " and " + num2 +"  number is : " +div);
                    break;
                }else{
                    System.out.println("Divisible by Zero is not possible");
                    break;
                } 
            default:
                System.out.println("Invalid operator.");
                break;
        }
        sc.close();
    }
}
