package day04;
import java.util.Scanner;

public class 제어문_break {

	public static void main(String[] args) {
		
		
		//반복문에서 break 사용하면 자신이 속한 반복문을 벗어남
		
		Scanner sc = new Scanner(System.in);
		
		//이름이 끝이면 종료되도록 하기
		//이름을 그대로 출력하기
		
		String name="";
		while(true) {
			name=sc.next();
			
			if(name.equals("끝")) {
				break;
			}
			System.out.println(name);
		}
		System.out.println("bye");
		
		
	}

}
