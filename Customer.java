package baitap2;

public class Customer {
	private String fullName;
	private int number;
	private String idMarket;
	public Customer(String fullName, int number, String idMarket) {
		this.fullName = fullName;
		this.number = number;
		this.idMarket = idMarket;
	}
	public String getFullName() {
		return fullName;
	}
	public int getNumber() {
		return number;
	}
	public String getIdMarket() {
		return idMarket;
	}
	@Override
	public String toString() {
		return "fullName: " + fullName + ", number: " + number + ", idMarket: " + idMarket + "\n";
	}
	
}
