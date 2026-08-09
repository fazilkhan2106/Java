//Take marks if marks are 40 or above print "Pass" otherwise "Fail"

package mypackage.If_Statements;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks = sc.nextInt();
        if(marks >= 40){
            System.out.println(marks + " Pass ");
        }else{
            System.out.println(marks + " Fail ");
        }
        sc.close();
    }
}
