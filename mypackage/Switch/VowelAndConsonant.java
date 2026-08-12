/* Vowel or Consonant
Take a character (a, e, i, o, u) and use switch to determine whether it is a vowel or consonant */

package mypackage.Switch;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char character = sc.next().toLowerCase().charAt(0);
        
        switch (character) {
            case 'a','e','i', 'o','u':
                System.out.println("vowel");
                break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
                System.out.println("consonant");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
