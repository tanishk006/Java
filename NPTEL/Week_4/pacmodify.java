package Week_4;

import java.util.Scanner;


public class pacmodify {
     
    static class Account {
        private int balance;

        public  void setBalance(int b ){
            balance = b ;
        }

        public int getBalance(){
                return balance;

        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        Account acc = new Account();

        acc.setBalance(b);
      
      System.out.println("Account balance is: " + acc.getBalance());
      
      sc.close();
    }
}
