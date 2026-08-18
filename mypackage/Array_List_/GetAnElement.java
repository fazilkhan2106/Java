/* Get an Element
Create an ArrayList<Integer> with 10, 20, 30, 40, 50. Print the element at index 2. */

package mypackage.Array_List_;

import java.util.ArrayList;

public class GetAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.get(2));
    }
}
