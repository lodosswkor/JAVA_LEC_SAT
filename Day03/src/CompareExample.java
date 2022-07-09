/**
 * 비교연산 
 * @author TJ
 * - 두 항을 비교해서 결과를 얻는 작업 
 * - 두 항의 결과는 항산 참,거짓 (true, false) 
 * - boolean ( true / false , 1 / 0 )
 * A > B, A < B, A >= B, A <= B
 * A == B (A equal B)  
 * A != B (A not equal B) -> A는 B와 같지 않다.   
 */

public class CompareExample {

	public static void main(String[] args) {
		
		boolean result = false; // or true 
		result = 10 > 2;
		System.out.println(result);
		System.out.println(!result);
		
		result = 10 < 2; // 거짓 
		result = 10 >= 10; // 참  
		result = 10 > 10; // 거짓 
		
		//result = "종석" > "만세"; // 실수,정수 비교만 가능 
		result = "종석" == "만세"; // !=, == 은 객체등 모든데이터타입을 
								 // 비교할 수 있다. 
		
		
		
	}
}
