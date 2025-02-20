package day05.배열실습_학생.실습_배열_김유민;

public class 실습_배열3차원_김유민 {

	public static void main(String[] args) {
		
		String school[][][] = {
				{
					{"1학년-1반-1번","1학년-1반-2번","1학년-1반-3번"},
					{"1학년-2반-1번","1학년-2반-2번","1학년-2반-3번"},
					{"1학년-3반-1번","1학년-3반-2번","1학년-3반-3번"}
				},
				
				{
					{"2학년-1반-1번","2학년-1반-2번","2학년-1반-3번"},
					{"2학년-2반-1번","2학년-2반-2번","2학년-2반-3번"},
					{"2학년-3반-1번","2학년-3반-2번","2학년-3반-3번"}
				},
				
				{
					{"3학년-1반-1번","3학년-1반-2번","3학년-1반-3번"},
					{"3학년-2반-1번","3학년-2반-2번","3학년-2반-3번"},
					{"3학년-3반-1번","3학년-3반-2번","3학년-3반-3번"}
				}
		};
		
		
		System.out.println("-배열상 위치로 출력-");
		System.out.println();
		
		System.out.println("★1학년 학생★");
		System.out.println(school[0][0][0]);
		System.out.println(school[0][0][1]);
		System.out.println(school[0][0][2]);
		System.out.println();
		
		System.out.println(school[0][1][0]);
		System.out.println(school[0][1][1]);
		System.out.println(school[0][1][2]);
		System.out.println();
		
		System.out.println(school[0][2][0]);
		System.out.println(school[0][2][1]);
		System.out.println(school[0][2][2]);
		
		
		System.out.println("★2학년 학생★");
		System.out.println(school[1][0][0]);
		System.out.println(school[1][0][1]);
		System.out.println(school[1][0][2]);
		System.out.println();
		
		System.out.println(school[1][1][0]);
		System.out.println(school[1][1][1]);
		System.out.println(school[1][1][2]);
		System.out.println();
		
		System.out.println(school[1][2][0]);
		System.out.println(school[1][2][1]);
		System.out.println(school[1][2][2]);
		
		
		
		System.out.println("★3학년 학생★");
		System.out.println(school[2][0][0]);
		System.out.println(school[2][0][1]);
		System.out.println(school[2][0][2]);
		System.out.println();
		
		System.out.println(school[2][1][0]);
		System.out.println(school[2][1][1]);
		System.out.println(school[2][1][2]);
		System.out.println();
		
		System.out.println(school[2][2][0]);
		System.out.println(school[2][2][1]);
		System.out.println(school[2][2][2]);
		System.out.println();
		
		
		
		System.out.println("-반복문으로 출력-");
		System.out.println();
		
		for(int i=0;i<school.length;i++) {
			for(int j=0;j<school[i].length;j++) {
				System.out.println();
				for(int k=0;k<school[i][j].length;k++) {
					System.out.println(school[i][j][k]);
				}
			}
		}
		

	}

}
