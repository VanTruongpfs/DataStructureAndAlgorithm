package baitap2;
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Award {
	
	public static ArrayList<String> readFile(String filePath) { 
		ArrayList<String> listCustomer = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { 
			String line; 
			while ((line = br.readLine()) != null) {
				listCustomer.add(line);
			} 
		} catch (IOException e) { 
			e.printStackTrace(); 
			} 
		return listCustomer;
	}
	
	public static ArrayList<Customer> getInformation(String url) {
		ArrayList<String> file = readFile(url);
		ArrayList<Customer> listCustomer = new ArrayList<Customer>();
		String fullName;
		int number;
		String maket;
		for (int i = 0; i < file.size(); i++) {
			String customer = file.get(i);
			StringTokenizer token = new StringTokenizer(customer, "\t");
			fullName = token.nextToken();
			number = Integer.parseInt(token.nextToken());
			maket = token.nextToken();
			Customer cus1 = new Customer(fullName, number, maket);
			listCustomer.add(cus1);
		}
		return listCustomer;
	}
	
	public static void main(String[] args) { 
		String filePath = "./src/danhsach.txt"; 
		System.out.println(readFile(filePath));	
		System.out.println(getInformation(filePath));
	
		
	} 
	
}
