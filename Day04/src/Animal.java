/**
 * 동물 클래스 
 * @author TJ
 * 상위 클래스로 정의
 */
public class Animal {

	// 속성 
	int legs = 4; // 다리가 4개 
	String name = "동물"; 
	
	// 행위(메소드) 
	public void bark() { // 짖는행위 
		System.out.println("동물동물");
	}
	
	public void sayName() {
		System.out.println("내 이름은 : " + name);
	}
	
}
