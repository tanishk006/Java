package w_2_27;

import java.util.Scanner;

class Divisibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Divisible by both 5 and 11");
        else
            System.out.println("Not divisible by both 5 and 11");

        sc.close();
    }
}
