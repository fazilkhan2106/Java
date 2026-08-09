//Take three Numbers and print the largest number.

package mypackage.If_Statements;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :  ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number : ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " First number is the largest.");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Second number is the largest.");
        }else{
            System.out.println(num3 + " Third number is the largest.");
        }
        sc.close();
    }
}
