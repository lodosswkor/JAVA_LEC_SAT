/**
 * 변수의 사용 범위 (Scope) 
 * @author TJ
 * 
 * 변수는 어디까지 사용할 수 있는것인가?
 *  
 */

public class ScopeExample {

	// (클래스) 전역 변수 
	static String name = "이종석";
	
	public static int add(int x, int y) {
		int z = x + y; // 지역변수 
		System.out.println(name); 
		return z; 
	}
	
	public static void scopeTest(int a) {
		a++; 
		System.out.println(name); 
	}
	
	// 지역변수 출력 
	public static void printNameLocal() {
		String name = "냐냐냐";
		System.out.println(name); 
	}

	// 전역변수 출력 
	public static void printNameClass() {
		System.out.println(name); 
	}
	
	public static void changeClassVarValue() {
		name = "하악하악";
		//System.out.println(name); 
	}
	
	public static void main(String args[]) {
		
		System.out.println(name); 
		int a = 10; 
		scopeTest(a); 
		System.out.println(a);
		
		// changeClassVarValue() 사용 전 
		printNameClass();
		printNameClass(); 
		printNameClass(); 
		
		changeClassVarValue(); // 전역변수의 값을 변경 
		
		printNameClass(); 
		printNameClass(); 
		printNameClass(); 
		
		
	}
	
}
