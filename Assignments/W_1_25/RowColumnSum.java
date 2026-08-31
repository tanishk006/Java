package W_1_25;

import java.util.Scanner;

class RowColumnSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        System.out.println("Enter elements:");

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {

            int sum = 0;

            for (int j = 0; j < c; j++)
                sum += matrix[i][j];

            System.out.println("Row " + (i + 1) + " sum = " + sum);
        }

        for (int j = 0; j < c; j++) {

            int sum = 0;

            for (int i = 0; i < r; i++)
                sum += matrix[i][j];

            System.out.println("Column " + (j + 1) + " sum = " + sum);
        }

        sc.close();
    }
}
