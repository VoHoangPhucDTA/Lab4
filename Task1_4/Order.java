package Task1_4;

import java.util.Arrays;
import java.util.Comparator;

public class Order implements ISort{
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	

	@Override
	public void sortByID(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getP().getId().compareToIgnoreCase(o2.getP().getId());
			}
		});
	}

	@Override
	public void sortByName(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getP().getName().compareTo(o2.getP().getName());
			}
		});	
	}

	@Override
	public void sortByPrice(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return Double.compare(o1.getP().getPrice(), o2.getP().getPrice());
			}
		});	
	}

	@Override
	public void sortByType(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getP().getType().compareTo(o2.getP().getType());
			}
		});	
	}



	@Override
	public void sortByQuantity(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return Integer.compare(o1.getQuantity(), o2.getQuantity());
			}
		});	
	}

	
}
