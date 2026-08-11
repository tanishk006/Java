package Week_4;

import java.util.Scanner;

public class acmodify {
    
    static class Student {

        int rollNo;

        Student(int r)
        {
            rollNo = r;
        }

       
    }
     public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int r = sc.nextInt();

            Student s = new Student(r);

            System.out.println("Roll Number is :" + s.rollNo);



            sc.close();
        }
}
