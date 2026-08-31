package w_3_10;

import java.util.Scanner;

class Automorphic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        boolean result = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                result = false;
                break;
            }

            temp /= 10;
            square /= 10;
        }

        if (result)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}
