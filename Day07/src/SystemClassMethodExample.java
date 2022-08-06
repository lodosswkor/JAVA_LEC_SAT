import java.lang.*;
import java.util.Enumeration;
import java.util.Properties; 

public class SystemClassMethodExample {

	public static void main(String[] args) {

		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		
		//-- 사용자 컴퓨터의 환경변수를 출력 
		for(String var : System.getenv().keySet()) {
		   System.out.println(var + "=" + System.getenv(var));	
		}
		
		//-- java에서 지원하는 Properties를 사용하는방식. 
		
	    Properties prop = System.getProperties(); 
	    Enumeration  en = prop.propertyNames(); 
	    while(en.hasMoreElements()) {
	    	String key = (String)en.nextElement();
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
	    }
	    //prop.forEach(); 
	    
	}
	
	
}
