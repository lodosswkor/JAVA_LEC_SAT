import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class ClassMethodExample {

   public static void main(String args[]) throws Exception {
	   
	   //Scanner s = new Scanner(System.in); 
	   //System.out.print("사용할 클래스 이름을 입력해 주세요 : "); 
	   //String className = s.nextLine();
	   // String className = "AppProgramV1"; 
	   
	   String className = loadClassName();
	   Class clazz = Class.forName(className); 
	   AppInterface inc = (AppInterface)clazz.getConstructor().newInstance();
	   inc.printMyName(); 
	   
   }	
   
   //-- 설정파일 로딩하기 
   static String loadClassName() throws Exception {
	   Properties p = new Properties(); 
	   p.load(new FileInputStream("C:\\JavaLecture\\Day07\\src\\version.ini"));
	   return p.getProperty("load-class"); 
   }
   
}
