/*
 * 비트연산 
 */
public class BinaryExample {

	public static void main(String[] args) {
		
		int x = 2; 
		int y = 3; 
		//System.out.println(Integer.toBinaryString(x)); 
		//인티져 x를 2진수 문자열로 바꿔주는 메서드 ( toBinaryString )
		System.out.println("x & y = " + (x & y));
		
		// 1. x를 2진수로 바꾸면 0 0 1 0
		// 2. y를 2진수로 바꾸면 0 0 1 1 
		// 3. x & y = 0 0 1 0 = 2
		
		System.out.println("x | y = " + (x | y));
		// 1. x를 2진수로 바꾸면 0 0 1 0
		// 2. y를 2진수로 바꾸면 0 0 1 1 
		// 3. x | y = 0011 = 3		

		System.out.println("x ^ y = " + (x ^ y));
		// 1. x를 2진수로 바꾸면 0 0 1 0
		// 2. y를 2진수로 바꾸면 0 0 1 1 
		// 3. x ^ y = 0001 = 1		
		   
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.toBinaryString(-1+3));
		
		
	}
	
}
