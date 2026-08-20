/* . Count Odd Numbers
Count how many odd numbers are present. */
package mypackage.Array_List_;

import java.util.ArrayList;

public class CountOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(22);
        nums.add(7);
        nums.add(8);
        nums.add(13);

        int count = 0;

        for(int num : nums){
            if(num % 2 != 0){
                count++;
            }
        }
        System.out.println("Odd numbers = " + count);  

    }
}
