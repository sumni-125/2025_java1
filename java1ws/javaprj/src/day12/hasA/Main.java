package day12.hasA;


public class Main {

	public static void main(String[] args) {
		
		Hotelier f = new Hotelier( "고객응대", "호텔과 고객을 이어주는 역할을 함 ", "프론트데스크");
		f.forntPrintInfo();
		
//		Hotelier b = new Hotelier( "식음료 업장 관리", "레스토랑을 이용하는 고객에게 음식과 서비스를 제공하는 역할을 함", "F&B 부서");
//		
//		b.forntPrintInfo();
		
		
		//업캐스팅
		
		Hotel h; 
		h = f;
		
//		Hotel h2;
//		h2 = b;
		
		System.out.println();
		System.out.println("업캐스팅");
		h.printInfo();
//		h.forntPrintInfo();  //오류
		
//		System.out.println();
//		System.out.println("업캐스팅2");
//		h2.printInfo();
//		h2.forntPrintInfo();  //오류
		
		//다운캐스팅
		
		Hotelier ff = (Hotelier) h;
		System.out.println();
		System.out.println("다운캐스팅");
		ff.forntPrintInfo();
		
//		Hotelier bb = (Hotelier) h2;
//		System.out.println();
//		System.out.println("다운캐스팅2");
//		bb.forntPrintInfo();
		
		
	}

}
