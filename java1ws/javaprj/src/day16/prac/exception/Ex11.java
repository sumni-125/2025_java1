package day16.prac.exception;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 * try{
		 * 
		 * }catch(Exception e){
		 * 
		 * }finally{
		 * 		//예외가 발생하지 않아도 무조건 수행되는 구문이다
		 * }
		 * 
		 * 
		 */
		//String str = null;
		String str = "hello java";

		int result=0;

		try {
			
			//예외가발생할 수 있는 코드
			result = str.length();
			
		} catch (NullPointerException e) {// 예외가 발생했을 때 동작하는 코드
			e.printStackTrace();
		} finally {
			System.out.println("무조건 수행됨");
		}
		System.out.println("프로그램 정상종료 "+result);

	}

}
