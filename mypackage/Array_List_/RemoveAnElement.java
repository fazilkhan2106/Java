/* Remove an Element
Create an ArrayList<Integer> containing 10, 20, 30, 40, 50. Remove 30. */

package mypackage.Array_List_;

import java.util.ArrayList;

public class RemoveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.remove(Integer.valueOf(30));
        System.out.println(nums);
        //nums.remove(3);
        System.out.println(nums);
    }
}
