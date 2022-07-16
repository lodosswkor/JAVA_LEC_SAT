/**
 * 학생 성적 출력 (배열이용) 
 * @author TJ
 *
 */


public class ArrayStringExample {

	
	public static void main(String args[]) {
			
		String[] stds = {"이종석","박은진","이지우"}; 
		int[] stdScores = { 90, 100, 98 }; 
		int totalScore = 0; 
		
		// 1. 점수를 출력한다. 
		for( int i = 0; i < stds.length; i ++) {
			System.out.print( stds[i] + " : " + stdScores[i] + "\n");
			totalScore += stdScores[i]; // 총합 	
		}
		// 2. 총합을 출력한다. 
		System.out.println("점수 총합 : " + totalScore); 
		// 3. 평균을 구한다. 
		System.out.println("평균 총합 : " + (totalScore / stds.length) + " 점 "); 
		
		
	}
	
	
	
}
