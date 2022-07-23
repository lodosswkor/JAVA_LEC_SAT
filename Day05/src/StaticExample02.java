
class Counter {
	
	static int count = 0; // static 변수 이므로, 클래스가 로딩되는 시점부터(프로그램 시작순간부터) 
	                      // static 영역에 저장되고, 프로그램이 끝날때 까지 공유(사라지지 않는다) 
	
	int non_static_count = 0; // non-static 변수 이므로, heap영역에 올라가는 순간 
	 						  // 초기화 되며, heap에서 해제(사라지는)되는 순간 삭제됨.
							  // = 객체에 종속적
	
	Counter() { // 생성자 
		count ++; // static 
		non_static_count ++; // non-static  
	}
	
	
	public static int getCount() {
		return count; 
	}
	
	public int getNonStaticCount() {
		return non_static_count; 
	}
	
}

public class StaticExample02 {

	public static void main(String[] args) {
	  
	  Counter c1 = new Counter(); 
	  Counter c2 = new Counter(); 
	  Counter c3 = new Counter(); 
	  
	  int static_total_cnt = Counter.getCount(); 
	  int non_static_total_cnt = c3.getNonStaticCount();
	  
	  System.out.println("Counter 객체 생성 수(static) : " + static_total_cnt); 
	  System.out.println("Counter 객체 생성 수 : " + non_static_total_cnt); 
	  
	}
	
}
