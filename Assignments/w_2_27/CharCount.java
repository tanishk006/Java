package w_2_27;

import java.util.Scanner;

class CharCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ch)
                count++;
        }

        System.out.println("Occurrence = " + count);

        sc.close();
    }
}