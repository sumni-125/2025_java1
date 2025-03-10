package day16.복습정리.상속;

public class Customer {
	 
	
 
	String id;
	int pw;
	
	
	public Customer(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + "]";
	}
	
	

}
