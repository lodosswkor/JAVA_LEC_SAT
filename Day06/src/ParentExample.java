
public class ParentExample {

	String name; // 이름 
	int arms;  //-- 팔 
	
	
	public ParentExample() {
		//this.name = "하악하악";
		//this.arms = 10;
		this("하악하악", 10);
	}
	//-- 생성자 메서드
	//-- 1.리턴타입이 없다
	//-- 2.클래스 명과 동일하다. 
	public ParentExample(String name, int arms) {
		this.name = name; 
		this.arms = arms; 
	}
	
	public void printMyInfo() { 
		//-- 내 이름과 / 팔의 수를 보여주는(내정보를 보여주는 메서드) 
		// 1. 이름출력 
		//printName(); 
		this.printName(); 
		// 2. 팔숫자 출력 
		//printArms(); 
		this.printArms(); 
	}
	
	public void printArms() {
		System.out.println("내 팔은 " + arms + "개야."); 
	}
	
	public void printName() {
		System.out.println("내 이름은 " + name + "이야.");
	}
	
}
