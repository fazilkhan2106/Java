/* 15. Remove All Even Numbers
Given:
[10, 15, 20, 25, 30, 35]

Remove all even numbers.

Expected:
[15, 25, 35] */

package mypackage.Array_List_;

import java.util.ArrayList;

public class RemoveAllEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);
        nums.add(30);
        nums.add(35);
        /*for(int i = nums.size()-1; i >= 0; i--){
            if(nums.get(i) % 2 == 0){
                nums.remove(i);
            }
        }
        System.out.println(nums); */
        for(int i = 0; i < nums.size() ; i++){
            if(nums.get(i) % 2 == 0){
                nums.remove(i);
                i--;
            }
        }
        System.out.println(nums);

    }
}
