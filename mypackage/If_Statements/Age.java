//Take a person's age and print "Adult" if the age is 18 or above.

package mypackage.If_Statements;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println(age + " is Adult.");
        }else{
            System.out.println(age + " is not Adult.");
        }
        sc.close();
    }
}
