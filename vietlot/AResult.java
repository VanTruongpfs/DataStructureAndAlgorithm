package Exercise1.src.vietlot;

import java.util.ArrayList;

public class AResult {
    private String date;
    private ArrayList<String[]> specialPrize = new ArrayList<>();
    private ArrayList<String[]> firstPrize = new ArrayList<>();
    private ArrayList<String[]> secondPrize = new ArrayList<>();
    public AResult(String date, ArrayList<String[]> specialPrize, ArrayList<String[]> firstPrize, ArrayList<String[]> secondPrize) {
        this.date = date;
        this.specialPrize = specialPrize;
        this.firstPrize = firstPrize;
        this.secondPrize = secondPrize;
    }
}
