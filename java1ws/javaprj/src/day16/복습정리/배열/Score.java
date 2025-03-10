package day16.복습정리.배열;

public class Score {
String name;
int kor;
int eng;
float avg;
char grade;

public Score(String name, int kor, int eng) {
	super();
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	
	calGrade();
}


 

//필요한 만큼 써터 게터 만들기
//필요한 매서드 만들기


private void calGrade() {
	calAvg();
	
	if( avg >= 90) grade='A';
	else if( avg>=80) grade='B';
	else if( avg>=70) grade='C';
	else grade='F';
	
}

private void calAvg() {
	int total  = kor+eng;
	avg = total/2.0f;     // float형 상수는  f를 붙임
	
}




@Override
public String toString() {
	return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + ", grade=" + grade + "]";
}





}
