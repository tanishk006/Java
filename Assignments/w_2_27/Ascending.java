// print the array in ascending order using sorting method
import java.util.Scanner;

public class Ascending
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements of the array: ");
    int n = sc.nextInt();

    int[] num = new int[n];

    for(int i = 0 ; i < n ;i++)
    {
        num[i] = sc.nextInt();

    }

    for(int i = 0; i < n-1 ;i++)
    {
        for(int j = 0; j < n-1-i;j++)
        {
            if(num[j] > num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp; 
                }
            
        }
    }

    System.out.println("Array in ascending order:");
    for(int i =0 ; i < n;i++)
    {
        System.out.print(num[i] + " ");
    }
    System.out.println();

    sc.close();

  }
}

