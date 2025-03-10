package day16.복습정리.캡슐화;


//시간정보에 포함되는 시, 분 , 초 정보를 하나의 단위로 다룰 때 필요함 => c에서 구조체 라는 표현 
// 데이타 + 데이타다루는 기능 묶음 

public class Time {
	private int hour;   // 인스턴변수  =>new될 때 메모리에 변수가 만들어짐  , new될 때마다 만들어지므로 인스턴스 변수라고 한다.
	private int minute;
	private float second;
	
	//클래스변수 추가해 보자 !!   => new를 아무리 많이 해도 클래스당 한 개만 만들어진다.  값을 공유해야 하거나, 하나만 가질 필요가 있을 때 사용하면됨 
	
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	
	public float getSecond() {
		return second;
	}

	
	public void setHour( int h)   {
		if( h<0  || h> 23) {
			 throw new RuntimeException("시간범오류");			 
		}
		hour =h;
	}
	
	
	public void setMinute( int m ) {
		if( m<0 || m>59) return;
		minute = m;
	}
	
	
	public void setSecond ( float s) {
		if( s< 0.0f  ||s >59.99f) return ;
		second =s;
	}
	
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	 
	// 실행하기위한 매서드 main추가
	
	

	public static void main(String[] args) {
		// Time 객체 생성
		
		Time time = new Time();
		time.setHour(9);   // 매서드를 통해서 변수의 값을 변화시킨다면? 데이터가 올바르게 유지될 수 있도록 도울 수 있다. 
		time.setMinute(20);
		time.setSecond(40);
		
		
		System.out.println( time);
		
		
	}
}
