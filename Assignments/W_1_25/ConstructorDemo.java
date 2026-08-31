package W_1_25;

import java.util.Scanner;

class ConstructorDemo {

    int a, b;

    ConstructorDemo() {
        a = 0;
        b = 0;
    }

    ConstructorDemo(int a) {
        this.a = a;
        b = 0;
    }

    ConstructorDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        ConstructorDemo obj = new ConstructorDemo(a, b);

        obj.display();

        sc.close();
    }
}
