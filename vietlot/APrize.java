package Exercise1.src.vietlot;

import java.util.ArrayList;

public abstract class APrize {
    protected double amount;
    protected String name;
    protected String rule;
    protected ArrayList<AResult> listOfResult = new ArrayList<>();
    public APrize(double amount, String name, String rule, ArrayList<AResult> listOfResult) {
        this.amount = amount;
        this.name = name;
        this.rule = rule;
        this.listOfResult = listOfResult;
    }
    public abstract String isType();
    public double getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
    public String getRule() {
        return rule;
    }
    public ArrayList<AResult> getListOfResult() {
        return listOfResult;
    }

    @Override
    public String toString() {
        return "APrize{" +
                "amount=" + amount + "\n"+
                ", name='" + name + '\'' +"\n"+
                ", rule='" + rule + '\'' +"\n"+
                ", listOfResult=" + listOfResult +
                '}';
    }
}
