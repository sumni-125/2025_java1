package day08;

public class Printinfo {

	public static void main(String[] args) {
		
		Products a = new Products();
		a.name="모나미 펭수 샤프식 색연필";
		a.delv="로켓배송";
		a.price=2560;
		
		상품정보출력(a);
	}

	public static void 상품정보출력(Products a) {
		System.out.println("상품명: "+a.name);
		System.out.println("배송방법: "+a.delv);
		System.out.println("가격: "+a.price+"원");
	}
	
}
