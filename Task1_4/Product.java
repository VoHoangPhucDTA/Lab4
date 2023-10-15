package Task1_4;


public class Product {
	private String id;
	private String name;
	private double price;
	private String type;
	
	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Id:" + id + ", Name:" + name + ", Price:" + price + ", Type:" + type;
	}
	
	
	
	public String getId() {
		return id;
	}

	
	

	
	
	
	
}
