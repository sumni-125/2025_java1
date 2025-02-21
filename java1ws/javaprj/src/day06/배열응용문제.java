package day06;

import java.util.ArrayList;
import java.util.Scanner;
public class 배열응용문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		
		//수가 입력될때 짝수만 배열에 저장 후 출력(0 입력시 종료)
		
		Scanner sc = new Scanner(System.in);
//		int insert = 0;
//		int index = 0;
//		
//		
//
//		for(int i=0; i<arr.length; i++) {
//			insert = sc.nextInt();
//			if(insert == 0) {
//				break;
//			}else if(insert %2 == 0) {
//				arr[index] = insert;
//				index ++;
//				
//			}												
//			
//		}
//		for(int i=0; i<index; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//		System.out.print("=============================");
		
		
		//배열의 평균값 보다 큰 요소 구하기
//		  int[]  Temperatures  =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;
//		  int sum = 0;
//		  int num = 0;
//		  int result = 0;
//		  int count = 0;
//		  for (int i=0; i<Temperatures.length; i++) {
//			  num = Temperatures[i];
//			  sum += num;			  
//		  }
//		  result = sum / Temperatures.length;
//		  for(int i=0; i<Temperatures.length; i++) {
//			  if(Temperatures[i]>result) {
//				 count++;
//				 
//			  }
//			 
//		  }
//		  System.out.println(count);
		  
		  
		  
		  //임의의 수가 입력되고 입력한 수에 대한 약수를 배열에 저장하고 출력하기
		  //-배열사용하지 않기
		  //-배열을 사용하여 약수를 모두 구한 후 한번에 출력하기
		  
		  int yak = sc.nextInt();
		  int result = 0;
		  int index = 0;

		  ArrayList<Integer> nums = new ArrayList<>();
		  
		  
//	  for(int i=1; i<=yak; i++) {
//			  
//			  if(yak % i == 0) {
//				  System.out.println(i);
//			  }
//		  }
		  
		  for(int i=1; i<=yak; i++) {
			  if(yak % i == 0) {
				 nums.add(i);				 
			  }
			  
			  
		  }
		  System.out.println(nums);
		 
		  
		 
	 
		System.out.println();
		System.out.println("============================");
		  
		  
		  //char 2차원 배열(5*5) 배열을 만들고 배열의 태두리 요소에 '*' 넣기
		  String[][] star = new String[5][5];
		  
		  
		  
		  for(int i=0; i<star.length; i++) {
			  System.out.println();
			  for(int j=0; j<star[i].length; j++) {
				  if(i==0) {
					  star[i][j] = "*";
				  }
				  else if(j == 0) {
					  star[i][j] = "*";
				  }
				  else if(j == 4) {
					  star[i][j] = "*";
				  }
				  else if(i == 4) {
					  star[i][j] = "*";
				  }
				  else {
					  star[i][j] = "-";
				  }
				  System.out.printf(star[i][j]);
				  
			  }
		  }

		  
		  
		  
		 
		  
		  
		  
		  


	}

}
