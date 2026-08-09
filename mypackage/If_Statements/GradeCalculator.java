/*Take Marks :
90 - 100 -> A+
80 - 89 -> A 
70 - 79 -> B
60 - 69 -> C
50 - 59 -> D
Below 50 -> F */
package mypackage.If_Statements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("A+");
        }else if (marks >= 80 && marks <= 89) {
            System.out.println("A");
        }else if (marks >= 70 && marks <= 79) {
            System.out.println("B");
        }else if (marks >= 60 && marks <= 69) {
            System.out.println("C");
        }else if (marks >= 50 && marks <= 59) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        sc.close();
    }
}
