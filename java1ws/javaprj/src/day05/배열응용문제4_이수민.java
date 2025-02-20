package day05;

public class 배열응용문제4_이수민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] star = new String[5][5];
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				if(i==0||i==4||j==0||j==4) {
					star[i][j]="*";
					
				}else {
					star[i][j]=" ";
				}
				System.out.print(star[i][j]);	
			}
			System.out.println();
		}
		
	}

}
