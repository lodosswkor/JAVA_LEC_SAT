/**
 * 문자열 
 * @author TJ
 *
 */

public class VariableString {

	
	public static void main(String[] args) {
		
		char alpha = '이'; // 문자형은 '' single quat 사용
		                  // char 기본 데이터 타입 
		
		String name = "이종석"; // 문자'열' double quat 
		                      // 참조 데이터 타입입니다. 
		
		System.out.println("나의 이름은 " + name + "입니다.");
		
		name = "     ";
		name = ""; 
		
		// 숫자건 문자건 실수건 "" 감싸져있는 경우는 문자열로 인식한다.
		String float_value = "1.5f";
		//char aaa = "B"; // 문자열이기 때문에 문자 B는 char aaa에 담아지지 않는다.
		char bbb = 'B'; 
		
		String message = "너의 점수는 " + 90 + "점입니다.";
		System.out.println(message);		
		System.out.println(message.indexOf("점수") + "번째부터 시작"); 
		
		
		//-- 변수/상수 
		int i = 10; 
		System.out.println("변수 i = " + i);
		
		i = 100; 
		System.out.println("변수 i = " + i);
		
		
		
	}
	
	
}
