package day08;

import java.util.Scanner;

public class 일정관리하기_함수_ {
	
	
	 static  Scanner sc = new Scanner( System.in);
	 static  String[] schedule= new String[5];
	 static  int index=0;   
	 
	

	public static void main(String[] args) {
		 
		//등록하기		
		등록하기();
		등록하기();
		
		//조회하기		
		조회하기();
		
		//변경하기
		변경하기();
		
		조회하기();
		//삭제하기
		
		삭제하기();
		조회하기();

	}
	
	
	
	//
	public static void  등록하기() {
		
		System.out.println("등록할 일정 입력하세요");		
		String temp =sc.next();
		schedule[index]=temp;
		index++;
	}
	
	
	public static void 조회하기() {
		
		for( int i=0; i< index ; i++) {
			System.out.println( (i+1)  +  schedule[i]);
		}
		
	}
	
	
	public static void 삭제하기() {
		
		조회하기();
		
		System.out.println("삭제할 일정을 선택하시오");
		int deleteIndex = sc.nextInt();
		deleteIndex = deleteIndex -1;    // deleteIndex--   deleteIndex-=1; 
	 
		
		//0
		//
		for( int i=deleteIndex;  i<schedule.length -1 ; i++ ) {			
			schedule[i] = schedule[i+1];						
		}
		
		//전체일정 개수 줄이기
		index--;	
		
		
	}
	
	public static void 변경하기() {
		
	    조회하기();
	    System.out.println("변경 일정을 선택하시오");
	    int index  =   sc.nextInt();
	    index = index-1;    // 1  -> 0 인덱스 변경
	    
	    System.out.println("변경할 일정 입력하시오");
	    String temp = sc.next();	    
	    schedule[index]=temp;
	    
	    
		
	}

}
