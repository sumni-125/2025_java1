package day06;

import java.util.Scanner;

public class 실습문제1번1_이수민 {

	public static void main(String[] args) {
		//1. 화폐매수 구하기
		
		//매수 count용
		int fifty_th=0, ten_th=0, 
				five_th=0, th=0, 
				five_hun=0, hun=0, fifty=0, ten=0;
		
		Scanner sc = new Scanner(System.in);
		
		String[] m_unit= {"오만원","만원","오천원","천원","오백원","백원","오십원","십원"};
		String name;//사원 이름 저장변수
		
		int[] m_pur=new int[8]; //화폐 매수 저장
		int exp=0;//출장비용 저장변수
		
		System.out.println("이름과 출장비용을 입력하세요");
		name=sc.next();
		exp=sc.nextInt();
		while(exp>0) {
			if(exp>=50000) {
				
				fifty_th=m_pur[0]=exp/50000;
				exp-=50000*fifty_th;
				
			}else if(exp>=10000) {
				
				ten_th=m_pur[1]=exp/10000;
				exp-=10000*ten_th;
				
			}else if(exp>=5000) {
				
				five_th=m_pur[2]=exp/5000;
				exp-=5000*five_th;
				
			}else if(exp>=1000) {
				
				th=m_pur[3]=exp/1000;
				exp-=1000*th;
				
			}else if(exp>=500) {
				
				five_hun=m_pur[4]=exp/500;
				exp-=500*five_hun;
				
			}else if(exp>=100) {
				
				hun=m_pur[5]=exp/100;
				exp-=100*hun;
			
			}else if(exp>=50) {
				
				fifty=m_pur[6]=exp/50;
				exp-=50*fifty;
				
			}else {
				
				ten=m_pur[7]=exp/10;
				exp-=10*ten;
						
			}
		}
		
		System.out.print("오만원: "+fifty_th+" 만원: "+ten_th+
				" 오천원: "+five_th+" 천원: "+th+" 오백원: "+
				five_hun+" 백원: "+hun+" 오십원: "+fifty+
				" 십원: "+ten);
		System.out.println();
		for(int i=0;i<m_pur.length;i++) {
			System.out.print(m_unit[i]+": "+m_pur[i]+" ");
		}
		
		
		
	}

}
