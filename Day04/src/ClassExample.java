/**
 * 자바의 클래스 구조 
 * @author TJ
 * 
 * 1. 클래스는 크게 2가지 영역이 있습니다.
 *    a. 속성 (특징) 
 *    b. 행위 
 *    프로그램에서는 Class의 이 두가지 영역을 "Member(맴버)"라고 표현합니다. 
 *    '야 클래스 A의 맴버가 뭐야?'
 * 
 * 2. 속성을 클래스에서는 "맴버변수"
 *    행위를 "맴버메서드" 
 * 
 * 3. 행위는 크게 두가지 
 *    a. 객체를 생성하는 행위 (생성자) - optional  
 *    b. 일반 행위  
 *    
 * 4. 일반행위는 아주 크게 2가지로 나뉩니다. 
 *    a. 값을 돌려주는 행위(return 해주는 행위) 
 *    b. 값을 돌려주지 않는 행위(void) 
 */

public class ClassExample {
	
	 //-- 맴버 변수(클래스 속성) 
	 int age;
	 String name; 
	 String address; 
	 int money; 
	 
     //-- 일반 행위
	 //-- 이름을 말해라 
	 public void sayName() {
		 System.out.println(name); 
	 }
	 
	 //-- 집을 말해라 
	 public void sayAddress() {
		 System.out.println(address);
	 }
	 
	 public int 돈을내놔라() {
		 return money; 
	 }
	 
	 ///-- 문법 리턴타입이 있는 행위(메서드) 문법 
	 /// 접근제한자 리턴타입 메서드명 ( 매개변수들 ) {  
	 //     메서드 정의부 
	 //     return 값; 
	 //  }
	 
	 public int add(int x, int y) {
		 return x + y; 
	 }
	 
	 //-- 리턴타입이 없는 메서드 
	 // 접근제한자 void 메서드명 (매개변수들 ) { 
	 //  메서드 정의부 
     //}
	 
	 public void printAdd(int x, int y) {
		 System.out.println(x + y);
	 }
	 
	 //--------------------------------------------------
	 public static void main(String args[]) {
		 ClassExample ex = new ClassExample(); 
		 int value = ex.add(10, 20);
		 ex.printAdd(10,20);
		 System.out.println(value);	 
	 }
	 
}






