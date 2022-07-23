/**
 * Static 정적 메소드/클래스 전역 변수에만 사용이 됩니다. 
 * @author TJ
 * 
 * Heap / Stack = 동적 메모리 영역 ( 코드에 따라, 실행 순서에 따라 데이터가 저장되고 사라지는 영역 ) 
 * Static 영역 = 정적 메모리 영역 
 *
 */


class CounterObject {
	int cnt = 0; 
	void addCount() {
		cnt++; 
		System.out.println(cnt); 
	}
}

class StaticCounterObject {
	static int cnt = 0;
	static void addCount() {
		cnt ++;
		System.out.println(cnt);
	}
}


public class StaticExample {

	static void callAddCount() {
		CounterObject cnt = new CounterObject(); 
		cnt.addCount(); 
	} 
	
	static void callStaticAddCount() { 
		// static 메소드/변수는 Heap 메모리가 아닌 Static 영역에 저장되기 때문에
		// new 라는 키워드를 사용하지 않습니다. 
		// 클래스명.변수명, 클래스명.메소드명(); 
		StaticCounterObject.addCount();
		
	}
	
	// non-static method 
	void printName() {
		System.out.println("난 동적메서드 printName이야");
	}
	
	public static void main(String args[]) {
		
		callAddCount(); 
		callAddCount(); 
		callAddCount(); // 객체의 cnt 값이 공유되지 않음 (항상 동적으로 새롭게 객체 생성) 
		 
		callStaticAddCount(); 
		callStaticAddCount(); 
		callStaticAddCount(); // Static은 공용영역이라서 new 메소드를 사용하지 않는다.
		
		// static 메소드 내에서 non-static(동적) 객체를 사용하고 싶다.
		CounterObject c_obj = new CounterObject(); // 메모리를 heap 영역에 올리고 
		c_obj.addCount();  //-- 필요 메서드를 사용한다. 
		
		// 같은 클래스의 동적 메서드라 할지라도, 
		// new를 통해 자기자신을 heap 영역에 올리고 사용해야 한다. 
		// printName(); //-- 에러 
		
		StaticExample example = new StaticExample(); 
		example.printName();
		
		
	}

}
