package day13.objectEx;

public class Score {
	
	int kor;
	int eng;
	
	
	//
	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return kor+", "+eng;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		Score s = (Score)obj;
		if(this.kor == s.kor && this.eng == s.eng) {
			result = true;
		}
		
		return result;
	}
	
}
