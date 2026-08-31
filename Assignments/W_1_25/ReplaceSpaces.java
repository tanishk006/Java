package W_1_25;

import java.util.Scanner;

class ReplaceSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = s.replace(' ', '-');

        System.out.println("Result = " + result);

        sc.close();
    }
}
