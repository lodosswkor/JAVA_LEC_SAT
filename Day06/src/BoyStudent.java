
public class BoyStudent extends Student {
   
	BoyStudent(String name, 
			   int age, 
			   int grade,  
			   int score) {
		
		super(); 
		this.name = name; 
		this.age = age; 
		this.grade = grade;
		this.score = score; 
		this.gender = "남"; 		
	}

	
	//-- 메소드의 재정의 
	@Override
	public void gotoCR() {
		System.out.println("남자 화장실을 갑니다.");
	} 
	
	public void smoking() {
		System.out.println("뻐끔뻐끔");
	}
}
