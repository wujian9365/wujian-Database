/**
 * WuJian
 */
package ConnectionFactory;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * @author WuJian
 *2014年2月27日上午10:52:50
 */
public class ConnectionFactory {
	
	
	
	/**
	 * 数据库连接工厂
	 * @return 返回Connection
	 */
	public static Connection CreateConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String URL = "jdbc:mysql://127.0.0.1:3306/dbx";
		String User = "kk";
		String Password = "123";
		Connection conn = null;
		
		try {
			conn = (Connection) DriverManager.getConnection(URL,User,Password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
