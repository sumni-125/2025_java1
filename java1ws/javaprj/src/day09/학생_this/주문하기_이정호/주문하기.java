package day09.학생_this.주문하기_이정호;

public class 주문하기 {

	public static void main(String[] args) {
		System.out.println("<메뉴>");
		System.out.println("커피(3000원)");
		System.out.println("녹차(4000원)");
		System.out.println("핫초코(5000원)");
		System.out.println("과일주스(6000원)");
		System.out.println("========");
		
		Vender vender = new Vender();
		
		vender.input();
		System.out.println("========");
		vender.output();

	}

}
