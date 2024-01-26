import java.sql.*;
import java.sql.SQLRecoverableException;
class DBconnection{

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    DBconnection() throws Exception{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");

            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/orcl",
            "system",
            "123");
            System.out.println("Connection Established...");
        }
        catch(Exception e){
            System.out.println("Connection Failed " + e.getMessage());
        }
    }

    public void display() throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER");
        rs = ps.executeQuery();
        // System.out.println(rs);
        System.out.println("========================================");
        while(rs.next()){
            System.out.printf("%-15s %-10s %10s", rs.getString(1), rs.getString(2), rs.getString(3));
            System.out.println();
        }
        System.out.println("========================================");
    }
    public void sort() throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER ORDER BY CODE");
        // ps.setString(1,columnName);
        rs = ps.executeQuery();
        System.out.println("========================================");
        while(rs.next()){
            System.out.printf("%-15s %-10s %10s", rs.getString(1), rs.getString(2), rs.getString(3));
            System.out.println();
        }
        System.out.println("========================================");
    }

    public void insert(int code, int score, String name) throws Exception{
        ps = con.prepareStatement("INSERT INTO CRICKETER(code, score, name) VALUES(?,?,?)");
        ps.setInt(1,code);
        ps.setInt(2,score);
        ps.setString(3,name);
        ps.executeUpdate();
    }


    public void update(int code, int score, String name, String uname) throws Exception{
    	ps = con.prepareStatement("UPDATE CRICKETER SET CODE=?, NAME=?,SCORE=? WHERE NAME=?");
    	ps.setInt(1,code);
    	ps.setString(2,name);
    	ps.setInt(3,score);
    	ps.setString(4,uname);
    	ps.executeUpdate();
    }

    public void close() throws Exception{
        con.close();
    }

    public void deleteByCode(int code) throws Exception{
    	ps = con.prepareStatement("DELETE FROM CRICKETER WHERE CODE=?");
    	ps.setInt(1,code);
    	ps.executeUpdate();
    	System.out.println("Query Executed...");
    }
}