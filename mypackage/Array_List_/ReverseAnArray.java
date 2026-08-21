/* Reverse an ArrayList
Given:
[10, 20, 30, 40, 50] */

package mypackage.Array_List_;

import java.util.ArrayList;

public class ReverseAnArray {

    public static void reverseArray(ArrayList<Integer> nums){
        int start = 0;
        int end = nums.size()-1;
        while(start < end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end,temp);
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        reverseArray(nums);
        System.out.println(nums);
    }
}
