package day14.객체관계.hasA포함;


//약한걸합(느슨한결합)

public class C {
	
	D d;
	
	//약한결합
	//외부에서 생성된 D객체를 주입받는 방법
	
	//주입받는 방법 두가지
	//생성자
	//세터
	
	public C() {
		
	}
	
	/*
	//생성자 주입
	public C(D d) {
		this.d = d;
	}
	*/
	
	//세터 주입
	public void setD(D d) {
		this.d = d;
	}
	
	
	
	public void C메서드() {
		System.out.println("C메서드");
		d.D메서드();
	}
	
	
	
	
}
