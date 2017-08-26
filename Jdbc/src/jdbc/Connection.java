package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//获取连接
		//1 连接数  最小，最大，平时
		java.sql.Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "huangkeying", "111111");
		conn.setAutoCommit(false);
		//获取statement 
		// statement 数量，最小，最大，平时
		Statement stat=conn.createStatement();
		ResultSet set=stat.executeQuery("select count(*) from a");
		set.next();
		System.out.println(set.getInt(1));
		stat.execute("insert into a values ('aaaaaaa')");
		conn.commit();
		set=stat.executeQuery("select count(*) from a");
		set.next();
		System.out.println(set.getInt(1));
		stat.execute("delete from a");
		conn.commit();
		set=stat.executeQuery("select count(*) from a");
		set.next();
		System.out.println(set.getInt(1));
		stat.close();
		conn.close();
		Properties prop=new Properties();
		
	}
}
