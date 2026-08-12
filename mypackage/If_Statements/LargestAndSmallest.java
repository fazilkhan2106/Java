/* Take three numbers and point:
 Largest
 Smallest */
package mypackage.If_Statements;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " First Number is the largest.");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Second Number is the largest.");
        }else{
            System.out.println(num3 + " Third Number is the largest.");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " First number is the smallest.");
        }else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " Second number is the smallest.");
        }else{
            System.out.println(num3 + " Third number is the smallest.");
        }
        sc.close();
    }
}
