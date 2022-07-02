
public class VariableLec02 {

	public static void main(String args[]) {
		
		if(args.length < 2) {
			System.out.println("사용법 : java VariableLec02 x y 입니다."); 
			return; 
		}
	
			
		int x = Integer.parseInt(args[0]); 
		int y = Integer.parseInt(args[1]);
		
		
		System.out.println(x + "+" + y + "=" + (x+y)); 
	
	}
	
}


// java VariableLec02 10 20 

