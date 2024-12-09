package Exercise1.src.grocery;

import Exercise1.src.grocery.MatHang;

public class OrderItem implements Comparable<MatHang>{
	private String orderItemID;
	private String itemID;
	private String itemName;
	private double unitPrice;
	private int quantity;
	public OrderItem(String orderItemID, String itemID, String itemName, double unitPrice, int quantity) {
		this.orderItemID = orderItemID;
		this.itemID = itemID;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}


	@Override
	public int compareTo(MatHang o) {
		return 0;
	}
}
