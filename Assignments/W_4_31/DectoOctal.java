package W_4_31;

import java.util.Scanner;

class DectoOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        int octal = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 8;
            octal += digit * place;
            place *= 10;
            n /= 8;
        }

        System.out.println("Octal = " + octal);

        sc.close();
    }
}
