package W_4_31;

import java.util.Scanner;

class Revofstr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String r = "";

        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r;
        }

        System.out.println("Reversed string: " + r);

        sc.close();
    }
}