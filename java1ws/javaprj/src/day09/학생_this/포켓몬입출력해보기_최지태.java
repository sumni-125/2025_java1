package day09.학생_this;

public class 포켓몬입출력해보기_최지태 {

	public static void main(String[] args) {
		Pokemon_최지태 p1 = new Pokemon_최지태();
		p1.setPokemon(25, "피카츄", new String[] { "전기" }, 35, 55, 40, 50, 50, 90);
		p1.printPokemon();

		Pokemon_최지태 p2 = new Pokemon_최지태();
		p2.setPokemon(133, "이브이", new String[] { "노말" }, 55, 55, 50, 45, 65, 55);
		p2.printPokemon();
	}

}
