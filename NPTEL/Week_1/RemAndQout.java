package Week_1;

// Find Remainder and Qoutient using user input
import java.util.Scanner;

public class RemAndQout
{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int qoutient = x / y;
        int remainder = x % y;

        System.out.println("The Qoutient is =" + qoutient);
        System.out.println("The Remainder is =" + remainder);


     sc.close();
    }
}

