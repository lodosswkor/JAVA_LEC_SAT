
public class ObjectClassMethodExample {

	public static void main(String[] args) {
	   
		String a = "이종석";
		String b = "이종석";
		String c = a; 
		
		System.out.println("a == b : " +  a == b); // false 
		System.out.println("a.equals(b) : " +  a.equals(b)); // true
		
		//-- String 객체의 hashCode() 메소드는 
		//-- String Class에서 Override (재정의) 되었다.
		//-- 값이 같으면 같은 해쉬코드를 돌려주도록 
		System.out.println(a.hashCode()); 
		System.out.println(b.hashCode()); 
		System.out.println(c.hashCode()); 
		
		//-- 따라서 이런 경우는 다른클래스(System)의 해쉬코드를 뽑아내는 메서드를 사용해야 한다. 
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
	    // Wrapper Class중에 Integer 
		int i = 0;
		Integer objI = new Integer(10); 
		String objS = objI.toString();
		System.out.println(objS);
		
		
		//-- object clone 
		
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3; 
		
		//int arrB[] = arrA; // 주소값을 복사해서, arrA와 arrB 변수는 new int[3] 을 공동참조한다.
		                   // arrB를 변경하면, arrA도 변경됩니다. 
		
		int arrB[] = arrA.clone(); 
		arrB[2] = 100; 
		System.out.println("arrA[2] = ?" + arrA[2]);
		
		
		
	}
	
}
