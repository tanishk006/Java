// Check if the integer is odd or even
import java.util.Scanner;

public class W01_p1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

      in.close();
    }
}
