package W_1_25;

import java.util.Scanner;

class IdentityMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boolean identity = true;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j && matrix[i][j] != 1)
                    identity = false;

                if (i != j && matrix[i][j] != 0)
                    identity = false;
            }
        }

        if (identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");

        sc.close();
    }
}
