/*
 * 조건문(Condition) 
 * -> 1. if 구문 2. switch  
 * a. 
 * if(조건식) {
 *   ... 실행문 
 * }
 * --> 조건식이 참일 경우에만 ... 실행문이 실행 됩니다. 
 * 
 * b. if(조건식) {
 *   ... 실행문 
 * } else {
 *   ... 실행문 
 * }
 * 
 * c. if(조건식) {
 *   ... 실행문 
 * } else if(조건식) {
 *   ... 실행문 
 * } .... else {
 *   ... 실행문 
 * }
 * 
 * 
 * 
 */

public class ConditionExample {

	public static void main(String[] args) {
		
		int gainedPoint = 89; //Integer.parseInt(args[0]); 
		//gainedPoint = 91;
		
		System.out.println("당신이 얻은 점수는 " + gainedPoint + "점 입니다.");
		gainedPoint = 69;
		
		if( gainedPoint >= 90 ) 
		{ 
			// gainedPoint >= 90 이 참일때만 실행 
			System.out.println("입사하세요."); 
		} 
		else if( gainedPoint >= 80) 
		{
			System.out.println("인턴 3개월");
		} 
		else if( gainedPoint >= 70) 
		{
		    System.out.println("추가합격");
		} 
		else 
		{
			System.out.println("집에가세요.");
		}
		
		//--- 
		// 1. 나이가 6세 이상 
		// 2. 키가 120이상 
		// 3. 심장병이 없을때 
		int age = 5; 
		int height = 119; 
		boolean heartAttacted = true; // 심장병 true 
		
		if(  age >= 6 && height >= 120 && !heartAttacted) {
			System.out.println("타라"); 
		} else {
			
			if(age <= 6) {
				System.out.println("넌 6세 미만이야 안돼");
			}
			
			if(height < 120) {
			    System.out.println("키가 120cm 미만이야");
			}

			if(heartAttacted) {
			    System.out.println("심장병도 있어");	
			}
			
		}
		
		if( age >= 6 ) {
			
			if( height >= 120) {
			
				if(!heartAttacted) {
					System.out.println("타라");
				} else {
					System.out.println("병원부터");
				}
				
			} else {
				System.out.println("키가 120cm 이상이어야 합니다.");
			}
			
		} else {
			System.out.println("나이가 어려서 탈 수 없어요");
		}
	
	}
	
}
