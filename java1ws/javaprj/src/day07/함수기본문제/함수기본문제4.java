package day07.함수기본문제;

import java.util.Arrays;

public class 함수기본문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottonums = lottonum();
		
		System.out.println(Arrays.toString(lottonums));
	}
	public static int[] lottonum() {
		int[] lottonums = {7,13,18,36,39,45};
		return lottonums;
	}
}
