package Week_2;

import java.util.Scanner;

static class Rectangle {
    int length;
   int  width;
}

pubic static void main(String[] args)
{
    scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int w = sc.nextInt();

    Rectangle rect = new Rectangle();
 
    rect.length = l;
    rect.width = w ;

    int sum = rect.length + rect.width ; 

    System.out.println("Sum of length and width is: "+ sum);

    sc.close();
}