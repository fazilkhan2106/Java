/* Days in a Month
Take a month number and print the number of days. */

package mypackage.Switch;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month Number (1-12) : ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January has 31");
                break;
            case 2: 
                System.out.println("February has 28/29");
                break;
            case 3:
                System.out.println("March has 31");
                break;
            case 4: 
                System.out.println("April has 30");
                break;
            case 5:
                System.out.println("May has 31");
                break;
            case 6: 
                System.out.println("June has 30");
                break;
            case 7: 
                System.out.println("July has 31");
                break;
            case 8:
                System.out.println("August has 31"); 
                break;
            case 9: 
                System.out.println("September has 30");
                break;
            case 10: 
                System.out.println("October has 31");
                break;
            case 11:
                System.out.println("November has 30");
                break;
            case 12:
                System.out.println("December has 31");
                break;                   
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
