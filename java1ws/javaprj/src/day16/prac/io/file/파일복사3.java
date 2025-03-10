package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (FileInputStream f =new FileInputStream("res/img.jpg");
			FileOutputStream o = new FileOutputStream("res/img2.jpg")){
			
			while(true) {
				int data = f.read();
				if(data==-1) break;
				
				o.write(data);
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
