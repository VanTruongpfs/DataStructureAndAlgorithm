package Exercise1.src.vietlot;

import java.util.ArrayList;

public class AResult {
    private String date;
    private ArrayList<String> specialPrize = new ArrayList<>();
    private ArrayList<String> firstPrize = new ArrayList<>();
    private ArrayList<String> secondPrize = new ArrayList<>();
    public AResult(String date, ArrayList<String> specialPrize, ArrayList<String> firstPrize, ArrayList<String> secondPrize) {
        this.date = date;
        this.specialPrize = specialPrize;
        this.firstPrize = firstPrize;
        this.secondPrize = secondPrize;
    }
    public String getDate() {
        return date;
    }
    public ArrayList<String> getSpecialPrize() {
        return specialPrize;
    }
    public ArrayList<String> getFirstPrize() {
        return firstPrize;
    }
    public ArrayList<String> getSecondPrize() {
        return secondPrize;
    }

    @Override
    public String toString() {
        return "AResult{" +
                "date='" + date + '\'' +
                ", specialPrize=" + specialPrize +
                ", firstPrize=" + firstPrize +
                ", secondPrize=" + secondPrize +
                '}';
    }
}
