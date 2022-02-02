package Tasks;

import java.util.Scanner;
import java.lang.String;

public class reverse
{
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for reverse: ");
        String text = scanner.next();
        String  action = " ";
        for(int i = 0; i < text.length(); i++) {
            action = text.charAt(i) + action;
        }
        System.out.print(action);
    }
}

