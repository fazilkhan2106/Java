/* Sum of Elements
Find the sum of all numbers in an ArrayList<Integer>.

Example:
[10, 20, 30, 40]

Output:
Sum = 100 */

package mypackage.Array_List_;

import java.util.ArrayList;

public class SumOfElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }
}
