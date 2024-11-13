package Exercise1.src.vietlot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {

        // Tạo các đại lý với danh sách vé
        ArrayList<ADigitalLottery> listLottery1 = new ArrayList<>();
        ArrayList<ADigitalLottery> listLottery2 = new ArrayList<>();
        SaleAgent agent1 = new SaleAgent("123", "Thu Duc", listLottery1);
        SaleAgent agent2 = new SaleAgent("456", "Dong Nai", listLottery2);

        // In vé ngẫu nhiên cho mỗi đại lý
        System.out.println("In số ngẫu nhiên: \n" + agent1.createRandomLottery());
        System.out.println("/////////////////////////");
        ADigitalLottery veSo1 = agent1.createRandomLottery();
        ADigitalLottery veSo2 = agent1.createRandomLottery();
        ADigitalLottery veSo3 = agent2.createRandomLottery();

        // In vé theo yêu cầu
        String[] numberStringMega4 = {"1,3,4,2"};
        ADigitalLottery veSo4 = agent2.printCustomerRequest("mega4", numberStringMega4);
        System.out.println("In theo yêu cầu: \n" + agent2.printCustomerRequest("mega4", numberStringMega4));
        agent2.getListLottery().add(veSo4);
        System.out.println("/////////////////////////");

        // Tạo danh sách đại lý và giải thưởng
        ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
        listSaleAgents.add(agent1);
        listSaleAgents.add(agent2);
        ArrayList<APrize> listOfPrizes = new ArrayList<>();

        // Công ty
        Company company = new Company(listSaleAgents, listOfPrizes);

        // Tạo các giải thưởng cho từng loại vé
        APrize aPrize6_45 = company.createResultPrize("6_45");
        APrize aPrize6_55 = company.createResultPrize("6_55");
        APrize aPrizeMega4 = company.createResultPrize("mega4");

        AResult resultMega4 = aPrizeMega4.getListOfResult().get(0);
        AResult resultMega6_55 = aPrize6_55.getListOfResult().get(0);
        AResult resultMega6_45 = aPrize6_45.getListOfResult().get(0);

        String dateMega4 = resultMega4.getDate();
        String[] secondPrizeMega4 = resultMega4.getSecondPrize();
        String[] firstPrizeMega4 = resultMega4.getFirstPrize();
        String[] specialPrizeMega4 = resultMega4.getSpecialPrize();

        String[] firstPrize6_45 = resultMega6_45.getFirstPrize();
        String[] specialPrize6_45 = resultMega6_45.getSpecialPrize();

        String[] specialPrize6_55 = resultMega6_55.getSpecialPrize();

//        // Thêm các giải thưởng vào danh sách công ty
//        company.getListOfPrizes().add(aPrize6_45);
//        company.getListOfPrizes().add(aPrize6_55);
//        company.getListOfPrizes().add(aPrizeMega4);

        // In giải thưởng theo ngày

        System.out.println("Lấy giải thưởng bằng Date: \n" + company.getResultPrizeByDate(dateMega4, "6_45"));

        // Kiểm tra vé trúng thưởng cho các đại lý
        ADigitalLottery veSoSpecial6 = agent1.printCustomerRequest("6_45", specialPrize6_45);
        System.out.println("Đối chiếu vé trúng thưởng: ");
        System.out.println(company.checkPrize(listSaleAgents, listOfPrizes, "6_45") == null ? "Không có vé nào trúng" : "Chúc mừng: " + company.checkPrize(listSaleAgents, listOfPrizes, "6_45"));

        // Thêm đại lý mới để kiểm tra với nhiều loại vé hơn
        System.out.println("////////////////////////////////////");
        ArrayList<ADigitalLottery> listLottery3 = new ArrayList<>();
        SaleAgent agent3 = new SaleAgent("789", "HCMC", listLottery3);

        ArrayList<ADigitalLottery> listLottery4 = new ArrayList<>();
        SaleAgent agent4 = new SaleAgent("129", "HCMC", listLottery4);

        // In vé theo yêu cầu cho các loại khác nhau
        ADigitalLottery veSoFirstMega4 = agent3.printCustomerRequest("mega4", firstPrizeMega4);
        ADigitalLottery veSoSpecialMega4 = agent3.printCustomerRequest("mega4", specialPrizeMega4);
        ADigitalLottery veSoFirst6_45 = agent4.printCustomerRequest("6_45", firstPrize6_45);
        ADigitalLottery veSoSpecial6_45 = agent4.printCustomerRequest("6_45", specialPrize6_45);
        ADigitalLottery veSoSpecial6_55 = agent4.printCustomerRequest("6_55", specialPrize6_55);


        // Thêm các đại lý mới vào công ty
        company.getListSaleAgents().add(agent3);
        company.getListSaleAgents().add(agent4);

        // Kiểm tra các đại lý có nhiều vé trúng cho từng loại
        HashMap<SaleAgent, Integer> winningAgentsMega4 = company.getAgentsWithHighWinningCount("mega4");
        System.out.println("Các đại lý trúng nhiều vé mega4:");
        for (Map.Entry<SaleAgent, Integer> entry : winningAgentsMega4.entrySet()) {
            System.out.println("Đại lý " + entry.getKey().getId() + " có " + entry.getValue() + " vé trúng.");
        }

        HashMap<SaleAgent, Integer> winningAgents6_45 = company.getAgentsWithHighWinningCount("6_45");
        System.out.println("Các đại lý trúng nhiều vé 6_45:");
        for (Map.Entry<SaleAgent, Integer> entry : winningAgents6_45.entrySet()) {
            System.out.println("Đại lý " + entry.getKey().getId() + " có " + entry.getValue() + " vé trúng.");
        }

        HashMap<SaleAgent, Integer> winningAgents6_55 = company.getAgentsWithHighWinningCount("6_55");
        System.out.println("Các đại lý trúng nhiều vé 6_55:");
        for (Map.Entry<SaleAgent, Integer> entry : winningAgents6_55.entrySet()) {
            System.out.println("Đại lý " + entry.getKey().getId() + " có " + entry.getValue() + " vé trúng.");
        }
    }
}
