package day09.학생_this;

import java.util.Arrays;

public class Pokemon_최지태 {
	int id; // 도감번호
	String name; // 이름
	String type[]; // 타입
	int hp; // 체력
	int atk; // 공격
	int def; // 방어
	int sAtk; // 특수공격
	int sDef; // 특수방어
	int speed; // 스피드
	int total;

	public void setPokemon(int id, String name, String type[], int hp, int atk, int def, int sAtk, int sDef,
			int speed) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.sAtk = sAtk;
		this.sDef = sDef;
		this.speed = speed;
		this.total = hp + atk + def + sAtk + sDef + speed;
	}

	public void printPokemon() {
		System.out.println("====================");
		System.out.println("도감번호\t" + this.id);
		System.out.println("이름\t" + this.name);
		System.out.println("타입\t" + Arrays.toString(this.type));
		System.out.println("체력\t" + this.hp);
		System.out.println("공격\t" + this.atk);
		System.out.println("방어\t" + this.def);
		System.out.println("특수공격\t" + this.sAtk);
		System.out.println("특수방어\t" + this.sDef);
		System.out.println("스피드\t" + this.speed);
		System.out.println("합계\t" + this.total);
		System.out.println("====================");
	}
}
