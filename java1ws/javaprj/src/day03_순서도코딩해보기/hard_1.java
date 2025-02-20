package day03_순서도코딩해보기;

public class hard_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double k_people=1800000;
		double k_gRate=1.042;
		double h_people=2500000;
		double h_gRate=1.036;
		int year=1990;
		
		while(h_people>k_people) {
			h_people = h_people * h_gRate;
			k_people = k_people * k_gRate;
			year++;
		}
		System.out.println(year);
		
		
	}

}
