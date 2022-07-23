/**
 * 접근제한자 
 * @author TJ
 * 
 * public / protected / default / private 
 * 
 * 접근제한자는 아래와 같은 곳에 붙을 수 있습니다.
 *  1. 클래스 ( 클래스는 public / default 만 가능 ) 
 *  2. 메서드 
 *  3. 클래스 전역 변수 
 */

class Class01 { // 나를 호출할 수 있는건, 내 방에 있는 나를 아는 사람들 
	            // 같은폴더(같은 패키지)내에 있는 사람들(프로그램/클래스들) (default) 
	
	private int money = 100; //-- 내가 가진돈은 나밖에 접근할 수 없어(나밖에 알수 없어) (private) 
	String name = "이종석"; //-- 내 이름을 바꿀수 있는사람은, 내방에 있는 나를 아는 사람들 (default)  
	
	protected int getMoney(int m) { // 나한테 돈을 가져갈수 있는 사람은 
		 							// 나랑 아는 (다른방에 있어도) 사람들 ( protected ) 
		money -= m; 
		return m; 
	}
	
	public void sayMyName() { //-- 내 이름을 물어볼수 있는 사람은, 전세계 모두. ( public ) 
		System.out.println(name); 
	}
}

public class AccessExample {

	public static void main(String args[]) {
		
		Class01 cs = new Class01(); 
		//cs.money = 1000; // private 때문에 직접 접근 불가 
		cs.name = "하악하악";
		int money = cs.getMoney(50);
		System.out.println("빌린돈 " + money + "원"); 
		
	}
	
}
