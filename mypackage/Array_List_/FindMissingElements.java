package mypackage.Array_List_;

import java.util.ArrayList;

public class FindMissingElements {
    public static void findMissingElements(ArrayList<Integer> nums){
        int n  = nums.size() + 1;
        int excepteSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int i : nums){
            actualSum += i;
        }
        int missingNumber = excepteSum - actualSum;
        System.out.println("Missing element  is : " + missingNumber);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        findMissingElements(nums);
    }
}
