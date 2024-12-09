package Exercise1.src.bankmanager;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class MainTest {
    public static void main(String[] args) {
        // list account
        ArrayList<BankAccount> accounts1 = new ArrayList<>();
        ArrayList<BankAccount> accounts2 = new ArrayList<>();
        ArrayList<BankAccount> accounts3 = new ArrayList<>();
        //list transaction
        ArrayList<Transition> transactionList = new ArrayList<>();
        BankAccount account1 = new BankAccount("ACC001", "2020", "Credit", true,1500.00, transactionList);
        BankAccount account4 = new BankAccount("ACC004", "2020", "Savings", true, 1500.00, transactionList);
        BankAccount account5 = new BankAccount("ACC004", "2020", "Savings", false, 1500.00, transactionList);
        BankAccount account2 = new BankAccount("ACC002", "2021", "Checking", true, 2500.00, transactionList);
        BankAccount account3 = new BankAccount("ACC003", "2022", "Business", false, 3500.00, transactionList);
        accounts1.add(account1);
        accounts1.add(account2);
        accounts1.add(account3);
        accounts2.add(account4);
        accounts2.add(account5);

        // transaction
        Transition transaction1 = new Transition( "T001", "123", "deposit", 100.50, true, "ACC123", 7, 12, 2024, "14:30");
        Transition transaction2 = new Transition( "T002", "111", "withdraw", 50.75, false, "ACC456", 2, 12, 2024, "14:45");
        Transition transaction3 = new Transition( "T003", "122", "transfer", 2000.00, true, "ACC789", 1, 12, 2024, "15:00");

        //add transaction
        account1.addNewTransaction(transaction1);
        account1.addNewTransaction(transaction2);
        account1.addNewTransaction(transaction3);

        //customer
        Customer customer1 = new Customer("C001", "John Doe", accounts1, "01-01-1980", "123-456-7890");
        Customer customer2 = new Customer("C002", "Jane Smith", accounts2, "15-05-1985", "234-567-8901");
        Customer customer3 = new Customer("C003", "Alice Johnson", accounts3, "20-10-1990", "345-678-9012");

        //list customer
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        // bank
        Bank bank1 = new Bank("B001", "Tech Bank",customers, "123 Tech Street");


        // get list transaction in month and year
        System.out.println(account1.getTransitionList().size());
        System.out.println(customer1.getSetTransactionOrderASC(12, 2024));
        System.out.println(customer1.getTransactionTypeAmount(12, 2024));
        System.out.println(bank1.getAccountType_Quantity(2020));




    }
}
