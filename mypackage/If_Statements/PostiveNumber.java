//Take an integer and print "Positive or Negative" if the number is greater than 0.

package mypackage.If_Statements;

import java.util.Scanner;

public class PostiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int num = sc.nextInt();
        if(num  > 0){
            System.out.println(num + " Number is positive.");
        }else if(num < 0){
            System.out.println(num + " Number is Negative.");
        }else{
            System.out.println(num + " Number is Zero.");
        }
        sc.close();
    }
}
