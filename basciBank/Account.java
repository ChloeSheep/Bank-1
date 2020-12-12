import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account {

  String accountType;
  ArrayList<Transaction> transactions;
  static Currency currency = new Currency();
  Tool tool=new Tool();

  Account(){
  }
  public String toString(){
      return accountType;
  }
  public void save(String type){
    System.out.println("How much would you save this time?");
    Scanner money=new Scanner(System.in);
    String cash=money.nextLine();
    while (!tool.is_number(cash)){
      System.out.println("Invalid input. Please input a number.");
      cash=money.nextLine();
    }
    Account.currency.add(type,Double.parseDouble(cash));
    System.out.println("Successfully save "+type+" "+cash+"!");
    System.out.println("Now your deposit: ");
    Account.currency.print();
  }
  public void withdraw(String type){
    System.out.println("How much cash(dollar) would you take this time?");
    Scanner money=new Scanner(System.in);
    String cash=money.nextLine();
    while (!tool.is_number(cash)){
      System.out.println("Invalid input. Please input a number.");
      cash=money.nextLine();
    }
    Account.currency.sub(type,Double.parseDouble(cash));
    System.out.println("Successfully withdraw "+type+" "+cash+"!");
    System.out.println("Now your deposit: ");
    Account.currency.print();
  }
  public void addRecord(Transaction transaction){
      transactions.add(transaction);
  }
  public abstract void createTransaction();
}
