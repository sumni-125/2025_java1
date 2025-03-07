package day15.정렬.myarrays;

//
//public class Score  extends Object{
public class Score  implements    MyComparable{
	String name;
	int kor;
	int eng;	
	double avg;
	
	
	//생성자 오버로딩 (매개변수가 다른 여러개의 생성자를 말한다)
	public Score() {
		 
	}
	
	//생성자 (특별한  내서드)
	public Score(String name, int kor, int eng) {
	    super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calcAvg();
		
	}

	private void calcAvg() {
		
		int total  = kor+eng;
		avg = total/2;
		
	}
	

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Object another) {
		 
		 Score s = (Score) another;
		return this.kor - s.kor;
	}

	 
	 
	 
	
	

}
