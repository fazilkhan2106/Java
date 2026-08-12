//Take two numbers and operator ( + , - , * , / ) and perform the operation using conditions.
package mypackage.If_Statements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        float num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        float num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("+, -, * , /");
        System.out.println("Enter the Symbol to perform the operations : ");
        String symbol = sc.nextLine();
        if(symbol.equals("+")){
            float sum = num1 + num2;
            System.out.println("The sum of two number is : " + sum);
        }else if (symbol.equals("-")) {
            float sub = num1 - num2;
            System.out.println("The sub of two number is : " + sub);
        }else if (symbol.equals("*")){
            float mul = num1 * num2;
            System.out.println("The multiplication of two number is : " +mul);
        }else if(symbol.equals("/")){
            if(num2 != 0){
                float div = num1 / num2;
            System.out.println("The divison of two number is : " + div);
            }else{
                System.out.println("Error : divivison by Zero is not possible ");
            }
        }else{
            System.out.println("Invalide operator");
        }
        sc.close();
    }
}
