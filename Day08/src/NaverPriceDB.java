import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverPriceDB {

	private static NaverPriceDB naverPriceDb = null;
	private Connection conn = null; 
	
	public static NaverPriceDB getInstance() {
		if(naverPriceDb == null) {
			naverPriceDb = new NaverPriceDB();
		}
		return naverPriceDb; 
	}
	
	public void connectDB() throws Exception {
		
		//1. Driver 로딩 
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(
					"jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lodossw_db",
					"lodossw",
					"12345"
		); 
	} 
	
	public void insertNaverPrice(Elements list) throws Exception {
		
		String sql = "insert into naver_price "
				   + "(goodsName, price, link, in_date_time) values "
				   + "(?, ?, ?, now())";
		
		PreparedStatement pstmt = this.conn.prepareStatement(sql);
		

		for(Element item : list) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href"); 
			// ex 4,000원 -> 4000
			int intPrice = Integer.parseInt(price.replace(",", "").replace("원", ""));
			
			pstmt.setString(1, goodsName);
			pstmt.setInt(2, intPrice);
			pstmt.setString(3, link);
			pstmt.executeUpdate(); // 쿼리 
			
		}
		
		pstmt.close();
		
	}

	public void closeDB() throws Exception {
		this.conn.close();
	} 
	
}
