package W_1_25;

import java.util.Scanner;

public class EOp2
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int Uinput = 0;
         System.out.println("Enter 5 numbers");

         for(int i = 0; i < 5;i++)
         {
             System.out.print("Enter numbers"+(i+1)+":");
                 Uinput = sc.nextInt();

             if(Uinput%2==0)
             {
                 System.out.println(Uinput +" is Even");
             }
             else{
                 System.out.println(Uinput +" is Odd");
             }


         }
        sc.close();
    }

}