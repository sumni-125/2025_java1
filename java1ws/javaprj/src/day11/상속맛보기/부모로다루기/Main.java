package day11.상속맛보기.부모로다루기;

public class Main {

	public static void main(String[] args) {
		 
		
		
		권지언 a = new 권지언(); 
		김민환 b = new 김민환(); 
		김보성 c = new 김보성(); 
		박수경 d = new 박수경(); 
		박시우 e = new 박시우(); 
		박예린 f = new 박예린(); 
		오윤석 g = new 오윤석(); 
		윤현기 h = new 윤현기(); 
		임형택 hh = new 임형택();		
		이동우 i = new 이동우();
		이수민 j = new 이수민(); 
		이정호 k = new 이정호();
		정연수 l = new 정연수();
		최지태 m = new 최지태();
		최하은 n = new 최하은();
		황예지 o = new 황예지(); 
		
		Acorn aa  = h;		
		aa.dance();
		 
		
		Acorn[] list =  {a,b,c,d,e,f,g,h,hh, i,j,k,l,m,n,o};
		
		
		
		for( int ii=0; ii<list.length; ii++) {
			list[ii].dance();
		}
		
		  
		
	}

}
