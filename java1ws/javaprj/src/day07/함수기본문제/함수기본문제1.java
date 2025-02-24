package day07.함수기본문제;

public class 함수기본문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtract(5,8));
	}
	public static int subtract(int n1, int n2) {
		int sub=0;
		if(n1>n2) {
			sub=n1-n2;
		}else {
			sub=n2-n1;
		}
		return sub;
	}
}
