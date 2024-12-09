package Exercise1.src.bankmanager;
import java.util.ArrayList;
import java.util.TreeMap;

public class Bank {
    private String id;
    private String name;
    private ArrayList<Customer> customerList = new ArrayList<>();
    private String address;
    public Bank(String id, String name, ArrayList<Customer> customerList, String address) {
        this.id = id;
        this.name = name;
        this.customerList = customerList;
        this.address = address;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getAddress() {
        return address;
    }
    public TreeMap<String, Integer> getAccountType_Quantity(int year){
        TreeMap<String, Integer> map = new TreeMap<>();
        int numberPeopleOpen = 0;
        for (Customer customer : customerList) {
            for (BankAccount account : customer.getAccountList()) {
                if(account.isStatus() && Integer.parseInt(account.getOpenAccountYear())==year){
                    if(map.containsKey(account.getAccountType())){
                        map.put(account.getAccountType(), map.get(account.getAccountType())+1);
                    }else{
                        map.put(account.getAccountType(), 1);
                    }
                }
            }
        }
        return map;
    }

}
