import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverPriceExample 
{
	public static void main(String args[]) throws Exception {
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in); 
			System.out.print("검색어를 입력해 주세요 : ");
			String search_text = sc.nextLine(); 
			
			String url = "https://search.shopping.naver.com/search/all?query=%s&bt=-1&frm=NVSCPRO";
			url = String.format(url, search_text);
			
			
			//1. 연결 
			Connection conn = Jsoup.connect(url); 
			
			//2. HTML 가져오기 
			Document html = conn.get();
			//System.out.println(html.toString());
			
			//3. HTML에서 내가 원하는 목록
			Elements ele = html.select(".list_basis > div > div"); // list_basis 라는 html 클래스명(style sheet)을 찝는다
							                           // 자바스크립트에서는 이런방법을 Selector
													   // document.getElementById() Name() 
			//System.out.println(ele.toString()); 
			
			//4. 상품목록 HTML 만 가져와보기 
//			for(Element val : ele) {
//				String goodsName = val.select(".basicList_link__1MaTN").text();
//				String price = val.select(".price_num__2WUXn").text();
//				String link = val.select(".basicList_link__1MaTN").attr("href"); 
//				System.out.println(goodsName);
//				System.out.println(price);
//				System.out.println(link);
//				//System.out.println(val.toString());
//				System.out.println("-----------------------------");
//			} 
			
			writeExcelFile(search_text + ".csv", ele); // CSV 파일쓰기 
			System.out.println("CSV파일을 저장하였습니다.");
			
			// 프로그램 종료 여부 
			System.out.print("프로그램을 종료 하시겠습니까? (Y,N) : ");
			String command = sc.nextLine();
			if(command.toUpperCase().equals("Y")) {
				break; 
			}
		}
		
		
	}
	
	
	//-- Excel (csv - comma split version)  
	public static void writeExcelFile(String fileName, Elements list) throws Exception {
		
		String title = "순위,상품명,가격,상품링크\r\n";
		String lineFormat = "%d,%s,%s,%s\r\n";
		
		File file = new File(fileName); //fileName = "d:\naverPrice.csv";
		BufferedWriter writer = null; 
		
		String result = title; 
		int rank = 1; 
		for(Element item : list) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href"); 
			result += String.format(lineFormat, rank++ , goodsName, price, link );
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch(Exception ex) {
			System.out.println("CSV작성중 예외가 발생하였습니다.");
		} finally {
			if(writer != null) writer.close(); // 이놈 처리할려고 그냥 throws Exception 함 
		}
		
		
	}
	
	
	//-- txt 파일로 저장해보고 
}
