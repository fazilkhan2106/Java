//Take a number and check whether it is between 10 and 50

package mypackage.If_Statements;

import java.util.Scanner;

public class NumberBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num >= 10 && num <= 50) {
            System.out.println(num + " is in the range of 10 and 50");
        }else{
            System.out.println(num + " is not in the range of 10 and 50 ");
        }
        sc.close();
    }
}
