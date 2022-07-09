/**
 * 3항 연산자 
 * @author TJ
 * 조건식 ? 값1(연산) : 값2(연산)
 */
public class SamhangExample {

	public static void main(String[] args) {
		
		int point = 90; // 커트라인  
		int gainedPoint = 80; // 얻은점수 
		int isPassed = 0;  // Pass 여부 0이면 fail, 1이면 passed  
		String isPassedString = ""; 
		
		isPassed = gainedPoint >= point ? 1 : 0;   
		isPassedString = isPassed == 0 ? "불합격" : "합격"; 
		
		System.out.println("선생님은 " + isPassed + " 하셨습니다.");
		System.out.println("선생님은 " + isPassedString + " 하셨습니다.");
		
	}
	
}
