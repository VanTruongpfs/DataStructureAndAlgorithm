package Exercise1.src.bankmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Customer {
    private String id;
    private String fullName;
    private ArrayList<BankAccount> accountList = new ArrayList<>();
    private String birthday;
    private String numberPhone;

    public Customer(String id, String fullName, ArrayList<BankAccount> accountList, String birthday, String numberPhone) {
        this.id = id;
        this.fullName = fullName;
        this.accountList = accountList;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<BankAccount> getAccountList() {
        return accountList;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }
    public TreeSet<Transition> getSetTransactionOrderASC(int month, int year){
        TreeSet<Transition> set = new TreeSet<>();
        for(BankAccount account : accountList){
            for(Transition transition : account.getTransitionList()){
                if(transition.getMonth() == month && transition.getYear() == year){
                    set.add(transition);
                }
            }
        }
        return set;
    }
    public HashMap<String, Double> getTransactionTypeAmount(int month, int year){
        HashMap<String, Double> map = new HashMap<>();
        for(BankAccount account : accountList){
            for(Transition transition : account.getTransitionList()){
                if(transition.getMonth() == month && transition.getYear() == year){
                    if(map.containsKey(transition.getTransitionType())){
                        map.put(transition.getTransitionType(), map.get(transition.getTransitionType()) + transition.getAmount());
                    }else{
                        map.put(transition.getTransitionType(), transition.getAmount());
                    }
                }
            }
        }
        return map;
    }
}



