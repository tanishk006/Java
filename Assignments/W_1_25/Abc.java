package W_1_25;

import java.util.Scanner;

class Abc 
{
    int result;

    public Abc(int a, int b) 
{
        this.result = a * b;
    }

    public Abc(int a, int b, int c) 
{
        this.result = a * b * c;
    }

    public void showResult() 
{
        System.out.println("The product is: " + result);
    }

    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Abc sum1 = new Abc(num1, num2);
        sum1.showResult();

        System.out.print("\nEnter first number: ");
        int x = sc.nextInt();
    }
}