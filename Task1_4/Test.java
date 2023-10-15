package Task1_4;


public class Test {
	
	public static void main(String[] args) {
		Product p1 = new Product("1", "Pepsi", 500, "small");
		Product p2 = new Product("2", "Sting", 700, "normal");
		Product p3 = new Product("3", "Coca", 350, "normal");
		Product p4 = new Product("4", "Lemon", 800, "extreme");

		
		OrderItem ot1 = new OrderItem(p1, 2);
		OrderItem ot2 = new OrderItem(p2, 4);
		OrderItem ot3 = new OrderItem(p3, 8);
		OrderItem ot4 = new OrderItem(p4, 5);

		
		OrderItem[] otArr = new OrderItem[4];
		otArr[0] = ot2;
		otArr[1] = ot3;
		otArr[2] = ot4;
		otArr[3] = ot1;
		
	
		Order o = new Order(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI CHƯA SẮP XẾP: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		o.sortByName(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI ĐÃ SẮP XẾP THEO TÊN: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		o.sortByPrice(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI ĐÃ SẮP XẾP THEO PRICE: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		o.sortByType(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI ĐÃ SẮP XẾP THEO TYPE: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		o.sortByQuantity(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI ĐÃ SẮP XẾP THEO SỐ LƯỢNG: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		

		
	}
}
