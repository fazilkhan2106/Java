/* Number to Word
Take a number 1–5 and print it in words.

1 → One
2 → Two
etc. */

package mypackage.Switch;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;            
            default:
                System.out.println("Invalid Number");
                break;
        }
        sc.close();
    }
}
