package day16.복습정리.학생관리;

import java.util.ArrayList;
import java.util.Scanner;

public class 실습학생관리 {

	public static void main(String[] args) {
		 
		
		
        ArrayList<Score> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        studentList.add(new Score("홍길동", 1, 85));
        studentList.add(new Score("김길동", 2, 90));
        studentList.add(new Score("박길동", 3, 78));
        
        
        
        
        
        //등록
        
        System.out.println("이름, 아이디, 성적 입력");
        
        
        String name  = sc.nextLine();
        int id  = sc.nextInt();
        int kor  = sc.nextInt();
        
        sc.nextLine();
        
        
        Score s  = new Score( name, id, kor);
        studentList.add(s);
        
        
        
        
        
        
        //조회
        //
        for( Score score : studentList) {
        	System.out.println( score.toString());
        }
        
        
        
        //변경
        System.out.println("학번입력하시오");
        int selectId  = sc.nextInt();
        
        Score searchScore= null;
        for(  Score score:studentList ) {
        	
        	if( score.getStudentId()==selectId ) {
        		searchScore = score;
        	}
        }
        
        System.out.println(  "학생성적변경");
        int updateScore = sc.nextInt();
        searchScore.setScore(updateScore);
        System.out.println("변경완료");
                
        
        
        //조회
        //
        for( Score score : studentList) {
        	System.out.println( score.toString());
        }
        
                
        //삭제        
        System.out.println("학번입력하시오");
        int deleteId  = sc.nextInt();
        
        Score deleteScore= null;
        for(  Score score:studentList ) {
        	
        	if( score.getStudentId()==deleteId ) {
        		deleteScore = score;
        	}
        }
        
        //
        studentList.remove(deleteScore);
        
        System.out.println("삭제되었다.");
		
        
        
      //조회
        //
        for( Score score : studentList) {
        	System.out.println( score.toString());
        }
		

	}

}
