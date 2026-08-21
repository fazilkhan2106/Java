/* Separate Even and Odd
Given:
[10, 15, 20, 25, 30, 35]

Create two ArrayLists:

Even = [10, 20, 30]
Odd = [15, 25, 35] */
package mypackage.Array_List_;

import java.util.ArrayList;

public class SeparateEvenAndOdd {
    public static void separateEven(ArrayList<Integer> nums){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i : nums){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);
        nums.add(30);
        nums.add(35);
        separateEven(nums);
    }
}
