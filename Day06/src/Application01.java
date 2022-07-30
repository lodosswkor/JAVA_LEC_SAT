

public class Application01 {

	public static void main(String[] args) {
		
		ParentExample ex = new ParentExample("이종석", 4); 
		ex.printMyInfo();
		
		ParentExample ex2 = new ParentExample(); 
		ex2.printMyInfo(); 
		
		ChildExample cx = new ChildExample("haakhaak"); 
		cx.printMyInfo();
		
		
	}
	
}
