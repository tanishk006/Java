package w_3_10;

import java.util.Scanner;

class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();

        System.out.print("Enter marks of subject 4: ");
        double m4 = sc.nextDouble();

        System.out.print("Enter marks of subject 5: ");
        double m5 = sc.nextDouble();

        double percentage = (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Fail");

        sc.close();
    }
}
