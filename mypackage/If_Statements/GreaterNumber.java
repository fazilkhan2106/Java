//Take two numbers and print which number is greater.

package mypackage.If_Statements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " First Number is the greates ");
        } else {
            System.out.println(num2 + " Second Number is the greates");
        }
        sc.close();
    }
}
