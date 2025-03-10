package day16.io.file문자;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 실습2 {

	public static void main(String[] args) {
		 
		
		
		//FileReader 		
		ArrayList<Student> list  = new ArrayList<>();		
		try {
			BufferedReader br  = new  BufferedReader ( new FileReader("res/성적.txt")) ;			
			/*
			String result  = br.readLine();
			System.out.println( result);
			
			
			  result  = br.readLine();
			System.out.println( result);
			
			*/			
			
			while( true) {
				String result  = br.readLine();			
				
				if( result  == null) break; 
				
				String[] rs = result.split(",");				
				String name = rs[0];
				int kor  =  Integer.parseInt( rs[1] );   // "100"  => 100
				int eng  = Integer.parseInt( rs[2]);
				
				
				Student s = new Student( name, kor ,eng); 
				list.add(s);
				System.out.println( result);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//ArrayList 모든 학생정보 출력
		for( Student s : list) {
			System.out.println( s);
		}
		
	}

}
