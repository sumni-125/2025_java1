package day16.io.file문자;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_국어점수평균 {

	public static void main(String[] args) {
	 
		
		try {
			BufferedReader bf = new BufferedReader( new FileReader("res/kor.txt"));
			
			int sum=0;
			double avg;
			int count=0;
			while(true) {
				String data = bf.readLine(); 
			
				if( data == null)break;  // null  ->  파일이 더 읽을내용이 없으면  null 반환 
				count++;
				System.out.println( data);
			
				int dataNumber  =  Integer.parseInt(data);  // "25"   => 25
				sum +=  dataNumber; // sum = sum+  dataNumber;
			}	
			avg =sum/(double)count;
			System.out.println( avg);
			
			
			bf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}

}
