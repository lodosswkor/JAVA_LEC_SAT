

class Student {

	String name; // = "이종석"; 
	int grade; 
	String gender; 
	
	//-- 생성자 메서드 선언 ----------------------------------------
	
	public Student() {
		name = "이종석";
		grade = 6;
		gender = "남성";
	}
	
	public Student(String p_name, int p_grade, String p_gender) {
		name = p_name; 
		grade = p_grade; 
		gender = p_gender; 
	}
	
	//-----------------------------------------------------
	
	
	void sayName() {
		System.out.println("이름은 '" + name + "' 입니다.");
	}
	void sayGrade() {
		System.out.println(grade + "학년 이예요.");
	} 
	
}

public class ConstructExample {

	public static void main(String args[]) {
	    	
		Student std = new Student();
		std.name = "이종석";
		std.sayName();
		std.sayGrade(); 
		
		Student std2 = new Student("하악하악", 2, "남성");
		std2.sayName();
		std2.sayGrade();
	}
	
}
