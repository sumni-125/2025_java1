package day16.복습정리.다형성;


public class 매개변수다형성 {

	
	
	public static void main(String[] args) {
		매개변수다형성 o = new 매개변수다형성();
		Dog dog = new Dog();	
		o.동물이짖는다( dog);		
		
		Cat cat = new Cat();
		o.동물이짖는다(cat);

	}
	
	
	public   void 동물이짖는다( Animal animal) {   //매개변수의 다형성 
		animal.짖다();
	}
	
	
	public   void 짖는다1( Cat animal) {   //cat전용
		animal.짖다();
	}
	
	public   void 짖는다2( Dog animal) {   //dog 전용
		animal.짖다();
	}
	

}
