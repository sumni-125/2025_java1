package day05;

public class 배열_2차원 {

	public static void main(String[] args) {
		String[][] teams = {
				{"권지언" ,  "김민환",  "김보성" , "김유민" },
				{ "박수경" ,  "박시우" ,"박예린" , "오윤석" }, 
				{"윤현기" ,"이동우" ,  "이수민" , "이정호" },     
				{"임형택" , "정연수" , "최지태" , "최하은" , "황예지"}
		};

		for(int i=0;i<teams.length;i++) {//2개 =>0행, 1행
			System.out.println(i+1+"조");
			for(int j=0;j<teams[i].length;j++) {
				
				System.out.print(teams[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
