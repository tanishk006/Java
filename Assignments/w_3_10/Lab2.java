// Write a program that describes a class person ,it should have instances variable to record name, 
// age and salary . Create a person object set and display its instance variables.
package w_3_10;
import java.util.Scanner;

public class Lab2{

    public static class Person{
        String name;
        String age;
        String Salary;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Person person = new Person();

        System.out.print("Enter Name: ");
        person.name = sc.nextLine();

        System.out.print("Enter Age: ");
        person.age = sc.nextLine();

        System.out.print("Enter Salary: ");
        person.Salary = sc.nextLine();


        System.out.println("**** PERSONAL DETAILS ***");
        System.out.println("Name :" + person.name);
        System.out.println("Age : " + person.age);
        System.out.println("Salary : " + person.Salary);


        sc.close();
    }
}