package Week_3;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();

        Student student = new Student(name, age);

        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());

        scanner.close();
    }
}
