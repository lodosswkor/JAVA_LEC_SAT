/**
 * 매개변수 (인자) 
 * !) 메소드에서만 사용합니다. 
 * 
 * 메소드명( 인자 ..... ) 
 * 
 * 매개변수 선언방식은 ( 데이터타입 변수명, 데이터타입 변수명 ...... ) 
 * 매개변수도 마찬가지로 지역변수 입니다. 
 * 
 */

public class ParamExample {

	static void printAddValue(int a, int b) { // (일반타입) pass by value 
		int z = a + b;
		a++;
		b++; 
		System.out.println("x + y = " + z); 
	}
	
	
	static void printAddArray(int[] x) { // pass by reference 
		x[1] = 10; 
	}
	
	
	//-- void를 리턴값(리턴값x) 가지는 메서드의 return 활용 
	static void printValuesUseReturn() {
		
		int x = 0;
		for(; x <= 10; x++) {
			//if(x == 9) break; 
			if(x == 9) return; 
		}
		
		System.out.println("하악하악 x = " + x ); 
	}
	
	
	public static void main(String[] args) {
		
		printValuesUseReturn();
		
		int a = 10; 
		int b = 20; 
		printAddValue(a, b); 
		System.out.println("a = " + a); 
		// 기본타입은 Stack에서 직접 값 (ex 10,20)을 넣기때문에, 인자로 넘길때도 
		// 그 인자에 메모리 주소값이 아닌 10, 20 그 값 자체를 "복사"만 해준다.
		// 따라서 a,b의 값은 메소드에서 무슨짓을 하건 영향을 받지 않는다. 
		
		int[] x = new int[2]; 
		x[0] = 10;
		x[1] = -10;
		printAddArray(x);
		System.out.println("x[1] = " + x[1]); 
		// 참조타입(레터런스타입) x는 stack에 직접 값(ex 4, 10 ... )을 등록하는것이 아니라,
		// Heap 메모리에 있는 실 데이터의 "주소값"을 "복사"로 넘겨준다.
		// 따라서 호출된 메소드에서 그 참조 값을 변경하는 경우, 
		// 실제 값도 영향을 받는다. 
		
	}
	
}
