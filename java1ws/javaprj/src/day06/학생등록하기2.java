package day06;

import java.util.Scanner;

public class 학생등록하기2 {

	public static void main(String[] args) {
		
		
		//배열특징
		//1.같은 자료형이어야 한다 
		//2.반드시 크기를 알아야 한다  (크기를 정해야 한다)
		
		
		final int MAX=5;  // 현재배열의 전체 크기
		String[]  names = new String[5];
		Scanner sc = new Scanner( System.in);
		int index=0;  //현재배열의 size(등록한 크기) 
		
		
		
		// index
		//  0   1   2   3   4
		// index  5
		// =>배열의 크기가 부족함 사이즈늘 늘려야 함 
		// =>해결 ( 더 큰 배열만든다. 요소를 복사한다. )
		
		//크기 체크 
		if( index >=  MAX ) {
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;						
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			index++;
		}	
		  
		
		
		
		
		if( index >=  MAX ) {
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;						
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			index++;
		}	
		
		
		
		
		if( index >=  MAX ) {
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;						
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			index++;  //3
		}	
		
		
		
		if( index >=  MAX ) {
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;						
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			index++;
		}	
		
		
		//4
		
		if( index >=  MAX ) {
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;						
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			index++;  //5 
		}	
		
		
		
		if( index >=  MAX ) {  //5  >= 5
			String[] newNames  = new String[ MAX+5];  // 
			
			for(int i=0; i< names.length ; i++) {
				newNames[i] = names[i];
			}			
			names  = newNames;	
			
			
			System.out.println( "새로운 배열이 만들어졌다");
			
			
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
			
			
			
		}else {		
		 
			System.out.println( "이름을 등록");
			String name  = sc.next();
			names[index] = name;
		}	
		
		
		
		
		// 배열 출력 
		
		
		

	}

}
