/* Update an Element
Create an ArrayList<String> containing:
"Apple", "Banana", "Mango", "Orange"
Change "Banana" to "Grapes". */

package mypackage.Array_List_;

import java.util.ArrayList;

public class UpdateAnElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Before updating the element : " +fruits);
        fruits.set(1, "Grapes");
        System.out.println("After updating the element : " +fruits);
    }
}
