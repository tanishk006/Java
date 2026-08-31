package w_2_27;

import java.util.Scanner;

class WordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Words = 0");
        } else {
            String words[] = s.split("\\s+");
            System.out.println("Words = " + words.length);
        }

        sc.close();
    }
}