package day12.hasA;

public class Hotel {

	private String role; //역할
	private String work; // 업무
	
	
	public Hotel(String role, String work) {
		this.role = role;
		this.work = work;
	}
	
	//정보 출력
	public void printInfo() {
		System.out.println("하는 일 : " + work);
		System.out.println("역할 : " + role);

	}
}
