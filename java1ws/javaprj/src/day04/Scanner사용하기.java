package day04;
import java.util.Scanner;

public class Scanner사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		double avg;
		
		name = sc.nextLine();
		kor = Integer.parseInt(sc.nextLine());
		kor = Integer.parseInt(sc.nextLine());	
		avg = Double.parseDouble(sc.nextLine());
		
		System.out.println(name);
		System.out.println(kor);
		
		System.out.println(avg);
	
	}

}
