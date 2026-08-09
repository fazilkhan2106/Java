/* Take age : 
    0 - 12 -> Child
    13 - 19 -> Teenager
    20 - 59 -> Adult 
    60+ -> Senior Citizen
 */

package mypackage.If_Statements;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if(age >= 0 && age <= 12){
            System.out.println(age + " Child");
        }else if(age >= 13 && age <= 19){
            System.out.println( age  + " Teenager");
        }else if(age >= 20 && age <= 59){
            System.out.println("Adult");
        }else if(age >=60 && age <= 110){
            System.out.println("senior Citizen");
        }
        sc.close();
    }
}
