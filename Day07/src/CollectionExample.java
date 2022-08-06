// Collection API 
// 가변 배열이다. 
// 배열과 다르게, 길이가 고정되지 않고, 유동적이다. 

import java.util.*;
// import java.util.List; 

public class CollectionExample {

	
	public static void main(String[] args) {
		 
		int arrA[] = new int[3];
		arrA[0] = 1; 
		arrA[1] = 2; 
		arrA[2] = 3;
		
		// 배열은 길이가 고정되어 있습니다. 
		// Collection -> 2개의 인터페이스가 있습니다.
		// List, Set 
		// List 중복허용, 데이터는 차례대로 쌓인다. 
		// Set 중복불허용, 데이터는 지 맘데로 쌓인다. 
		
		List<StudentA> list = new ArrayList(); // 제너릭은 <클래스명>을 통해 컬렉션에 담길 수 있는 데이터의 타입을 
											   // 지정할 수 있다. 
		 									   // Data Type의 모호성이 떨어집니다. 
		/*list.add(new Integer(1));  
		list.add(new Integer(2));  
		list.add(new Integer(3));*/ 
		
		list.add(new StudentA());
		list.get(0).printName(); // 제러릭 사용시 TypeCasting은 필요없습니다. 
		// ((StudentA)list.get(0)).printName()
		
		//list.get(0) == arrA[0] 와 의미는 같음
		for(int i = 0; i < list.size(); i ++) {
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}	
		
		//-- 아래처럼 list(배열)의 길이를 늘릴수도 있고 
		list.add(new StudentA());
		list.add(new StudentA());
		list.add(new StudentA());
		list.add(new StudentA());
		list.add(new StudentA());
		
		//-- 아래처럼 길이를 줄일수도 있음
		list.remove(0);
		list.remove(1);
		list.remove(3); 
		
		//-- 향상된 for문 
		for(StudentA val : list) {
			val.printName();
		}
		
		
		
		
		
	}
	
}

//-- Student Value Object(Data용으로 사용하는 클래스) 
class StudentA {
	
	public void printName() {
		System.out.println("하악하악");
	}
	
}
