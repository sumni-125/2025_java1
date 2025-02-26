package day09.학생_this;

public class 변수함수_김민환 {
	String movie;
	int time;
	int price;
	
	Object[][] movieInfo = new Object[3][3];
	
	public void 영화정보입력() {
		this.movieInfo[0][0] = this.movie = "테스트1";
		this.movieInfo[0][1] = this.time = 1;
		this.movieInfo[0][2] = this.price = 1;
		
		this.movieInfo[1][0] = this.movie = "테스트2";
		this.movieInfo[1][1] = this.time = 2;
		this.movieInfo[1][2] = this.price = 2;
		
		this.movieInfo[2][0] = this.movie = "테스트3";
		this.movieInfo[2][1] = this.time = 3;
		this.movieInfo[2][2] = this.price = 3;
	}
	
	public void 영화정보출력() {
		for(int i=0; i<movieInfo.length; i++) {
			System.out.println("영화이름:" + movieInfo[i][0]);
			System.out.println("영화시간:" + movieInfo[i][1]);
			System.out.println("영화가격:" + movieInfo[i][2]);
		}
	}
	
}
