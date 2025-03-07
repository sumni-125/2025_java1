package day14.인터페이스실습_이동우황예지;

public class Product {
	//제품정보
	String name = "auxiliary battery";
	int price = 12000;
	int deliveryFee;
	
	public Product() {
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
