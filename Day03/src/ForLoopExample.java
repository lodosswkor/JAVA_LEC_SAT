/**
 * 반복문 For  
 * @author TJ
 * 
 * for(초기화식; 조건식; 증감식) {
 *   .. 실행부 
 * }
 *
 */

public class ForLoopExample {

	public static void main(String[] args) throws InterruptedException {
		
		//1-10까지 출력하세요
		System.out.println(1); 
		System.out.println(2);
		System.out.println(3);
		//-- 블라블라 
		System.out.println(10); 
		
		System.out.println("==============================");
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		int x; 
		for(x = 1; x <= 10; x++) {
			System.out.println(x); 
		}
		
		System.out.println("x = " + x);
		
		//-- For문의 특징 
		//-- 초기화/조건식/증감식이 필수는 아니다. 
		int y = 1;
		for( ; y <= 10; y++ ) {
			
		}
		
		y = 1;
		for( ; y <= 10; ) {
			System.out.println(y); 
			y++; 
		}
		
		y = 1; 
		for(;;) { // 무한루프 
			System.out.println(y++); 
			if(y > 10) break; 
		}
		
		//-- 중첩된 for문 
		// 구구단 
		// 2단 - 9단까지 
		// x * y -> x 결정 
		// Y 축을 1 ~ 9까지 곱하는건 너무 많다.
		// 나는 1 ~ 5까지만 곱할래 
		// 조건식을 바꾸지 않고 
		
		for(int x1 = 2; x1 <= 9; x1 ++) { // x축 결정됨 
			
			if(x1%2 != 0) continue; // 짝수단만 출력
			
			System.out.println("======" + x1 + "단 ========"); 
			
			for(int y1 = 1; y1 <= 9; y1++ ) { // y축 
				System.out.println(x1 + " x " + y1 + "=" + (x1 * y1)); 
				if( y1 == 5 ) break;				
			}
			
		}
		
		Thread.sleep(1000);

		System.out.println("\n\n\n\n====== 숙제질 ========");
		
		for(int x1 = 1; x1 <= 9; x1 ++) { // x축 결정됨 
			
			for(int y1 = 2; y1 <= 9; y1++ ) { // y축 
				System.out.print(y1 + "x" + x1 + "=" + (x1 * y1) + "\t"); 
			}
			
			System.out.print("\n");
		}
		
		
		
		
		
	}
	
}
