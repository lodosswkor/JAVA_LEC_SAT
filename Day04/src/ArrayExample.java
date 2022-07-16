/**
 * 배열  
 * @author TJ
 * 
 * - 배열의 선언방법 
 * 1. 데이터타입[] 변수명 ( int[] arrInt; ) 
 * 2. 데이터타입 변수명[] ( int arrInt[]; )  
 */


public class ArrayExample {

	public static void main(String args[]) {
		
		
		//A. 방을 만들고, 각 호실에 데이터를 따로 입력 
		int[] arrInt = new int[5]; // 1. 방을 만듭니다.(5개의 방을) 
		arrInt[0] = 1; // 2. 각 호실에 값을(데이터를) 집어넣습니다. 
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		// 호실(Index)은 배열길이 - 1 
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i; 
		}
		
		
		//B. 선언과 동시에, 각 호실에 데이터를 한번에 입력하는 방식 
		int arrInt2[] = {11,22,33,44,55};
		
		System.out.println(arrInt); 
		System.out.println("arrInt[0] = " + arrInt[0]);
		System.out.println("arrInt2[1] = " + arrInt2[1]);
		//System.out.println("arrInt[5] = " + arrInt[5]);
		
		//-- A - Z 까지 char[] 넣어라. 
		
		char[] alpha = new char[24];
		for( char i = 0; i < alpha.length; i++) {
			alpha[i] = (char)(i + 65); 
		}
		
		//-- A - Z 까지 출력 
		for( int i = 0; i < alpha.length; i++) {
			System.out.print((char)alpha[i]);
		}
		
		
		//-- 배열이 없는 경우 
		//-- 5명의 학생 점수 평균을 내라.
		int stdA = 90;
		int stdB = 100;
		int stdC = 50; 
		int stdD = 30; 
		int stdE = 90; 
	    System.out.println("평균 = " + (stdA+stdB+stdC+stdD+stdE) / 5); 

	    // 배열을 사용한다. 
	    // 변수명을 5개 지을 필요가 없음. 
	    int stdScores[] = {90,100,50,30,90}; 
	    int totalScore = 0; 
	    for( int i = 0; i < stdScores.length; i++ ) {
	    	totalScore += stdScores[i]; 
	    }
	    System.out.println("평균 = " + totalScore / 5); 
	    
	    
	    
	}
	
}
