/* Find Second Largest
Given:
[10, 50, 20, 80, 40]

Output:
Second largest = 50 */
package mypackage.Array_List_;

import java.util.ArrayList;

public class SecondLargest {

    public static int secondLargest(ArrayList<Integer> nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }else if (i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(50);
        nums.add(20);
        nums.add(80);
        nums.add(40);
        System.out.println(secondLargest(nums));
    }
}
