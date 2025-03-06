package day14.라이브러리;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLib1 lib = new MyLib1();
		lib.printStar();
		lib.printChar('A');
		
		lib.세번실행하기(new LSM());
		
		/*lib.세번실행하기(new MyRun() {

			@Override
			public void run() {
				for(int i=1;i<=9;i++) {
					System.out.println(3*i);
				}
			}
			
		});*/
	}

}
