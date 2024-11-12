package Exercise1.src.vietlot;

import java.util.ArrayList;

public class PrizeMega4 extends APrize{
    public PrizeMega4(double amount, String name, String rule, ArrayList<AResult> listOfResult) {
        super(amount, name, rule, listOfResult);
    }

    @Override
    public String isType() {
        return "mega4";
    }
}
