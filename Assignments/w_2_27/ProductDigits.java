package w_2_27;

import java.util.Scanner;

class ProductDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int product = 1;

        while (n != 0) {
            product *= n % 10;
            n /= 10;
        }

        System.out.println("Product = " + product);

        sc.close();
    }
}