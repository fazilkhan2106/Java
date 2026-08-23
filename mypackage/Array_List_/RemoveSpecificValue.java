/* Remove a Specific Value

Given:
[10, 20, 10, 30, 10] */
package mypackage.Array_List_;

import java.util.ArrayList;

public class RemoveSpecificValue {
    public static void removeSpecificValue(ArrayList<Integer> nums, int target){
        for(int i = 0 ; i < nums.size(); i++){
            if(nums.get(i) == target){
                nums.remove(i);
                i--;
            }
        }
        System.out.println(nums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(10);
        removeSpecificValue(nums, 10);
    }
}
