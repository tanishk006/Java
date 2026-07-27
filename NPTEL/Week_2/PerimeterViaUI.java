// write a program to find the perimeter of a rectangle
// by taking length and width as user input

package Week_2;

import java.util.Scanner;

public class PerimeterViaUI {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int length = sc.nextInt();
         int width = sc.nextInt();

         int perimeter = 2 * (length + width);

         System.out.println("Perimeter is:" + perimeter);

         sc.close();
     }
}
