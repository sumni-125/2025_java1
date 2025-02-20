package day05;

public class 배열_3차원 {

	public static void main(String[] args) {
		//3차원 배열
		//3차원배열: 2차원 배열을 요소로 가지는 배열
		
		//면, 행, 열 접근해야 기억장소에 접근할 수 있다.
		String[][][] menus = new String[2][3][3]; //3행 3열 2차원배열 2개
		
		String[][][] arr3 = {
				{
					{"🎈1","🎈2","🎈3"},
					{"🎈4","🎈5","🎈6"},
					{"🎈7","🎈8","🎈9"}
				},
				{
					{"🥨1","🥨2","🥨3"},
					{"🥨4","🥨5","🥨6"},
					{"🥨7","🥨8","🥨9"}
				},
		};
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
