package 순서도코딩해보기;
import java.util.Scanner;

public class hard_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//임금을 구하시오
		Scanner sc = new Scanner(System.in);
		
		String name = "이수민";
		int code=3;
		int time=4;
		int money=0;
		
		switch(code) {
		
		case 1: 
			money = time*1000;
			break;
		case 2: 
			money = time*2000;
			break;
		case 3: 
			money = time*3000;
			break;
		case 4: 
			money = time*4000;
			break;
		default:
			System.out.println("올바른 코드를 입력하세요");
		}
		
		System.out.println(name+"님의 임금은 "+money+"원 입니다.");
		
		
		
	}

}
