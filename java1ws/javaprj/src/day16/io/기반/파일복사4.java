package day16.io.기반;

import java.io.*;

public class 파일복사4 {
    public static void main(String[] args) {
    	   String sourceFilePath = "res/ooopg.jpg"; // 원본 파일 경로
           String targetFilePath = "res/복사본파일이미2지.jpg"; // 복사본 파일 경로
          
        ///   String sourceFilePath = "c:\\acorn\\a.txt"; // 원본 파일 경로   절대경로표시할 수 있음
         //  String targetFilePath = "c:\\acorn\\복사본파일2.txt"; // 복사본 파일 경로


           // 파일 복사
           int data;
        
             FileInputStream inputStream=null;
             FileOutputStream outputStream=null ;
             
			try {
				  inputStream = new FileInputStream(sourceFilePath);
				  outputStream= new FileOutputStream(targetFilePath) ;
				 
				 
				  while (true) {
	            	  if ( (data = inputStream.read())  == -1) break;
	                   outputStream.write(data);		              
		          }				 
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  finally {
	            try {
	                if (inputStream != null) inputStream.close();
	                if (outputStream != null) outputStream.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
			
			 

          

            System.out.println("파일 복사가 완료되었습니다.");

         
    }
}
