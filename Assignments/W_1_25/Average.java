package W_1_25;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
         int totals = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
          for(int i = 0 ; i < 5 ; i++)
          {
            System.out.print("Enter number "+i+":");

            int inputn = sc.nextInt();
            totals += inputn;


          }

          double avg = totals / 5;

          System.out.print("The average is =" + avg);

          sc.close();
    }
}