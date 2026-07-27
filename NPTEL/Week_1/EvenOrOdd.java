// Check if the integer is odd or even
package Week_1;
import java.util.Scanner;

public class EvenOrOdd{
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
