/* Find Largest
Find the largest number in an ArrayList<Integer>.

Example:
[12, 45, 7, 89, 23]

Output:
Largest = 89 */
package mypackage.Array_List_;

import java.util.ArrayList;

public class FindLargest {
    public static void main(String[] args) {
      ArrayList<Integer> nums = new  ArrayList<>();
      nums.add(12);
      nums.add(45);
      nums.add(7);
      nums.add(89);
      nums.add(23);
      int largest = nums.get(0);
      for(int num : nums){
        if(num > largest){
            largest = num;
        }
      }  
      System.out.println("The Largest element is : " + largest);
    }
}
