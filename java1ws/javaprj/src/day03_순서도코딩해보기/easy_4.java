package day03_순서도코딩해보기;
import java.util.Scanner;

public class easy_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int posCnt=0, negCnt=0, evenCnt=0, oddCnt=0;
		 
		while(i<5) {
			int input = sc.nextInt();
			if(input>0) {
				posCnt++;
				if(input%2==0) {
					evenCnt++;
				}else {
					oddCnt++;
				}
			}else {
				negCnt++;
			}
			i++;
		}
		
		System.out.println("posCnt: "+posCnt);
		System.out.println("negCnt: "+negCnt);
		System.out.println("evenCnt: "+evenCnt);
		System.out.println("oddCnt: "+oddCnt);
	}

}
