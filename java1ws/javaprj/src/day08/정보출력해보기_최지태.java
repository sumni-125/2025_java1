package day08;

import java.util.Scanner;

public class 정보출력해보기 {

	public static void main(String[] args) {
		object obj = new object();
		
		setObject(obj);
		System.out.println("=========");
		printObject(obj);
	}

	public static void setObject(object obj) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		obj.id = sc.nextInt();
		System.out.print("이름 입력 : ");
		obj.name = sc.next();
		System.out.print("개수 입력 : ");
		obj.count = sc.nextInt();
		System.out.print("가격 입력 : ");
		obj.price = sc.nextInt();
	}
	
	public static void printObject(object obj) {
		System.out.println("아이디 : " + obj.id);
		System.out.println("이름 : " + obj.name);
		System.out.println("개수 : " + obj.count);
		System.out.println("가격 : " + obj.price);
	}

}
