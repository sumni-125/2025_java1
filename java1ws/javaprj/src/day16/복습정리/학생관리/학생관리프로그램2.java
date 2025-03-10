package day16.복습정리.학생관리;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class 학생관리프로그램2 {
	
	
	  ArrayList<Score> studentList = new ArrayList<>();
      Scanner sc = new Scanner(System.in);

      
      
      public void init() {

          studentList.add(new Score("홍길동", 1, 85));
          studentList.add(new Score("김길동", 2, 90));
          studentList.add(new Score("박길동", 3, 78));
          
      }
      
      
      
      public void register() {
    	     System.out.println("학생 이름을 입력하세요:");
             String name = sc.nextLine();
             System.out.println("학생 ID를 입력하세요:");
             int studentId = sc.nextInt();
             System.out.println("학생 점수를 입력하세요:");
             int score = sc.nextInt();
             sc.nextLine(); //  

             studentList.add(new Score(name, studentId, score));
             System.out.println("학생이 등록되었습니다.");
      }
      
      
      public void search() {
    	  System.out.println("학생 목록:");
          if (studentList.isEmpty()) {
              System.out.println("등록된 학생이 없습니다.");
          } else {
              for (Score student : studentList) {
                  System.out.println(student);
              }
          }
      }
      
      
      public void update() {
    	  System.out.println("변경할 학생의 ID를 입력하세요:");
          int idToUpdate = sc.nextInt();
          sc.nextLine(); 

          boolean found = false;
          
          for (Score student : studentList) {
              if (student.getStudentId() == idToUpdate) {
                  System.out.println("현재 정보: " + student);
                  System.out.println("새로운 이름을 입력하세요:");
                  String newName = sc.nextLine();
                  System.out.println("새로운 점수를 입력하세요:");
                  int newScore = sc.nextInt();
                  sc.nextLine();  

                  //setter로 변경하기
                  student.setName(newName);
                  student.setScore(newScore);
                  System.out.println("학생 정보가 변경되었습니다.");
                  found = true;
                  break;
              }
          }
          if (!found) {
              System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
          }
      }
      
      
      public void delete() {
    	  System.out.println("삭제할 학생의 ID를 입력하세요:");
          int idToDelete = sc.nextInt();
          sc.nextLine();  

          // 먼저 삭제할 학생을 찾기 
         Score  toDelete =  null;   //반복문에서 삭제하지 않도록 한다
          for (Score student : studentList) {
              if (student.getStudentId() == idToDelete) {
                  toDelete = student ;
              }
          }

          // 삭제 리스트를 기반으로 실제 삭제
          if ( toDelete  != null) {
              studentList.remove(toDelete);
              System.out.println("학생 정보가 삭제되었습니다.");
          } else {
              System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
          }
      }
      
      public void run() {
    	  
    	  init();
    	  
    	  while (true) {
              System.out.println("1. 등록  2. 조회  3. 변경  4. 삭제  5. 종료");
              int menu = sc.nextInt();
              
              sc.nextLine(); //     엔터 읽기

              switch (menu) {
                  case 1: // 등록
                 
                	  register();
                      break;

                  case 2: // 조회
                     
                	  search();
                      break;

                  case 3: // 변경
                      update();
                      break;

                  case 4: // 삭제
                    
                	  delete();
                      break;

                  case 5: // 종료
                      System.out.println("프로그램을 종료합니다.");
                      sc.close();
                      return;

                  default:
                      System.out.println("잘못된 입력입니다. 다시 시도하세요.");
              }
          }
      }

    public static void main(String[] args) {
    	
    	
    	학생관리프로그램2  p = new 학생관리프로그램2();
    	p.run();


      
    }
}
