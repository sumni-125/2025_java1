package day16.io.기반;

import java.io.IOException;

public class 한바이트계속읽기 {
  public static void main(String[] args) {

		//한바이트씩 계속 읽음 
		while( true) {
			
			try {
				int data = System.in.read();
				System.out.print( (char) data);
				
				if( data == '\n')break;     //엔터를 입력하면 종료   , 읽은 값이 엔터이면 반복문 종료 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}
