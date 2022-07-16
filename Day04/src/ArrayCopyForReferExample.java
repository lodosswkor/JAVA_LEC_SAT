/**
 * 배열은 참조변수입니다. (Object) 
 * @author TJ
 *
 */

public class ArrayCopyForReferExample {

	public static void main(String[] args) {
	   
		int arrInt[] = {10,20,30};
		int arrInt2[] = arrInt; 
		
		for(int i = 0; i < arrInt.length; i++ ) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}
		
		for(int i = 0; i < arrInt2.length; i++ ) {
			System.out.println("arrInt2[" + i + "]=" + arrInt2[i]);
		}
		
		// arrInt2[1] = -100;
		System.out.println("======================================\n");
		arrInt2[1] = -100; 
		
		for(int i = 0; i < arrInt.length; i++ ) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}
		
		for(int i = 0; i < arrInt2.length; i++ ) {
			System.out.println("arrInt2[" + i + "]=" + arrInt2[i]);
		}
		
		
		
		
	}
	
}
