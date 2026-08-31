package W_1_25;

import java.util.Scanner;

class ReverseWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        String words[] = s.split(" ");

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }

        sc.close();
    }
}
