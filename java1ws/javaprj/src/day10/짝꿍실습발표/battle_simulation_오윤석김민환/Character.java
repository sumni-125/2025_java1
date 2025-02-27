package day10.짝꿍실습발표.battle_simulation_오윤석김민환;

import java.util.Random;
import java.util.Scanner;

public class Character {
	// 캐릭터 설정
	String nick;
	int hp;
	String weapon;
	int weaponDmg;

	// 닉네임
	public void nick() {
		Scanner sc = new Scanner(System.in);
		System.out.println("닉네임을 입력해주세요");
		this.nick = sc.next();
		sc.close();
	}

	// 무기 종류
	public void weapon() {
		Random random = new Random();
		final String[] randomWeapon = { "검", "활", "지팡이", "단검" };
		weapon = randomWeapon[random.nextInt(randomWeapon.length)];
	}

	// 체력 및 무기 데미지
	public void random() {
		Random random = new Random();
		this.hp = random.nextInt(51) + 50; // 50~100
		this.weaponDmg = random.nextInt(11) + 10; // 10~20
	}

	public void info() {
		System.out.println("플레이어 정보");
		System.out.print("닉네임:" + this.nick + ", ");
		System.out.print("hp:" + this.hp + ", ");
		System.out.print("무기:" + this.weapon + ", ");
		System.out.println("데미지:" + this.weaponDmg + "\n");

	}

}
