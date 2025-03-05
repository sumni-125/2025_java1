package day13.arraylist;

public class Score {
	
	String name;
	int kor;
	int eng;
	double avg;
	
	
	//생성자
	public Score(String name, int kor, int eng) {
		 super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	}
	
	
	private void calc() {
		int total = kor+eng;
		avg= total/ 2.0;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public Score() {
		// TODO Auto-generated constructor stub
	}

	public void printInfo() {
		System.out.println( name);
		System.out.println( kor);
		System.out.println( eng);
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	} 
	
	
	

}
