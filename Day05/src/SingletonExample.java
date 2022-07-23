/**
 * Singleton 예제 
 * @author TJ
 *
 */

class Counter2 {
	
	static Counter2 counter2; 
	int cnt = 0; // 덧셈숫자 
	
	// 싱글턴 패턴 객체생성 메서드 
	public static Counter2 getInstance() {
		if(counter2 == null) {
			counter2 = new Counter2(); 
		}
		return counter2; 
	}
	
	//-- cnt 변수에 1씩 증가 
	public void addCnt() {
		cnt ++; 
	}
	
	public void printCnt() {
		System.out.println("cnt = " + cnt); 
	}
}


public class SingletonExample {

	public static void main(String args[]) {
	
		// 일반 방식 
		Counter2 ccount1 = new Counter2(); 
		Counter2 ccount2 = new Counter2(); 
		Counter2 ccount3 = new Counter2(); 
		
		ccount1.addCnt(); 
		ccount1.addCnt(); 
		ccount1.addCnt(); 
		ccount3.printCnt(); //-- cnt 
		
		
		// Singleton 방식 (객체를 하나 생성해서 count1,2,3에 그 주소값을 공유) 
		Counter2 count1 = Counter2.getInstance(); 
		Counter2 count2 = Counter2.getInstance(); 
		Counter2 count3 = Counter2.getInstance(); 
		
		// count1 addCnt() 메소드 3번 호출 -> cnt = 3;
		count1.addCnt(); 
		count1.addCnt(); 
		count1.addCnt(); 
		
		count3.printCnt(); //-- cnt -> 3 
		
	}
	
}
