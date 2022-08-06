//import java.util.Map;
//import java.util.HashMap;
import java.util.*; 




public class MapExample {

	
	public static void main(String[] args) {
	
		// 제너릭이 없으면, Map은 Object타입을 기본으로 데이터를 넣고 빼기 때문에
		// 데이터 타입의 제한이 없었다. 
		// 따라서 과거에는 캐스팅을 사용해야 했고, 
		// 각 객체를 확인할려면, 객체를 하나씩 꺼내서 비교를 해야됐다.
		// instance of 메서드로 하나씩 비교
		/*
		Map map = new HashMap();
		map.put("name", "이종석"); // 맵에 값을 담는 작업 ( key , value )
		
		((String)map.get("name")).length();
		"이종석".length();
		*/
		
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("name", "이종석");
		map.put("age", "45"); 
		map.put("address", "서울 금천구"); 
		map.get("name").length();
		
		//-- Map을 값으로 가지는 List Collection을 선언해라.
		//-- 객체까지 생성 
		List<Map> list = new ArrayList<Map>();
		
		//-- Map<String, String> (키도 String, 값도 String인 맵) 데이터 타입을
		//-- 값으로 가지는 List Collection을 선언하라(객체까지 생성) 
		List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
		
		Map<String, String> data = new HashMap<String,String>();
		data.put("name", "이종석");
		data.put("age", "45"); 
		data.put("address", "서울 금천구"); 
		
		list2.add(data); // 0번추가 
		
		data = new HashMap<String, String>();
		data.put("name", "하악하악");
		data.put("age", "45"); 
		data.put("address", "서울 관악구"); 
		list2.add(data); // 1번추가 
		
		
		
	}


}
