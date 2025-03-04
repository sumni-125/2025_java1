package day12.hasA;

public class Hotelier extends Hotel{

	//직종
	String occupation;
	
	public Hotelier( String role, String work, String occupation) {
		super (role, work );
		
		this.occupation = occupation;
	}
	
	 public void forntPrintInfo() {
		 	
	    	System.out.println();
	    	System.out.println("직종 : " + occupation);
	    	
	    	//부모의 정보 출력
	    	printInfo();
	    	
	    	
	    }
}
