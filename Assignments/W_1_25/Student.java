package W_1_25;
import java.util.Scanner;

class Student {

    String name;
    int m1, m2, m3;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    double average() {
        return (m1 + m2 + m3) / 3.0;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Average = " + average());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, m1, m2, m3);

        s.display();

        sc.close();
    }
}