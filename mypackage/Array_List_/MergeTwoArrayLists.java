/* Merge Two ArrayList Merge Two lists into one list. */

package mypackage.Array_List_;

import java.util.ArrayList;

import java.util.List;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(20);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        List<Integer> mergeList = new ArrayList<>();
        for(int i : list1){
            mergeList.add(i);
        }

        for(int i : list2){
            mergeList.add(i);
        }

        System.out.println("Merge List = " + mergeList);
    }
}
