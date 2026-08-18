/* Print Using Loop
Create an ArrayList<Integer> containing 1 to 10 and print every element using a for loop. */
package mypackage.Array_List_;

import java.util.ArrayList;

public class PrintUsingLoop {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        for(int i = 1; i <= nums.size(); i++){
            System.out.println(i);
        }
    }
}
