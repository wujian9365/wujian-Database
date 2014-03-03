

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * WuJian
 */

/**
 * @author WuJian 2014年2月27日上午9:18:46
 */
public class DBLinkTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stubFou
		String URL = "jdbc:mysql://127.0.0.1:3306/dbx";
		String user = "kk";
		String password = "123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn;
		try {
			conn = (Connection) DriverManager.getConnection(URL,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
