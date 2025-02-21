package day05;

import java.util.Arrays;
import java.util.Scanner;

public class 짝수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int su=sc.nextInt();//임의의 수 입력
		int[] div= new int[su]   ;//약수를 저장하는 배열
		
		
		int index=0;//배열 인덱스
		
		for(int i=1;i<=su;i++) {
			
			if(su%i==0) {
				
				div[index]=i;
				index++;
			}
		}
		
		
		
		for(int i=0;i<index;i++) {
			System.out.print(div[i]+" ");
		}
		
		
		
		int[]  result  =Arrays.copyOf(div, index);
		
		System.out.println(  Arrays.toString(result));
	}

}
