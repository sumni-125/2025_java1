package day14.인터페이스.핸드폰인터페이스;

public class HandPhone {
	
	Battery battery ;

	
	//매개변수에 인터페이스가 있다면
	//인터페이스를 구현한 객체를 제공하라는 의미
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	
	void powerOn() {
		
		battery.getEnergy();
		System.out.println("핸드폰이 켜진다");
	} 

}
