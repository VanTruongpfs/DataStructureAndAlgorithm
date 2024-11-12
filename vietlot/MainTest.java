package Exercise1.src.vietlot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {

        //dai li
        ArrayList<ADigitalLottery> listLottery1 = new ArrayList<>();
        ArrayList<ADigitalLottery> listLottery2 = new ArrayList<>();
        SaleAgent agent1 =  new SaleAgent("123", "Thu Duc", listLottery1);
        SaleAgent agent2 =  new SaleAgent("456", "Dong Nai", listLottery2);
        // in ve ngau nhien
        System.out.println("In so ngau nhien: \n"+ agent1.createRandomLottery());
        System.out.println("/////////////////////////");
        ADigitalLottery veSo1 = agent1.createRandomLottery();
        ADigitalLottery veSo2 = agent1.createRandomLottery();
        ADigitalLottery veSo3 = agent2.createRandomLottery();

        // in ve theo yeu cau
        String[] numberString = {"1,3,4,2"};
        ADigitalLottery veSo4 = agent2.printCustomerRequest("mega4", numberString);
        System.out.println("in theo yeu cau: \n"+agent2.printCustomerRequest("mega4", numberString));
        agent2.getListLottery().add(veSo4);
        System.out.println("/////////////////////////");
        //Giai thuong
        ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
        listSaleAgents.add(agent1);
        listSaleAgents.add(agent2);
        ArrayList<APrize> listOfPrizes = new ArrayList<>();
        //cong ty
        Exercise1.src.vietlot.Company company = new Exercise1.src.vietlot.Company(listSaleAgents, listOfPrizes);
        APrize aPrize6_45 = company.createResultPrize("6_45");
        APrize aPrize6_55 = company.createResultPrize("6_55");
        APrize aPrizeMega4 = company.createResultPrize("mega4");
        AResult resultMega4 = aPrizeMega4.getListOfResult().get(0);
//        company.getListOfPrizes().add(aPrize6_45);
//        company.getListOfPrizes().add(aPrize6_55);
//        company.getListOfPrizes().add(aPrizeMega4);
//        System.out.println("result of prize lottery 6_45: \n"+company.createResultPrize("6_45"));
//        System.out.println("result of prize lottery 6_55: \n"+company.createResultPrize("6_55"));
//        System.out.println("result of prize lottery mega4: "+company.createResultPrize("mega4"));


        System.out.println("lay ra giai thuong bang Date: \n"+company.getResultPrizeByDate("Wed Nov 13 2024", "mega4"));
        System.out.println("Do ve so: ");
        System.out.println(company.checkPrize(listSaleAgents, listOfPrizes, "mega4")==null?"khong co ve nao trung":"chuc mung: "+company.checkPrize(listSaleAgents, listOfPrizes, "mega4"));

        //Test Dai Ly co nhieu ve trung
        System.out.println("////////////////////////////////////");
        // Tao dai ly moi agent3
        ArrayList<ADigitalLottery> listLottery3 = new ArrayList<>();
        SaleAgent agent3 = new SaleAgent("789", "HCMC", listLottery3);
        // Tao dai ly moi agent4
        ArrayList<ADigitalLottery> listLottery4 = new ArrayList<>();
        SaleAgent agent4 = new SaleAgent("129", "HCMC", listLottery4);
        //Tao ket qua

        String[] firstPrizeNumbers = resultMega4.getFirstPrize();
        String[] specialPrizeNumbers =resultMega4.getSpecialPrize();
        String[] secondPrizeNumbers = resultMega4.getSecondPrize();

        //in ve
        ADigitalLottery veSoFirst = agent3.printCustomerRequest("mega4", firstPrizeNumbers);
        ADigitalLottery veSoSpecial = agent3.printCustomerRequest("mega4", specialPrizeNumbers);

        ADigitalLottery veSoFirst4 = agent4.printCustomerRequest("mega4", firstPrizeNumbers);
        ADigitalLottery veSoSecond4 = agent4.printCustomerRequest("mega4", secondPrizeNumbers);
        ADigitalLottery veSoSpecial4 = agent4.printCustomerRequest("mega4", specialPrizeNumbers);
        // them agent vao cong ty
        company.getListSaleAgents().add(agent3);
        company.getListSaleAgents().add(agent4);

        HashMap<SaleAgent, Integer> winningAgents = company.getAgentsWithHighWinningCount("mega4");
        for (Map.Entry<SaleAgent, Integer> entry : winningAgents.entrySet()) {
            System.out.println("Đại lý " + entry.getKey().getId() + " có " + entry.getValue() + " vé trúng.");
        }
    }
}
