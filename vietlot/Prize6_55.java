package Exercise1.src.vietlot;

import java.util.ArrayList;

public class Prize6_55 extends APrize{
    public Prize6_55(double amount, String name, String rule, ArrayList<AResult> listOfResult) {
        super(amount, name, rule, listOfResult);
    }

    @Override
    public String isType() {
        return "6_55";
    }
}
