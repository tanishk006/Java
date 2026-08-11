package W_1_25;

import java.util.Scanner;
import java.util.Arrays;

public class EOp3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

       int[] evens = new int[5];
       int[] odds = new int[5];

       int input;

       int eveni =0;
       int oddi =0;

       for(int i = 0 ; i < 5 ;i++)
       {
           input = sc.nextInt();

           if(input%2==0)
           {
               evens[eveni] = input;
               eveni++;
           }
           else{
               odds[oddi] = input;
               oddi++;
           }
       }
        System.out.println("Even "+ Arrays.toString(evens));
        System.out.println("Odd "+ Arrays.toString(odds));


        sc.close();
    }

}