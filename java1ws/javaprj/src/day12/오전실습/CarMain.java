package day12.오전실습;

public class CarMain {

	public static void main(String[] args) {
		Car 구급차 = new 구급차();
		Car 버스 = new 버스();
		
		구급차.부릉부릉();
		버스.부릉부릉();
		
		//다운캐스팅
		구급차 ambulance = (구급차) 구급차;
		ambulance.탑승자();
		
		버스 bus = (버스) 버스;
		bus.탑승자();
		
		//객체배열사용	//instanceof 사용한 다운캐스팅
		Car[] list = new Car[2];
		list[0]=new 구급차();
		list[1]=new 버스();
		
		
		for(int i=0;i<list.length;i++) {
			list[i].부릉부릉();
			if(list[i] instanceof 구급차) {
				구급차 temp = (구급차) list[i];
				temp.탑승자();
			}
			
		}
		
		//업캐스팅
		유치원버스 b = new 유치원버스();
		b.탑승자();
		
		Car c;
		c=b;
		
		c.부릉부릉();
		//c.탑승자();
		//유치원버스 유딩 = (유치원버스) c;
	}

}
