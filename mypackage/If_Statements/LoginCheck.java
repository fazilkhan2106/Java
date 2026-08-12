//Store a username and password. check whether both are correct.

package mypackage.If_Statements;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String s_name = "Fazil khan";
        String s_password = "@1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name : ");
        String name = sc.nextLine();
        System.out.println("Enter the password : ");
        String password = sc.nextLine();
        if(s_name.equals(name) && s_password.equals(password)){
            System.out.println("Login Successfull..");
        }else{
            System.out.println("incorrect password.");
        }
        sc.close();
    }
}
