package day16.io.객체읽기쓰기;

import java.io.Serializable;

//Object 스트림을 이용할 때는 Serializable 인터페이스를 구현해야 한다 ( 마커인터페이스 : 표시용 인터페이스 )) 
class Score2 implements Serializable {
 private String name;
 private int koreanScore;
 private int englishScore;
 private int mathScore;
 private double avg;
 private char grade;
 
 

 public Score2(String name, int koreanScore, int englishScore, int mathScore) {
     this.name = name;
     this.koreanScore = koreanScore;
     this.englishScore = englishScore;
     this.mathScore = mathScore;
     
     
     calculateGrade();
 }

 public String getName() {
     return name;
 }

 public int getKoreanScore() {
     return koreanScore;
 }

 public int getEnglishScore() {
     return englishScore;
 }

 public int getMathScore() {
     return mathScore;
 }

 
 
 public double getAvg() {
	return avg;
}

public char getGrade() {
	return grade;
}

private void calculateAverage() {
    avg = (koreanScore + englishScore + mathScore) / 3.0;
 }
 
 

 private  void  calculateGrade() {
      calculateAverage();
     if (avg >= 90) {
         grade = 'A';
     } else if (avg >= 80) {
    	 grade= 'B';
     } else if (avg >= 70) {
    	 grade = 'C';
     } else if (avg >= 60) {
    	 grade=  'D';
     } else {
         grade = 'F';
     }
 }
}
