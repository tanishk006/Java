package W_4_31;

import java.util.Scanner;

class pastrai {

    public int factorial(int i) {

        if (i == 0)
            return 1;

        return i * factorial(i - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");

        int n = sc.nextInt();

        pastrai g = new pastrai();

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(" "
                        + g.factorial(i)
                        / (g.factorial(i - j) * g.factorial(j)));
            }

            System.out.println();
        }

        sc.close();
    }
}