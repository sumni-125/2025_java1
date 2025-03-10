package day16.prac.io.객체파일;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class 객체쓰기반복 {

	public static void main(String[] args) {
		
		

		
		
	
		ArrayList<Score> list = new ArrayList<>();
		list.add(  new Score("lee" ,90));
		list.add(  new Score("kee",80));
		list.add(  new Score("woo" ,90));
		  
		
		
		// 파일저장
		ObjectOutputStream oos=null;
	 
	 
		try {
			oos  = new ObjectOutputStream(new FileOutputStream("res/scoreList.txt"));
			
			for( int i =0 ; i< list.size(); i++) {
				oos.writeObject(list.get(i));
			}			
			
			oos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 		 

		
		// 파일읽어오기	
				
		

	}

}
