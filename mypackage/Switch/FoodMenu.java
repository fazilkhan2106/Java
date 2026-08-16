
/* Food Menu
Display a menu:

1. Burger
2. Pizza
3. Sandwich
4. Pasta */
package mypackage.Switch;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Food Menu ");
        System.out.println("Enter your choice : ");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Sandwich");
        System.out.println("4. Pasta");
        System.out.println("5. Exit");
        int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting...");
                sc.close();
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("1 Burger cost of 150");
                    break;
                case 2:
                    System.out.println("1 Pizza cost of 200");
                    break;
                case 3:
                    System.out.println("1 Sandwich cost of 100");
                    break;
                case 4:
                    System.out.println("1 Pasta cost of 150");
                    break;

                default:
                    System.out.println("Invalid Input, please try again");
                    break;
            }
        }
       
    }
}
