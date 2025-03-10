package day16.io.기반;

import java.io.IOException;

public class 알파벳입력하고출력하기 {

		public static void main(String[] args) {
				System.out.println("알파벳 여러 개를 쓰고 enter를 누르세요");
				int input;
				try {
				while(  ( input =System.in.read()) != '\n')  {
				     System.out.print( (char) input);
					}
				} catch (IOException e) {
				 
					e.printStackTrace();
				}
				 
	 }   

}
