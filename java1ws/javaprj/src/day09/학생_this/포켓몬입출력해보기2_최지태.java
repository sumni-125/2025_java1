package day09.학생_this;

import java.util.Arrays;

public class 포켓몬입출력해보기2_최지태 {

	public static void main(String[] args) {
		Pokemon_최지태 p1 = new Pokemon_최지태();
		setPokemon(p1);
		printPokemon(p1);
	}

	public static void setPokemon(Pokemon_최지태 p1) {
		p1.id = 25;
		p1.name = "피카츄";
		p1.type = new String[] { "전기" };
		p1.hp = 35;
		p1.atk = 55;
		p1.def = 40;
		p1.sAtk = 50;
		p1.sDef = 50;
		p1.speed = 90;
		p1.total = 320;
	}

	public static void printPokemon(Pokemon_최지태 p1) {
		System.out.println("====================");
		System.out.println("도감번호\t" + p1.id);
		System.out.println("이름\t" + p1.name);
		System.out.println("타입\t" + Arrays.toString(p1.type));
		System.out.println("체력\t" + p1.hp);
		System.out.println("공격\t" + p1.atk);
		System.out.println("방어\t" + p1.def);
		System.out.println("특수공격\t" + p1.sAtk);
		System.out.println("특수방어\t" + p1.sDef);
		System.out.println("스피드\t" + p1.speed);
		System.out.println("합계\t" + p1.total);
		System.out.println("====================");
	}
}
