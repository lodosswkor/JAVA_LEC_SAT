
public class helloWorld {

   public static void main(String args[]) throws Exception  {
      System.out.println("Hello World!!");
      System.out.println("만세만세");
      
      TestClassInterface incEtc = new TestClass(); 
      
      Class c = Class.forName("TestClass");
	  TestClassInterface inc = (TestClassInterface)c.getConstructor().newInstance(); 
	  inc.printName();
      
      
   }

}