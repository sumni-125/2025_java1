package day12.hasA;

public class Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotelier f = new Hotelier( "고객응대", " 호텔과 고객을 이어주는 역할을 함 ", "프론트데스크");
//		f.forntPrintInfo();
		
		Hotelier b = new Hotelier( "식음료 업장 관리", "레스토랑을 이용하는 고객에게 음식과 서비스를 제공하는 역할을 함", "F&B 부서");
		
//		b.forntPrintInfo();
		

		Hotel [] list = new Hotel[2];
		
		list[0] = f;
		list[1] = b;
		
		
		for(int i = 0; i < list.length; i++) {
//			list[i].printInfo();
//			list[i].forntPrintInfo(); //오류
			
			//다운캐스팅
			if(list[i] instanceof Hotelier) {
				Hotelier temp = (Hotelier) list[i];
//				temp.printInfo();
				temp.forntPrintInfo();
			}
		}
		
	}

}
