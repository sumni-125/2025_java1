package day12.상속.다형성;

public class Main2 {

	public static void main(String[] args) {
		 
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Wolf wolf = new Wolf();
		
		
		Animal a1 = cat;
		
		//a1.짖다();
		매서드(a1);
		
		Animal a2= dog;
		//a2.짖다();
		매서드(a2);
		
		Animal a3 = wolf;
		//a3.짖다();
		매서드(a3);
		
		 

	}
	
	
	public  static  void  매서드( Animal animal) {		
		animal.짖다();
	}

}
