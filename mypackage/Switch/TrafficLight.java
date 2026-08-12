/* Traffic Signal
Take a character:

R → Red
Y → Yellow
G → Green */
package mypackage.Switch;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character R, Y, G : ");
        char charcater = sc.next().charAt(0);
        switch (charcater) {
            case 'R':
                System.out.println("Red");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'G':
                System.out.println("Green");    
                break;
            default:
                System.out.println("Invalid character.");
                break;
        }
        sc.close();
    }
}
