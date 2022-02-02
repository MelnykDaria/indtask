package Tasks;
import java.util.Scanner;

public class Replace {

        public  static void main(String[] args)
   {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hint, replace o = 0 and a = @: \n Enter text below: ");
            String text = scanner.next();
            text = (text.length() <= 30) ? text.replace('o','0').replace('a','@'):"Length text more 30";
            System.out.println(text);
        }
    }

