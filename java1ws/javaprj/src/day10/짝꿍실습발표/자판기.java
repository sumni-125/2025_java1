package day10.짝꿍실습발표;

import java.util.Scanner;

public class 자판기 {
	
	String name;
	int price;
	double volume;
	double calories;
	String taste;
	int change;
	int money;
	
	String manufacture;
	String expDate;
	
	
	public void beverageInfo(String name, int price, double volume, double calories, String taste, String manufacture, String expDate) {
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.calories = calories;
		this.taste = taste;
		this.manufacture = manufacture;
		this.expDate = expDate;
	}
	
	public void snackInfo(String name, int price, double volume, double calories, String taste, String manufacture, String expDate) {
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.calories = calories;
		this.taste = taste;
		this.manufacture = manufacture;
		this.expDate = expDate;
	}
	
	public int calc() {
		change = money-price;
		return change;
	}
	
	public int beverageInfoOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 넣으시겠습니까?");
		money = sc.nextInt();
		
		System.out.println("거스름돈은: "+calc()+" 입니다");
		System.out.println("음료이름: "+this.name);
		System.out.println("음료가격: "+this.price+"원");
		System.out.println("음료용량: "+this.volume+"ml");
		System.out.println("음료열량: "+this.calories+"kcal");
		System.out.println("음료 맛: "+this.taste);
		System.out.println("제조회사: "+this.manufacture);
		System.out.println("유통기한: "+this.expDate);
		return calc();
	}
	
	public int snackInfoOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 넣으시겠습니까");
		money = sc.nextInt();
		
		System.out.println("거스름돈은: "+calc()+" 입니다");
		System.out.println("과자이름: "+this.name);
		System.out.println("과자가격: "+this.price+"원");
		System.out.println("과자용량: "+this.volume+"cc");
		System.out.println("과자열량: "+this.calories+"kcal");
		System.out.println("과자 맛: "+this.taste);
		System.out.println("제조회사: "+this.manufacture);
		System.out.println("유통기한: "+this.expDate);
		return calc();
	}
	
	
}
