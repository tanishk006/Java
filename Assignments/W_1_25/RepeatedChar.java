package W_1_25;

import java.util.Scanner;

class RepeatedChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("First repeated character = " + s.charAt(i));
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found)
            System.out.println("No repeated character");

        sc.close();
    }
}