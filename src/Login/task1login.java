package Login;

import java.util.Scanner;

public class task1login {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int passwordLength = 25;
            int passwordLogin;
            System.out.println("Enter your login:");
            String login = scan.next();
            System.out.println("Enter your password:");
            String password = scan.next();
            int total = password.length();
            if(total<passwordLength)
            {
                System.out.println();
                System.out.println("1.Even number");
                System.out.println("2.Armstrong");
                System.out.println("3.Reverse");
                System.out.println("4.Fibonacci");
                System.out.println("5.Replace");
            } else {

                System.out.println("Invalid password");
            }

        }
    }

