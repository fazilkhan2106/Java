/* 11. Find Smallest
Find the smallest number in an ArrayList<Integer> */

package mypackage.Array_List_;

import java.util.ArrayList;

public class FindSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(40);
        nums.add(20);
        nums.add(2);
        nums.add(30);
        int smallest = nums.get(0);
        for(int num :  nums){
            if(num < smallest){
                smallest = num;
            }
        }
        System.out.println("The smallest element is : " + smallest);
    }
}
