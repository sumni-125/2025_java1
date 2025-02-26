package day09.학생_this.책정보출력_권지언;

import java.util.Scanner;

public class 책정보출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book();
	
		System.out.println("책 이름 입력");
		b.book_name = sc.nextLine();
		System.out.println("작가 입력");
		b.author = sc.nextLine();
		System.out.println("가격 입력");
		b.price = sc.nextInt();
		
		b.입력(b.book_name,b.author,b.price);
		b.출력();
		
		Book2 a = new Book2();
		
		a.입력(sc);
		a.출력();
		
		sc.close();
	}

}
