package day14.라이브러리;

public class LSM implements MyRun{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
