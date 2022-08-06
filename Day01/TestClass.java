
interface TestClassInterface {
	public void printName(); 
}


public class TestClass implements TestClassInterface {

	int age; 
	
	static {
		System.out.println("static class for name"); 
		initObject(); 
	}
	
	private static void initObject() {
		System.out.println("---");
	}
	
	@Override
	public void printName() {
		System.out.print("TEST");
	}
}
