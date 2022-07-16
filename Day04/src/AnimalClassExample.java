
public class AnimalClassExample {

	public static void main(String args[]) {
	
		Cat cat = new Cat(); // 고양이 객체생성 
		Dog dog = new Dog(); // 멍멍이 생성
		
		cat.bark(); 
		dog.bark(); 
		
		cat.sayName(); 
		dog.sayName();
		
		System.out.println("=================");
		
		Cat cat2 = new Cat("야옹이2");
		Dog dog2 = new Dog("멍멍이2");

		cat2.bark(); 
		dog2.bark(); 
		
		cat2.sayName(); 
		dog2.sayName();
		
		// 다형성 
		
		Animal[] animal = new Animal[3]; 
		
		animal[0] = new Cat("야옹이1번");
		animal[1] = new Dog("멍멍이1번");
		animal[2] = new Dog("멍멍이2번"); 
		
		((Cat)animal[0]).grrrrr();
		
		
		
	}
	
	
}
