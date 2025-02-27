package day10.짝꿍실습발표.battle_simulation_오윤석김민환;

public class Battle {

//	Character user = new Character();
//	Monster monster = new Monster();
	
	

	public void monsterDamage(Character user, Monster monster) {
		user.hp -= monster.Dmg;
		if (user.hp < 0)
			user.hp = 0; // HP가 음수가 되지 않도록 처리
	}

	public void userDamage(Character user, Monster monster) {
		monster.hp -= user.weaponDmg;
		if (monster.hp < 0)
			monster.hp = 0; // HP가 음수가 되지 않도록 처리
	}

	public void battle(Character user, Monster monster) {
		System.out.println("⚔️ 전투 시작! ⚔️");
		System.out.println(user.nick + " vs " + monster.MonsterName + "\n");
		
		try {
			Thread.sleep(1000); // 1초 딜레이
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (true) {
			// 유저가 몬스터를 공격
			System.out.println(user.nick + "이(가) " + monster.MonsterName + "에게 " + user.weaponDmg + "의 데미지를 입혔다!");
			userDamage(user, monster);
			System.out.println(monster.MonsterName + " 남은 HP: " + monster.hp + "\n");

			try {
				Thread.sleep(1000); // 1초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 몬스터가 쓰러져 전투 종료
			if (monster.hp <= 0) {
				System.out.println(monster.MonsterName + "이(가) 쓰러졌다!");
				System.out.println(user.nick + " 승리! 🏆");
				break; // 전투 종료
			}

			// 몬스터가 유저를 공격
			System.out.println(monster.MonsterName + "이(가) " + user.nick + "에게 " + monster.Dmg + "의 데미지를 입혔다!");
			monsterDamage(user, monster);
			System.out.println(user.nick + " 남은 HP: " + user.hp + "\n");

			try {
				Thread.sleep(1000); // 1초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 유저가 쓰러져 전투 종료
			if (user.hp <= 0) {
				System.out.println(user.nick + "이(가) 쓰러졌다... 😢");
				System.out.println(monster.MonsterName + " 승리! 🏆");
				break; // 전투 종료
			}

		}
	}
}
