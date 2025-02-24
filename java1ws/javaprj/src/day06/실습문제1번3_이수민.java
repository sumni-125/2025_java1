package day06;

import java.util.Scanner;

public class 실습문제1번3_이수민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] m_unit= {"오만원","만원","오천원","천원","오백원","백원","오십원","십원"};
		String[] names=new String[1000];
		String name;//사원 이름 저장변수
		int[][] m_pur=new int[1000][8]; //화폐 매수 저장
		int exp=0, exp_sum=0;//출장비용 저장변수
		int index=0;//배열저장용 인덱스(행)
		
		loop: while(true) {
			System.out.println("이름과 출장비용을 입력하세요");
			
			
			name=sc.next();

			if(name.equals("stop")) {
				break loop;
			}
			names[index]=name;
			
			exp=sc.nextInt();
			exp_sum+=exp;
			while(exp>0) {
				if(exp>=50000) {
					
					m_pur[index][0]=exp/50000;
					exp-=50000*m_pur[index][0];
					
				}else if(exp>=10000) {
					
					m_pur[index][1]=exp/10000;
					exp-=10000*m_pur[index][1];
					
				}else if(exp>=5000) {
					
					m_pur[index][2]=exp/5000;
					exp-=5000*m_pur[index][2];
					
				}else if(exp>=1000) {
					
					m_pur[index][3]=exp/1000;
					exp-=1000*m_pur[index][3];
					
				}else if(exp>=500) {
					
					m_pur[index][4]=exp/500;
					exp-=500*m_pur[index][4];
					
				}else if(exp>=100) {
					
					m_pur[index][5]=exp/100;
					exp-=100*m_pur[index][5];
				
				}else if(exp>=50) {
					
					m_pur[index][6]=exp/50;
					exp-=50*m_pur[index][6];
					
				}else {
					
					m_pur[index][7]=exp/10;
					exp-=10*m_pur[index][7];
							
				}
				
			}
			index++;
			
		}
		for(int i=0;i<index;i++) {
			System.out.println(names[i]+"님의 출장비용");
			for(int j=0;j<m_pur[i].length;j++) {
				System.out.print(m_unit[j]+": "+m_pur[i][j]+" ");
			//m_pur[i]=0;//0으로 초기화
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("총 필요한 금액: "+exp_sum);
		
		for(int j=0;j<7;j++) {
			for(int i=1;i<index;i++) {
				m_pur[0][j]+=m_pur[i][j];
			}
			
			System.out.print(m_unit[j]+": "+m_pur[0][j]+" ");
		}
		

		
	}

}
