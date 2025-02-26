package day09.샘플.자판기;

// class  정의한 것 
// 데이타  + 데이타 다루는 함수 
public class 커피데이타2 {
	//데이타 (멤버변수)
	int 설탕=1000;
	int 프리마=1000;
	int 원두=1000 ;
	int 물=10000;
	int 매출금액=0; 	
 
	//
	//public void fillCofffee( 커피데이타2  this) 
	public  void fillCoffee( ) {   // this 참조형변수를 자동으로 제공함 
		this.물 += 1000;            // static 아닌 매서드들은 this 가 제공됨
		this.원두  +=100;
		this.설탕  +=100;
		this.프리마 +=100;
	}

	public   void printInfo( ) {
		System.out.println( " 현재커피 정보 출력");
		System.out.println( this.매출금액);
		System.out.println( this.물);		 
		System.out.println( this.설탕);		 
		System.out.println( this.원두);
		System.out.println( this.프리마);
	}
	
	
	
	
	public   String 밀크커피만들기 (  int 돈) {
		
		 if( 돈 ==100) {
			 System.out.println(" 밀크커피 만들기");
			 this.물 = this.물 -10;
			 this.설탕 -= 20;
			 this.원두 -=10;
			 this.프리마 -=10;			 
			 return "밀크커피 드세요";
		 }		
		 return "돈이 부족";
		
	}
	
}
 