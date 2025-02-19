import java.util.Scanner;

public class Ex02{

	public static void main(String[] args){

	int input, randomSu, try_cnt=0;

	Scanner sc = new Scanner(System.in);

	randomSu =  ( int) ( Math.random() * 100 ) +1;
	//System.out.println(randomSu);

		while(true){
			
			input = sc.nextInt();
			if (input > randomSu){
				System.out.println("down");
				try_cnt++;
			}else if (input < randomSu){
				System.out.println("up");
				try_cnt++;
			}else if (input == randomSu){
				break;
			}

		}

		System.out.println("success!");
		if(try_cnt<3){
			System.out.println("snack~!~!");

		}

	}


}