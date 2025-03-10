package day16.복습정리.상속;

public class Customer2 {
	 
	
 
	String id;
	int pw;
	
	public Customer2(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + "]";
	}
	
	/*
	@Override
	public boolean equals(Object obj) {		 
		boolean result =false;
		Customer2 anOtherObj =(Customer2) obj;
		if( this.id.equals(anOtherObj.id)) result=true;
		return  result ;
	}
	*
	*/
	
	
	@Override
	public boolean equals(Object obj) {		 
		boolean result =false;
		Customer2   cus2 = (Customer2)obj;
		
		if( this.id.equals(cus2.id)) {
			result=true;
		}		
		
		return  result;
	}

}
