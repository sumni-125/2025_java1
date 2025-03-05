package day13.인터페이스;

public class Main {

	public static void main(String[] args) {

		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cook cook = new Cook();
		Student s = new Student();
		
		
		전투가능한[] list = new 전투가능한[4];
		
		list[0]=cat;
		list[1]=dog;
		list[2]=cook;
		list[3]=s;
		
		for(int i=0; i<list.length; i++) {
			list[i].싸운다();
		}
	}
}
