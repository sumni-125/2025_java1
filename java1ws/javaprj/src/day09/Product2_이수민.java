package day09;

public class Product2_이수민 {

	String name;
	String delv;
	int price;
	
	public void setProduct() {
		this.name="모나미 펭수 샤프식 색연필";
		this.delv="로켓배송";
		this.price=2560;
	}
	//public  void printProduct(Product2_이수민 this) 
	public  void printProduct() {
		System.out.println("상품명: "+this.name);
		System.out.println("배송방법: "+this.delv);
		System.out.println("가격: "+this.price+"원");
	}
	
}
