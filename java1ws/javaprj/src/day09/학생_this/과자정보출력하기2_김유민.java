package day09.학생_this;

public class 과자정보출력하기2_김유민 {

	public static void main(String[] args) {
		
		Snack2_김유민 obj = new Snack2_김유민();
		
		obj.InfoSnack2(
				"맛동산",
				"농심",
				"600kcal",
				"탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g",
				
				"600g",
				"2025_02_25",
				"1975_08_17"
				);
		obj.printSnack();
		
		
		Snack2_김유민 obj2 = new Snack2_김유민();
		
		obj2.InfoSnack2(
				"오레오",
				"농심",
				"250kcal",
				"탄수화물:33g, 당류:30g, 지방:12g, 포화지방:5g, 단백질:2g",
				
				"300g",
				"2025_07_25",
				"1958_10_09"
				);
		obj2.printSnack();
	}
}