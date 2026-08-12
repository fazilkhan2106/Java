/* Grade Description
Take a grade (A, B, C, D, F) and print:

A → Excellent
B → Very Good
etc. */

package mypackage.Switch;

import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade : ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent.");
                break;
            case 'B':
                System.out.println("Very Good.");
                break;
            case 'C':
                System.out.println("Good.");    
                break;
            case 'D':
                System.out.println("Ok.");
                break;
            case 'F':
                System.out.println("Bad.");        
                break;
            default:
                System.out.println("Invalid Grade.");
                break;
        }
        sc.close();
    }
}
