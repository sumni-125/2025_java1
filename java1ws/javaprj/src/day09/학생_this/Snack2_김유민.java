package day09.학생_this;

public class Snack2_김유민 {
 
		String name;
		String company;
		String calories;
		String info;
		String gram;
		String expDate;
		String bornyear;
		
		
		public void InfoSnack() {
			
			
			this.name="맛동산";
			this.company="농심";
			this.calories="600kcal";
			this.info="탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g";
			
			this.gram= "600g";
			this.expDate= "2025_02_25";
			this.bornyear="1975_08_17";
			
			
			
			this.name="오레오";
			this.company="농심";
			this.calories="250kcal";
			this.info="탄수화물:33g, 당류:30g, 지방:12g, 포화지방:5g, 단백질:2g";
			
			this.gram= "300g";
			this.expDate= "2025_07_25";
			this.bornyear="1958_10_09";
		
		}
		
			public void InfoSnack2(
					String name,String company,
					String calories,String info,String gram,
					String expDate,String bornyear
					)
			{
			
			
			this.name=name;
			this.company=company;
			this.calories=calories;
			this.info=info;
			
			this.gram= gram;
			this.expDate= expDate;
			this.bornyear=bornyear;
		
		}
		
		
		
		public void printSnack() {
			System.out.println("과자이름: "+this.name);
			System.out.println("제조사: "+this.company);
			System.out.println("칼로리: "+this.calories);
			System.out.println("영양정보: "+this.info);
			System.out.println("무게: "+this.gram);
			System.out.println("유통기한: "+this.expDate);
			System.out.println("출시일: "+this.bornyear);
			System.out.println("============");
		}


	
}
