package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
//15. 연산자를 입력받아 "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"   (해당되면 연산자이다, 연산자가 아니다 출력) 연산자 여부를 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		String op="";
		op=sc.nextLine();
		
		//if문 사용
		if (op.equals("+")||op.equals("-")|| 
				op.equals("*")||
				op.equals("/")||
				op.equals("%")||
				op.equals("=")||
				op.equals("<")|| 
				op.equals(">")||
				op.equals("!")||
				op.equals("&&")||
				op.equals("||")) {
			
			System.out.println("연산자입니다.(if문 사용)");
			
		}else {
			System.out.println("연산자가 아닙니다.(if문 사용)");
		}
		
		//switch 문 사용
		switch(op) {
		case "+":
		case "-":
		case "*":
		case "/":
		case "%":
		case "=": 
		case "<": 
		case ">": 
		case "!":
		case "&&": 
		case "||":
			System.out.println("연산자입니다.(switch문 사용)");
			break;
		default:
			System.out.println("연산자가 아닙니다.(switch문 사용)");
		}
		

	}

}
