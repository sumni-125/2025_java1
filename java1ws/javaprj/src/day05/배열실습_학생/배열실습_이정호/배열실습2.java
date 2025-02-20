package day05.배열실습_학생.배열실습_이정호;

public class 배열실습2 {

	public static void main(String[] args) {
		//2차원
		String[][] MBTI_2 = {
				{"ISTJ", "ISTP", "ISFJ", "ISFP"},
				{"INTJ", "INTP", "INFJ", "INFP"},
				{"ESTJ", "ESTP", "ESFJ", "ESFP"},
				{"ENTJ", "ENTP", "ENFJ", "ENFP"}
		};
		
		System.out.println("2차원");
		for(int i = 0; i < MBTI_2.length; i++) {
			for(int j = 0; j < MBTI_2[i].length; j++) {
				System.out.print(MBTI_2[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println();

		//3차원
		String[][][] MBTI_3 = {
				{
					{"ISTJ", "ISTP", "ISFJ", "ISFP"},
					{"INTJ", "INTP", "INFJ", "INFP"}
				},
				{
					{"ESTJ", "ESTP", "ESFJ", "ESFP"},
					{"ENTJ", "ENTP", "ENFJ", "ENFP"}
				}
		};
		
		System.out.println("3차원");
		for(int i = 0; i < MBTI_3.length; i++) {
			for(int j = 0; j < MBTI_3[i].length; j++) {
				for(int k = 0; k < MBTI_3[i][j].length; k++) {
					System.out.print(MBTI_3[i][j][k] + ", ");
				}
				System.out.println();
			}
		}
	}

}
