package day10.짝꿍실습발표.battle_simulation_오윤석김민환;

import java.util.Random;

public class Monster {
	String MonsterName;
	int hp;
	int Dmg;

	private String[] Monstar = { "오크", "고블린", "슬라임", "골렘" };

	public void random() {
		Random random = new Random();
		this.MonsterName = Monstar[random.nextInt(Monstar.length)];
		this.hp = random.nextInt(51) + 50; // 50~100
		this.Dmg = random.nextInt(11) + 10; // 10~20
	}

	public void displayMonster() {
		System.out.println("몬스터 생성!");
		System.out.print("이름: " + MonsterName + ", ");
		System.out.print("HP: " + hp + ", ");
		System.out.println("공격력: " + Dmg + "\n");
	}

}
