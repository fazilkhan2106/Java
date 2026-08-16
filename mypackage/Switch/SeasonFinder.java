/* Season Finder
Take a month number and print the season. */

package mypackage.Switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month Number (1-12) : ");
        int month = sc.nextInt();
        switch (month) {
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn(Fall)");
                break;
            case 12,1,2:
                System.out.println("Winter");
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
