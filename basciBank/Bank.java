import java.util.ArrayList;

public class Bank {

    public static void main(String[] args){
        System.out.println("Welcome to the Bank!");
        ArrayList<Customer> customers = new ArrayList<>();
        Manager bankManager;
        createNewCustomer(customers);
        createFirstAccount(customers.get(0));


    }
    public static void createNewCustomer(ArrayList<Customer> customers){
        Customer customer=new Customer();
        customer.initUserInfo();
        customers.add(customer);
        customer.id=customers.size();
        System.out.println(customer.id);
    }
    public static void createFirstAccount(Customer customer){
        System.out.println("Dear customer "+customer.name+":");
        customer.accounts.add(new SavingAccount());
    }
}
