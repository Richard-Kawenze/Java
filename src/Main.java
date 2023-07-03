import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
      Bank bank=new Bank();

      Account account1= new Account("Peter Makosa","23456",5000);
      Account account2=new Account("Mercy Kadja","56734",9000);
      Account account3=new Account("Gebhard Mutiso","57684",4000);

      bank.addAccount(account1);
      bank.addAccount(account2);
      bank.addAccount(account3);

      ArrayList <Account> accounts=bank.getAccounts();

      for(Account account: accounts)
      {
        System.out.println(account.getAccountInfo());
      }

      System.out.println("After depositing 1000 in account1: ");
      bank.depositMoney(account1,1000);
      System.out.println(account1.getAccountInfo());
      System.out.println("After withdrawing 3000 from account3: \n");
      bank.withdrawMoney(account3, 3000);
      System.out.println(account3.getAccountInfo());

    }
}
