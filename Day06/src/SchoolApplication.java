
public class SchoolApplication {

	public static void main(String args[]) {
			
		//-- 상속을 통한 is a 관계 
		//-- is a 란 뭐냐? 
		//-- A is a B ( A는 B이다.) 
		//-- 인간은 동물이다, 남학생은 학생이다
		//-- 여학생은 학생이다, 학생은 인간이다, 인간은 동물이다.
		
		Student std1 = new BoyStudent("이종석", 45, 6, 10); 
		// Student 데이터 타입에 BoyStudent 값(객체)을 넣을 수 있느냐? 참
		// BodyStudent is a Student (남학생은 학생이다) -> 
		// 학생클래스의 상속을 받는다. 
		//BoyStudent bStd = new BoyStudent("고양이",10, 1, 10); 
		// GirlStudent gStd = new BoyStudent("고양이2", 10, 2, 10);
		// GirlStudent 데이터 타입에 BodyStudent 값(객체)를 넣을 수 있느냐? 거짓 
		// BodyStudent is not a GirlStudent (남학생은 여학생이 아니다) ->
		// BodyStudent 와 GirlStudent 는 상속관계가 아니다. 
		
		Student std2 = new GirlStudent("하악이",20, 1, 90);
		
		std1.sayName();
		std2.sayName(); 
		
		std1.gotoCR(); 
		std2.gotoCR(); 
		
		//std1.smoking(); // 동작안함 
		//std1은 Student 데이터 타입으로, smoking() 메서드가 
		//정의되어 있지 않다. 
		//smoking()이라는 메서드는 남학생(BoyStudent)클래스에만 
		//정의된 메서드 이다. -> Student 타입의 std1 을 
		//BoyStudent로 TypeCasting(형변환)을 시도해야 
		//smoking()을 호출할 수 있다. 
		((BoyStudent)std1).smoking(); 
		
		
		//-- 한반에 10명이 수업을 듣습니다. 
		//-- 남녀 합반으로. 
		Student[] classRoom = new Student[10];
		classRoom[0] = new BoyStudent("이종석",45,1,10);
		classRoom[1] = new GirlStudent("하악이",20,2,99);
		//.......
		
		for(Student std : classRoom) {
			if(std == null) break;
			std.sayName(); 
			std.sayGender();
		}
		
		//-- 모든 자바클래스의 최상위 클래스는 Object -> Student is a Object
		Object[] classRoom2 = new Student[10];
		classRoom2[0] = new BoyStudent("이종석",45,1,10);
		classRoom2[1] = new GirlStudent("하악이",20,2,99);

		for(Object std : classRoom2) {
			if(std == null) break;
			Student haak = (Student)std;
			haak.sayName(); 
			haak.sayGender();
		}
		
		
	}


}

