package day16.prac.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex10 {

	public static void main(String[] args) {
		 
		
	
		
		
		//파일읽어서 Score  객체로 만들어서   list  추가 
		
		ArrayList<Score2> list  = new ArrayList<>();
		try(BufferedReader br = new BufferedReader( new FileReader( "res/acornScore2.txt"))) {		 
			
			while( true) {
				
				String line  = br.readLine();   // 권지언,100		
				
				if( line == null) break;
				
				
				String[] data  =line.split(",");  
				
				String name= data[0];
				int kor  =  Integer.parseInt(data[1]);
				int eng  =  Integer.parseInt(data[2]);
				
				Score2 s = new Score2( name, kor, eng);				
				list.add(s); 
				
			} 
		
			//전체 조회
			
			for( Score2 score : list) {
				//System.out.println(score);
				//System.out.println( score.toString());
				System.out.print( score.getName());
				System.out.print( score.getAvg());
				System.out.print( score.getGrade()+"\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}

}
