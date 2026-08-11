package Week_4;

import java.util.Scanner;


public class proacmodify {
    
    static class Employee{

        protected int salary;

        static class Manager extends Employee{

        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int s = sc.nextInt();

            Manager m = new Manager();

            m.salary= s ;

            System.out.println("Salary is: " + s);

            sc.close();
        }
    }
}
