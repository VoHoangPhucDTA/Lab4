package Task1_4;


public class OrderItem implements Comparable<OrderItem>{
	private Product p;
	private int quantity;
	public OrderItem(Product p, int quantity) {
		this.p = p;
		this.quantity = quantity;
	}
	
	
	public Product getP() {
		return p;
	}


	public int getQuantity() {
		return quantity;
	}


	@Override
	public String toString() {
		return  "\n("  + p + ", Quantity:" + quantity + " )"   ;
	}


	@Override
	public int compareTo(OrderItem o) {
		return 0;
	}


	
	
	
	
	
	
	
}
