package w_2_27;

import java.util.Scanner;

public class factorial {
   public static void main(String[] args)
   {
    int fact = 1;
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number :");
    int n = sc.nextInt();

    for(int i = 1; i <= n ;i++)
    {
        fact = fact*i;
    }

    System.out.println("Factorial is :" + fact);

    sc.close();
   }    
}
