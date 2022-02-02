package Tasks;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        for (int i = 6; i < 56; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

        }
