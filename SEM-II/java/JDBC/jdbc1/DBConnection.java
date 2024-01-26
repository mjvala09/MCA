import java.sql.*;
class DBConnection{
	Connection con;
	DBConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");

		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/orcl",
										  "system",
										  "123");
		System.out.println("Connection established");
	}
}