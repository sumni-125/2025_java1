package day07.함수문제;

public class 함수문제1 {

	public static void main(String[] args) {
		// 1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기 
		
		int[] su = {1,2,3,6,8,4,15,3,598,15,22,74};
		
		int cnt = 짝수(su);
		
		System.out.println("짝수의 개수는 "+cnt+"개");
	}
	public static int 짝수(int[] su) {
		int cnt=0;
		for(int i=0;i<su.length;i++) {
			if(su[i]%2==0) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
