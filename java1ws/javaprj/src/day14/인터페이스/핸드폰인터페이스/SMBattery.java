package day14.인터페이스.핸드폰인터페이스;

public class SMBattery implements Battery {

	@Override
	public void getEnergy() { 
		System.out.println( "SM 바테리 에너지를 얻어온다");
		
	}

}
