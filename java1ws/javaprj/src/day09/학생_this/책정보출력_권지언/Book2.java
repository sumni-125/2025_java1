package day09.학생_this.책정보출력_권지언;

import java.util.Scanner;

public class Book2 {

	String book_name;
	String author;
	int price;

	public void 입력(Scanner sc) {
		System.out.println("책 이름 입력");
		this.book_name = sc.nextLine();
		System.out.println("작가 입력");
		this.author = sc.nextLine();
		System.out.println("가격 입력");
		this.price = sc.nextInt();	
	}
	
	public void 출력() {
		System.out.println("책 이름 : "+this.book_name);
		System.out.println("작가 : "+this.author);
		System.out.println("가격 : "+this.price+"원");
	}
}
