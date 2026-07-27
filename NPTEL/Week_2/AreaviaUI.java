// Write a program to find Area of a rectangle taking length and width from user

package Week_2;

import java.util.Scanner;

public class AreaviaUI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
        int area;

        area = length * width;

        System.out.println("Area :"+ area);

        sc.close();

    }
}