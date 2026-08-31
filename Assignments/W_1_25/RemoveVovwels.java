package W_1_25;

import java.util.Scanner;

class RemoveVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' &&
                ch != 'O' && ch != 'U') {

                result += ch;
            }
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
