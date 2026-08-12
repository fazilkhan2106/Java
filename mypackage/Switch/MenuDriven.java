/* Menu Driven Program 
Display 
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit*/
package mypackage.Switch;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Menu Driven Program : ");
            System.out.println("1. Add");
            System.out.println("2. subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            
            System.out.println("Enter a number : ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                sc.close();
                return;
            }
            System.out.println("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number : ");
            int num2 = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition");
                    int sum = num1 + num2;
                    System.out.println("Sum : " + sum);
                    break;
                case 2:
                    System.out.println("Subtraction");
                    int sub = num1 - num2;
                    System.out.println("Sub : " + sub);
                    break;
                case 3: 
                    System.out.println("Multiply");
                    int mul = num1 * num2;
                    System.out.println("Product : " + mul);   
                    break;
                case 4: 
                    System.out.println("Division");
                    if (num2 !=0) {
                        float div = (float) num1 / num2;
                        System.out.println("Divisor : " + div);
                    }else{
                        System.out.println("Divisible zero not possible");
                    } 
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        
    }

}
