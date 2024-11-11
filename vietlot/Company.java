package Exercise1.src.vietlot;

import java.util.ArrayList;

public class Company {
    private ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
    private ArrayList<APrize> listOfPrizes = new ArrayList<>();
    public Company(ArrayList<SaleAgent> listSaleAgents, ArrayList<APrize> listOfPrizes) {
        this.listSaleAgents = listSaleAgents;
        this.listOfPrizes = listOfPrizes;
    }

}
