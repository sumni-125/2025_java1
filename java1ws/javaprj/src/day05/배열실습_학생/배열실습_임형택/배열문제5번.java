package day05.배열실습_학생.배열실습_임형택;

public class 배열문제5번 {

	public static void main(String[] args) {
		
		String[][][] country = {
			    {
			        {"Korea", "Japan", "China", "Vietnam", "Thailand"},
			        {"USA", "Canada", "Mexico", "Brazil", "Argentina"}
			    },
			    {
			        {"France", "Germany", "Italy", "Spain", "UK"},
			        {"Egypt", "Nigeria", "South Africa", "Kenya", "Morocco"}
			    }
			};
		
		System.out.println("나라이름 3차원 배열");
		for(int k=0; k<2; k++) {
			for(int i=0; i<2; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(country[k][i][j]+"  ");
				}
			}
		}

		
	

	}

}
