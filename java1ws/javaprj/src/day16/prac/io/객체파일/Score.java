package day16.prac.io.객체파일;

import java.io.Serializable;
//마커인터페이스
//객체를 저장하거나 읽어올 때는 표시(마커) Serializable를 구현해야 한다
//이 표시 없으면 (인터페이스를 구현하지 않으면) 객체를 저장하거나 읽어올 수 없다

public class Score implements Serializable{

	String name;
	int kor;
	
	public Score() {
		
	}
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	
	
	//생성자
	
	
	//toStrint();
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}
	
	
	//geller, setter
	
	
	
	
}
