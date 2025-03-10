package day16.io.file바이트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx02 {
	 

	public static void main(String[] args) {
		 
		FileInputStream fis=null;
		try {
			//데이터가 들어오는 길(통로)을 얻어온 것 !!!!
			fis = new FileInputStream("res/test.txt");
			/*
			int su;
			su=fis.read();
			System.out.print( (char) su);
			
			su= fis.read();
			System.out.print( (char)su);
			
			su=fis.read();
			System.out.print( (char)su);
			
			)*/
			//파일이 생성될 때 파일에 끝에  -1 (파일의 끝을 알리는 문자)생성됨
			while( true) {
				int su;
				su=fis.read();
				if ( su  ==  -1) break;
				System.out.print( (char) su);			
			}
			
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
