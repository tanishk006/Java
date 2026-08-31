package W_4_31;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((i + j) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
