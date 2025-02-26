package day09.학생_this.주문하기_이정호;

import java.util.Scanner;

public class Vender {
	String name;
	int count;
	
	//메뉴 입력
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주문할 제품 : ");
		this.name = scan.next();
		System.out.print("개수 : ");
		this.count = scan.nextInt();
	}
	
	//메뉴 출력
	public void output() {
		System.out.println(this.name);
		
		if(this.name.equals("커피")) {
			System.out.println(this.count * 3000 + "원");
		}else if(this.name.equals("녹차")) {
			System.out.println(this.count * 4000 + "원");
		}else if(this.name.equals("핫초코")) {
			System.out.println(this.count * 5000 + "원");
		}else if(this.name.equals("과일주스")) {
			System.out.println(this.count * 6000 + "원");
		}else {
			System.out.println("해당 메뉴는 없습니다.");
		}
	}
}
