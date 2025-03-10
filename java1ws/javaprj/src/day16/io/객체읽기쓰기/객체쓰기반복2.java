package day16.io.객체읽기쓰기;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class 객체쓰기반복2 {

	public static void main(String[] args) {
		
		

		
		
	
		ArrayList<Score> list = new ArrayList<>();
		list.add(  new Score("lee" ,90));
		list.add(  new Score("kee",80));
		list.add(  new Score("woo" ,90));
		  
		
		
		// 파일저장
	 
	 
	 
		try(ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("res/test0308.txt"))) {
			 
			
			for( int i =0 ; i< list.size(); i++) {
				oos.writeObject(list.get(i));
			}			
			
			//oos.flush();     Obejct스트림이 클로즈 될 때  flush 함
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		 

		
		// 파일읽어오기	
				
		

	}

}
