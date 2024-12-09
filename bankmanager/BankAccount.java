package Exercise1.src.bankmanager;

import java.util.ArrayList;
import java.util.TreeSet;

public class BankAccount {
    private String id;
    private String openAccountYear;
    private String accountType;
    private boolean status;
    private double balance;
    private ArrayList<Transition> transitionList = new ArrayList<>();

    public BankAccount(String id, String openAccountYear, String accountType, boolean status,  double balance, ArrayList<Transition> transitionList) {
        this.id = id;
        this.openAccountYear = openAccountYear;
        this.accountType = accountType;
        this.status = status;
        this.balance = balance;
        this.transitionList = transitionList;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", openAccountYear='" + openAccountYear + '\'' +
                ", accountType='" + accountType + '\'' +
                ", status=" + status +
                ", balance=" + balance +
                ", transitionList=" + transitionList +
                '}'+"\n";
    }

    public void addNewTransaction(Transition transition) {
        if(!transitionList.contains(transition)) {
            if(transition.getTransitionType().equals("deposit")){
                balance += transition.getAmount();
            }else if(transition.getTransitionType().equals("transfer") || transition.getTransitionType().equals("withdraw")){
                balance -= transition.getAmount();
            }
            transitionList.add(transition);
        }
    }
    public String getId() {
        return id;
    }

    public String getOpenAccountYear() {
        return openAccountYear;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean isStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transition> getTransitionList() {
        return transitionList;
    }
}
