/* Search for a Number
Ask the user for a number and check whether it exists in the ArrayList. */
package mypackage.Array_List_;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchForNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        if (nums.contains(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }
}
