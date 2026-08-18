/* . Add Elements
Create an ArrayList<String> and add:
"Java", "Python", "C++", "JavaScript"
Then print the list */
package mypackage.Array_List_;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("C++");
        programmingLanguage.add("JavaScript");

        for(String i : programmingLanguage){
            System.out.println(i);
        }
    }
}
