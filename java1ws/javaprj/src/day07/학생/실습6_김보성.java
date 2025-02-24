package day07;

import java.util.Random;

public class 실습6_김보성 {

	public static void main(String[] args) {
		
		// 응원의 메세지를 반환하는 함수 만들기
		
		String cheer = cheer();
		System.out.println(cheer);
		String cheers = cheers();
		System.out.println(cheers);
		

	}
	// 단일 문장 출력
	public static String cheer() {
		
		return "잘 하고 있어요! 파이팅~!";
	}
	
	// 배열 내부 랜덤 문장 출력
	public static String cheers() {
		String messages[] = new String[] {
				"나는 실패를 받아들일 수 있다. 모두가 뭔가에서 실패한다. 하지만 시도조차 하지 않는 것은 받아들일 수 없다. - 마이클 조던",
				"“무언가가 충분히 중요하다면, 성공 확률이 낮더라도 시도해야 한다.” - 일론 머스크",
				"“세상을 바꿀 수 있다고 믿는 미친 사람들이 진짜 세상을 바꾸는 사람들이다.” - 스티븐 잡스",
				"“첫 번째 단계는 네가 할 수 있다고 말하는 것이다.” - 윌 스미스",
				"“네가 하고 싶은 일을 할 수 있을 때까지 해야 할 일을 해라.” - 오프라 윈프리"				
		};
		Random random = new Random();		// 랜덤 난수
		return messages[random.nextInt(messages.length)];
		
	}
	
	
}
