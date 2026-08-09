/*Take temperature 
Above 35 -> "Hot"
20 - 30 -> "Normal"
Below 20 -> "Cold"
 */

package mypackage.If_Statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperatue : ");
        int temperature = sc.nextInt();
        if(temperature > 35){
            System.out.println("Hot");
        }else if (temperature > 20 && temperature < 35) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        sc.close();
    }
}
