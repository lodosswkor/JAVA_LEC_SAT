/**
 * 메소드 
 * @author TJ
 * 
 * 메소드는 절차지향언어에는 "함수" 
 * 클래스명/변수명/상수명 = ex) 클래스는 대문자로 시작한다, 변수는 소문자로 시작한다, 상수는 모두 대문자다 
 * 메소드 명은 변수랑 규칙 똑같다. = 소문자로 시작합니다.
 * 메소드명(); <-- 이게 메소드의 규칙입니다. 
 * ex) System.out.println("Hello World"); 
 * 
 * -------------------------------------------------------- 
 * 메소드는 행위입니다. 행동 
 * 그럼 메소드를 왜 사용하죠? 
 * 1. 반복업무를 줄이기 위해서 
 * 2. 객체지향언어에서는 행동 즉 변수에 값을 넣는다거나, 더한다거나 이런역할은 "메소드" 밖에 할 수 없습니다. 
 * 
 * 메소드의 작성 문법 
 * 
 * [접근한정자] [static/non-static] 리턴타입 메서드명 ([매개변수]) {
 *    ... 메서드 행동 정의 부 
 * }
 * 
 */

public class MethodExample01 {
	
	
	// 반복적인 일을 메소드(함수)로 정의합니다.
	// 값을 돌려주는 메소드 
	public static int add( int x, int y ) {
		int z = x + y; 
		return z; 
	}
	
	// 값을 돌려주지 않는 메소드 
	// void 메소드 
	
	public static void printAddValue(int x, int y) {
		int z = x + y;
		System.out.println(z); 
	}
	
	static void printMyName() {
		System.out.println("하악하악 알아서 뭐하게");
	}
	
	public static void main(String args[]) {
		
		int a = 10; 
		int b = 20; 
		int c = add(a, b); 
		printAddValue(a, b);
		printMyName(); 
		
	}

}
