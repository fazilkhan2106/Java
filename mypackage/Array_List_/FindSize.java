/* Find Size
Create an ArrayList<String> containing 5 names. Print the size of the list. */
package mypackage.Array_List_;

import java.util.ArrayList;

public class FindSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rai");
        names.add("Kai");
        names.add("Tyson");
        names.add("Max");
        names.add("Leo");
        System.out.println(names.size());
    }
}
