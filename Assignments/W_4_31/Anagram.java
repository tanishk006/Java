package W_4_31;

import java.util.Scanner;
import java.util.Arrays;

class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char a[] = s1.toLowerCase().toCharArray();
        char b[] = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        sc.close();
    }
}
