//Take an integer and print whether it is "Even or Odd"

package mypackage.If_Statements;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
        sc.close();
    }
}
