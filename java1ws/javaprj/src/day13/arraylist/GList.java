package day13.arraylist;

 

public class GList<T> {	
	private Object[] nums;
	private int current;
	 	
	
	
	public GList() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	public int size()
	{
		return current;
	}
	
	public T get(int index)    { 		
		return (T) nums[index];	
	} 
	 

}
