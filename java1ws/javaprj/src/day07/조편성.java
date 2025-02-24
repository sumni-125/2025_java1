package day07;

import java.util.Random;


public class 조편성 {
    public static void main(String[] args) throws InterruptedException {

    	
    	//황예지
        String[] students = new String[]{
        		   "권지언", "김민환", "김보성", "김유민" ,
                   "박수경", "박시우", "박예린", "오윤석" ,
                   "윤현기", "이동우", "이수민", "이정호" ,
                   "임형택", "정연수", "최지태", "최하은"  
        };
        
        

        Random random = new Random();

        //랜덤을 이용해서 배열 섞기 (배열 요소 섞기)
        // i, j 번째 요소 바꾸기 
        
        for (int i = students.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);   //  0~ 범위전 까지 내에서 랜덤 수 가져옴 
            String temp = students[i];
            students[i] = students[j];
            students[j] = temp;
        }
        

        // 2차원 배열 생성 (예: 4개의 조, 각 조에 4명씩)
        String[][] groups = new String[4][4 ];
        
      

        // 2차원 배열에 학생 이름을 배정
        for (int i = 0; i < students.length; i++) { 
        	
            int row = i / 4;  // 조 인덱스 계산   
            int column = i % 4;  // 조 내에서 학생 인덱스 계산
            
            groups[row][column] = students[i];
        }
        
        
        
        //3초후 출력하기
        
        Thread.sleep(5000);

        // 2차원 배열 출력
        
        
        System.out.println( "==>조 편성 ^^ 축하합니다. 재미있게 같이 해 주세요 ");
        System.out.println( "예지님은   4개 조 중에서 마음에 드는 조를 선택해 주세요 !!");
        System.out.println();  // 행이 끝나면 줄바꿈
        System.out.println();  // 행이 끝나면 줄바꿈
        
        
        
        for (int i = 0; i < groups.length; i++) {  // 행 반복
        	
            System.out.print("조 " + (i + 1) + ": ");
            for (int j = 0; j < groups[i].length; j++) {  // 열 반복
                System.out.print(groups[i][j] + " ");  // 각 요소 출력
            }
            System.out.println();  // 행이 끝나면 줄바꿈
            
        }
    }
}


/*
i      row (/4)    column(%4)

0        0               0           1행
1        0               1
2        0               2
3        0               3


4        1               0           2행
5        1               1
6        1               2
7        1               3


8        2               0           3행
9        2               1
10       2               2
11       2               3


12       3               0           4행
13       3               1
14       3               2
15       3               3
 

 */
