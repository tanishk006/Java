package Week_1;// Multiplication table of a number upto 4

import java.util.Scanner;

public class TableOfNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 1; i <= 4; i++)
        {
            System.out.println("%d x %d = %d",number,i,number * i);
            if(i<4){
                System.out.println();
            }
        }


        in.close();
    }
}
