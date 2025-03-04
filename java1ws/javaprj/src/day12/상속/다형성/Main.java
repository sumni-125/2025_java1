package day12.상속.다형성;

public class Main {
	public static void main (String[] args) {
		
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Wolf wolf = new Wolf();
		
		
		Animal a1 = cat;
		a1.짖다();
		Animal a2 = dog;
		a2.짖다();
		Animal a3 = wolf;
		a3.짖다();
		
		Animal[] list = new Animal[3];
		list[0] = cat;
		list[1] = dog;
		list[2] = wolf;
		
		System.out.println("--------");
		for(int i=0;i<list.length;i++) {
			list[i].짖다();
		}
		
		
		
		
		
	}
}
