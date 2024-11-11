package Exercise1.src.vietlot;

import java.util.ArrayList;

public class APrize {
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
}
