/* Calculator with Character Operator

Enter number: 20
Enter number: 5
Enter operator: *
Output: 100 */
package mypackage.Switch;

import java.util.Scanner;

public class CalculatorWithCharacterOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the frist number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter  operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Output : " + (num1 + num2));
                break;
            case '-':
                System.out.println("Outpur : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Output : " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Output : " + (num1 / num2));
                }else{
                    System.out.println("Divisble zero not possible");
                }
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}
