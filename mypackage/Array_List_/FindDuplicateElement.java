/* 17. Find Duplicate Elements
Given:
[10, 20, 10, 30, 20, 40]

Print:
10
20 */
package mypackage.Array_List_;

import java.util.ArrayList;

public class FindDuplicateElement {
    public static void duplicateElements(ArrayList<Integer> nums){
        for(int i = 0; i < nums.size(); i++){
            for(int j = i +1; j < nums.size(); j++){
                if(nums.get(i).equals(nums.get(j))){
                    System.out.println(nums.get(i));
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        duplicateElements(nums);
        
    }
}
