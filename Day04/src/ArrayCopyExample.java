import java.lang.*;
import java.util.Arrays;

/**
 * 배열 복사 
 * @author TJ
 * 배열을 복사하는 이유 
 * 1. 방을 넓히거나 줄일 목적이 있는 경우 
 * 2. 참조변수이기 때문에, 다른 프로세스(작업)에 영향을 받을 수 있기 때문에 
 *    그 영향도를 없애고 독립적으로 사용하고 싶은경우 
 */


public class ArrayCopyExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 1번 목적
		// A. for문으로 하나씩 복사시키는방법
		
		
		// 학생이 5명인 학교 
		// 5명의 학생의 점수를 입력 
		
		int stdScores[] = { 90, 80, 70, 60, 50 };
		
		for( int i = 0; i < stdScores.length ; i++ ) {
			System.out.println(i + "번째 학생 점수 " + stdScores[i] + " 점 ");
		} 
		
		//-- 오늘 한명이 전학을 와서. 그놈도 시험을 봤다.
		//-- 80점을 받았어. 
		// stdScores <-- 학생 방이 5개 밖에 없어.
		//-- 앞으로 늘어날수도 있으니, stdScores2 라는 10개의 방에 있는 집을 만들어서 
		//-- 이사가자. 
		
		int stdScores2[] = new int[10];
		
		int i = 0;  
		for( ; i < 5; i ++) {
			stdScores2[i] = stdScores[i]; 
		}
		
		stdScores2[i] = 80; 
		
		Thread.sleep(1500);
		System.out.println("\n###### 이사완료 #######"); 

		for(int x = 0; x < stdScores.length + 1; x ++) {
			System.out.println(x + "번째 학생 점수 " + stdScores2[x] + " 점 ");
		}
		
		/*
		for(int x = 0; x < stdScores2.length; x ++) {
			if(stdScores2[x] == 0) break;
			System.out.println(x + "번째 학생 점수 " + stdScores2[x] + " 점 ");
		}
		*/

		// B. System.arrayCopy() 
		// https://devdocs.io/openjdk~11/
		// 학생 3명이 있는 학교 schoolStdA 에 학생 '괭이'가 전학을 왔어요. 
		
		//-- Src (Source) 원본 
		String[] schoolAStds = {"이종석","하악이","뿅뿅이"}; 
		
		//-- Dest. (Destination) 복사할 대상  
		String[] schoolBStds = new String[10]; 
		
		System.arraycopy(schoolAStds, 0, schoolBStds, 5, schoolAStds.length);
		// arraycopy(src, src시작인덱스, dest, dest시작인덱스, 복사할 대상의 길이 ) 
		schoolBStds[3] = "괭이"; 

		System.out.println("\n###### 학생출력 #######");
		for( int x = 0; x < schoolBStds.length; x ++) {
			System.out.println(x + " 번째 학생 " + schoolBStds[x] );
		}
		
		
		// C. Arrays.copyOf()
		String[] schoolCStds = Arrays.copyOf(schoolBStds, 20);
		// 대상배열 변수 = Arrays.copyOf(src원본배열, 새로생길 배열의 총길이) 

		System.out.println("\n###### 학생출력2 #######");
		for( int x = 0; x < schoolCStds.length; x ++) {
			System.out.println(x + " 번째 학생 " + schoolCStds[x] );
		}
		
		
		
		
		
		
	}
	
}
