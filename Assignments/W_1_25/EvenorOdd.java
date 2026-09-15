package W_1_25;

import java.util.Scanner;

public class EvenorOdd
{
    public static void main(String[] args)
    {
              System.out.println("Enter the number :");
                Scanner in = new Scanner(System.in);
                int number = in.nextInt();

               

                if (number % 2 == 0) {
                    System.out.println(number + " is Even");
                }
                else
                {
                    System.out.println(number + " is Odd");
                }

                in.close();

    }
}
