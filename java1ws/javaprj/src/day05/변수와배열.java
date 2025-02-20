package day05;

public class 변수와배열 {

	public static void main(String[] args) {
		
		//변수5개: 개별적으로 공간에 확보됨, 변수이름으로 접근한다., 반복문 사용 불가
		//배열(5개): 연속적으로 공간확보, 반복문을 사용할 수 있음
		
		//문자열 5개 사용하기
		//"권지언" ,  "김민환",  "김보성" , "김유민" , "박수경"
		
		//변수와 배열로 저장하고 출력하기
		
		String n1="권지언";
		String n2="김민환";
		String n3="김보성";
		String n4="김유민";
		String n5="박수경";

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		/*
		String[] names = new String[5];
		names[0]="권지언";
		names[0]="김민환";
		names[0]="김보성";
		names[0]="김유민";
		names[0]="박수경";*/
		
		String[] names = {"권지언" ,  "김민환",  "김보성" , "김유민" , "박수경"};
		//String[] names = new String[]{"권지언" ,  "김민환",  "김보성" , "김유민" , "박수경"};
		
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
