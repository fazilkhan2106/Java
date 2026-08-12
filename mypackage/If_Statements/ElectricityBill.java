/*Take Units
0 - 100 -> Rs.5 per unit
101 - 200 -> Rs.7 per unit
Above 200 -> Rs.10 per unit
 */
package mypackage.If_Statements;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units : ");
        int unit = sc.nextInt();
        if (unit >= 0 && unit <= 100) {
            System.out.println(" Rs.5  per unit.");
        }else if (unit >= 101 && unit <= 200) {
            System.out.println(" Rs.7 per unit");
        }else{
            System.out.println("Rs.10 per unit.");
        }
        sc.close();
    }
}
