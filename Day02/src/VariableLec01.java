
public class VariableLec01 { // 클래스 선언부 
	
	public static void main(String[] args) { // 자바 어플리케이션 스타팅 포인트
		
		System.out.println("Hello Var!");
		
		int score = 90; 
		System.out.println(score);
		
		//-- 1.변수명은 영어,숫자,특수문자
		//int Age; 
		int age; // 변수의 시작은 소문자로 하는것을 원칙으로 한다.  
		//int aGE;
		int student4Age;  // 숫자도 사용 가능하다. 
		int student4_age; // 특수문자도 가능하다.
		int $_age; // 특수문자 가능 
		
		//--- 2.변수명은 숫자로 시작할 수 없다. 
		//int 4Age; //-- 컴파일 에러 발생 
		
		//--- 3.공백사용불가
		//int student age; //-- error 
		int studentAge; 
		int student_age;
		
		//--- 4.대소문자 구분 
		int studentAge2;
		int StudentAge2;
		int sTudentAGE2;
		int stUdentage2;
		
		//--- 5.예약어는 변수명으로 사용할 수 없다. 
		//int static; //static은 예약어라 에러  
		
		//--- 6. 의미를 부여하자 
		int a = 40; //-- 친구의 나이
		int friendAge = 40; //--- 이렇게 의미를 변수명에 부여하는게 좋다. 
		
		
		//-- char 사용해보기 
		
		char alpha = 65;
		System.out.println((int)alpha + "=" + alpha); 
		
		for(char i=65; i<=90; i++) {
			System.out.println(i + "=" + (int)i); 
		}
		
		
		System.out.println(10);
		
		
		float abc; 
		abc = 1.11f; 
		
		
		
		
	}
	
}

