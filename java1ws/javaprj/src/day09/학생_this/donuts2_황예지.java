package day09.학생_this;

public class donuts2_황예지 {
	String name;
	int price;
	int kcal;
	int cnt;

	public void 입력() {
		this.name="초코 크러쉬 도넛";
		this.price=3900;
		this.kcal=345;
		this.cnt=7;
	}
	
	public void 출력() {
		System.out.println("제품명: "+ this.name);
		System.out.println("가격: "+ this.price);
		System.out.println("칼로리: "+ this.kcal +"kcal");
		System.out.println("남은수량: "+ this.cnt +"개");
	}

}
