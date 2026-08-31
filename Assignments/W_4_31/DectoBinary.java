package W_4_31;
import java.util.Scanner;
class Number
{
  static void DectoBinary(int n ){
     
    int[] Binarynum = new int[1000];

    int i=0;

    while(n > 0)
    {
        Binarynum[i] = n%2;
        n = n/2;
        i++;
    }

    for(int j = i - 1; j > 0 ; j-- )
    {
        System.out.print(Binarynum[j]);


    }


  }

  public static void main (String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the decimal");
      int n = sc.nextInt(); 
      
      System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          DectoBinary(n);
      sc.close();

  }
}