package Tasks;
import java.util.Scanner;

public class Armstrong {

    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for checking Armstrong number");
        int number = scanner.nextInt();
        int numberone =number;
        int NumberTwo = number;
        int count = 0, result = 0;
        while (numberone != 0) {
            count++;
            numberone /= 10;
        }
        for(int i = 0; i <= count; i++){
            int num = number % 10;
            result += Math.pow(num,count);
            number /= 10;
        }
        String results = (result == NumberTwo) ? "Number " + NumberTwo + " is Armstrong" : "Number " + NumberTwo + " is not Armstrong";
        System.out.println(results);
    }
}






