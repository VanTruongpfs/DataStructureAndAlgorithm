package Exercise1.src.grocery;

import java.util.TreeSet;

public class Order {
	TreeSet<OrderItem> bag = new TreeSet();

	public Order(TreeSet<OrderItem> bag) {
		this.bag = bag;
	}
	
}
