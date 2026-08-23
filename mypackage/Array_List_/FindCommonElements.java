/* . Find Common Elements
Given:

list1 = [10, 20, 30, 40]
list2 = [20, 40, 50, 60]

Output:
[20, 40] */

package mypackage.Array_List_;

import java.util.ArrayList;

public class FindCommonElements {
    public static void findCommonElements(ArrayList<Integer> num1,ArrayList<Integer> num2){
        ArrayList<Integer> common = new ArrayList<>();
        for(int i = 0; i < num1.size(); i++){
            for(int j = 0; j < num2.size(); j++){
                if(num1.get( i).equals(num2.get(j))){
                    common.add(num1.get(i));
                }
            }
        }
        System.out.println(common);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(20);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        findCommonElements(list1, list2);
    }
}
