package W_4_31;

import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");

        sc.close();
    }
}