package day05;

public class DbConn {
	DbConn() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";
	}
}
