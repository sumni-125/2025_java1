package day06;

import java.util.Scanner;

public class 실습문제1번2_이수민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] m_unit= {"오만원","만원","오천원","천원","오백원","백원","오십원","십원"};
		String name;//사원 이름 저장변수
		int[] m_pur=new int[8]; //화폐 매수 저장
		int exp=0;//출장비용 저장변수
		
		loop: while(true) {
			System.out.println("이름과 출장비용을 입력하세요");
			
			
			name=sc.next();
			
			if(name.equals("stop")) {
				break loop;
			}
			
			exp=sc.nextInt();
			while(exp>0) {
				if(exp>=50000) {
					
					m_pur[0]=exp/50000;
					exp-=50000*m_pur[0];
					
				}else if(exp>=10000) {
					
					m_pur[1]=exp/10000;
					exp-=10000*m_pur[1];
					
				}else if(exp>=5000) {
					
					m_pur[2]=exp/5000;
					exp-=5000*m_pur[2];
					
				}else if(exp>=1000) {
					
					m_pur[3]=exp/1000;
					exp-=1000*m_pur[3];
					
				}else if(exp>=500) {
					
					m_pur[4]=exp/500;
					exp-=500*m_pur[4];
					
				}else if(exp>=100) {
					
					m_pur[5]=exp/100;
					exp-=100*m_pur[5];
				
				}else if(exp>=50) {
					
					m_pur[6]=exp/50;
					exp-=50*m_pur[6];
					
				}else {
					
					m_pur[7]=exp/10;
					exp-=10*m_pur[7];
							
				}
			}
			System.out.println(name+"님의 출장비용");
			for(int i=0;i<m_pur.length;i++) {
				System.out.print(m_unit[i]+": "+m_pur[i]+" ");
				m_pur[i]=0;//0으로 초기화
			}
			System.out.println();
		}

		
	}

}
