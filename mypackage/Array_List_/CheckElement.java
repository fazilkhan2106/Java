/* Check Element
Create an ArrayList<Integer> and check whether 50 exists in the list. */

package mypackage.Array_List_;

import java.util.ArrayList;

public class CheckElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        if(numbers.contains(50)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
