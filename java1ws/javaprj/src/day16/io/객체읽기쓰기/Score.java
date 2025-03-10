 package day16.io.객체읽기쓰기;

import java.io.Serializable;

// 객체를 저장하거나 읽어올 때는 표시(마커) Serializable를 구현해야 한다
// 구현이 안되어 있으면 객체저장하거나 읽어올수 없다 . !!

 

public class Score implements Serializable {   //  마커인터페이스    - 구현할 매서드가 하나도 없는 인터페이스  , 식별만을 위한 인터페이스 
	
	
	String name;
	int kor;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}
	
	
	
	
	 
	

}
