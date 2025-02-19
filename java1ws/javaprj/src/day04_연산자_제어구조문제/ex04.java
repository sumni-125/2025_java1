package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 4. 고객정보(아이디, 이름,  나이 ,키 )입력받아서 출력하기

		Scanner sc = new Scanner(System.in);
		
		String name, id;
		int age, height;
		
		id=sc.nextLine();
		name=sc.nextLine();
		age= Integer.parseInt(sc.nextLine());
		height= Integer.parseInt(sc.nextLine());
		
		System.out.println("id: "+id+", 이름: "+name+", 나이: "+age+", 키: "+height);
	}

}
