package day06;

import java.util.Scanner;

public class 학생등록하기 {

	public static void main(String[] args) {
		
		
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		int index=0;
		
		while(index<names.length) {
			String name = sc.next();
			names[index]=name;
			index++;
			
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}

}
