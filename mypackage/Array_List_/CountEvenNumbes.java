/* Count Even Numbers
Count how many even numbers are present.

Example:
[10, 15, 22, 7, 8, 13]

Output:
Even numbers = 3 */

package mypackage.Array_List_;

import java.util.ArrayList;

public class CountEvenNumbes {
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
            if(num % 2 == 0){
                count++;
            }
        }
        System.out.println("Even numbers = " + count);  
    }
}
