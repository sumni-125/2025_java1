package day16.복습정리.배열;

public class 객체배열 {

	public static void main(String[] args) {
		  
		
		Score[] list  = new Score[4];
		
		list[0] = new Score("장주원" , 100, 100);
		list[1] = new Score("이미현" , 99, 80);
		list[2] = new Score("김두식" , 80, 70);
		list[3] = new Score("프랭크" , 50, 60);
		
		 
		
		//향상된 for문
		for( Score s : list) {			
			System.out.println(s);
		}
		
		
		for( int i=0; i< list.length ; i++) {
			System.out.println( list[i].toString());
		}

	}

}
