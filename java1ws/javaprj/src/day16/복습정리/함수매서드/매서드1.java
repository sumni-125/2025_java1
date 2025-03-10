package day16.복습정리.함수매서드;

public class 매서드1 {

	public static void main(String[] args) {
		//배열의 합을 구해주는 매서드 만들고 사용하기
		매서드1 o = new  매서드1();		
		int result  =o.getSumArray( new int[] {8,5,7});		
		System.out.println( result); 
		
		
		int[] kors = {6,7,8,9,3};		
		int result2  =o.getSumArray(kors);	
		System.out.println( result2);
	}
	
	
	public  int  getSumArray( int []  arr) {		
		int sum=0;
		for( int i=0; i< arr.length ;i ++) {
			sum +=  arr[i];
		}		
		return sum;
		
	}

}
