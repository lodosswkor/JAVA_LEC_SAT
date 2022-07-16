/**
 * CAT 클래스 
 * @author TJ
 *
 * CAT은 "동물(Animal)"
 */

public class Cat extends Animal {
	
	public Cat() { // 생성자 
		super.name = "야옹이"; 
	}
	
	public Cat(String name) {
		super.name = name; 
	}
	
	// CAT 의 특정 행위(method) 
	public void grrrrr() {
		System.out.println("그릉그릉");
	}
	
	// 매서드 재정의(행위의 재정의) 
	public void bark() {
		System.out.println("야옹야옹");
	}
	
}
/**
 * Dog 클래스 
 * @author TJ
 * 개도 동물(Animal) 
 */
class Dog extends Animal {

	public Dog() { // 생성자 
		super.name = "멍멍이"; 
	}

	public Dog(String name) {
		super.name = name; 
	}
	
	// Dog의 특정 행위(method) 
	public void kaengKaeng() {
		System.out.println("깨겡깨겡");
	}

	// 메서드 재정의(행위의 재정의) 
	public void bark() {
		System.out.println("멍멍");
	}
}


