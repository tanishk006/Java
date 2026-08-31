package w_2_27;

import java.util.Scanner;

class DectoHex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        System.out.println("Hexadecimal = " + Integer.toHexString(n).toUpperCase());

        sc.close();
    }
}
