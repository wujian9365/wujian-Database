/**
 * WuJian
 */
package BookDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import BookBean.Book;
import ConnectionFactory.ConnectionFactory;

/**
 * @author WuJian 2014年2月27日上午10:44:53
 */
public class BookDao {
	/**
	 * 
	 * @param BookId 
	 * @return book实例
	 * @throws SQLException
	 */
	public static Book FindBookById(String Id) throws SQLException {
		Connection conn = ConnectionFactory.CreateConnection();
		Book book = new Book();
		ResultSet rs = null;

		String SQL = "select * from book where id = ?";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		rs = ps.executeQuery();
		while (rs.next()) {
			book.setChapter(rs.getString("Chapter"));
			book.setContent(rs.getString("Content"));
			book.setFocus(rs.getString("Focus"));
			book.setId(rs.getString("Id"));
			book.setParentId(rs.getString("ParentId"));
			book.setSection(rs.getString("Section"));
			book.setCourseId(rs.getString("CourseId"));
		}
		return book;

	}

	/**
	 * 
	 * @param book实例
	 * @return 变化行数
	 * @throws SQLException
	 */
	public static int InsertBook(Book book) throws SQLException {
		int Changes = 0;
		Connection conn = ConnectionFactory.CreateConnection();
		String SQL = "Insert into book values(?,?,?,?,?,?,?)";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, book.getChapter());
		ps.setString(3, book.getContent());
		ps.setString(4, book.getFocus());
		ps.setString(5, book.getId());
		ps.setString(6, book.getParentId());
		ps.setString(2, book.getSection());
		ps.setString(7, book.getCourseId());

		Changes = ps.executeUpdate();
		return Changes;

	}

	/**
	 * 
	 * @param Id
	 * @return 变化数
	 * @throws SQLException
	 *             删除
	 */
	public static int DeletetBookById(String Id) throws SQLException {
		int changes = 0;
		Connection conn = ConnectionFactory.CreateConnection();
		String SQL = "delete from book where id = ?";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		changes = ps.executeUpdate();
		return changes;
	}

	/**
	 * 
	 * @param book
	 * @return 变化行数
	 * @throws SQLException
	 */
	public static int UpdateBook(Book book) throws SQLException {
		int changes = 0;

		Connection conn = ConnectionFactory.CreateConnection();
		String SQl = "update book set chapter = ? , content = ? , focus = ? ,id = ? , parentId = ? , section = ? , CourseId =?where id = ?";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQl);
		ps.setString(1, book.getChapter());
		ps.setString(2, book.getContent());
		ps.setString(3, book.getFocus());
		ps.setString(4, book.getId());
		ps.setString(5, book.getParentId());
		ps.setString(6, book.getSection());
		ps.setString(7, book.getCourseId());
		ps.setString(8, book.getId());
		changes = ps.executeUpdate();
		return changes;
		
	}

	/**
	 * 
	 * @param book
	 * @param 变更的主键Id
	 * @return 数据库变化行数
	 * @throws SQLException
	 */
	public static int UpdateBook(Book book, String Id) throws SQLException {
		int changes = 0;

		Connection conn = ConnectionFactory.CreateConnection();
		String SQl = "update book set book.chapter =? , book.content = ? , book.focus = ? ,book.id = ? , book.parentId = ? , book.section = ? where id = ?";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQl);
		ps.setString(1, book.getChapter());
		ps.setString(2, book.getContent());
		ps.setString(3, book.getFocus());
		ps.setString(4, Id);
		ps.setString(5, book.getParentId());
		ps.setString(6, book.getSection());
		ps.setString(7, book.getId());
		changes = ps.executeUpdate();
		return changes;

	}

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		int changes =0;
		
		Book  book = new Book("chapter","section","text","focus","3","parentid","Cousresid");
		
		//changes = BookDao.InsertBook(book);
		//changes = BookDao.DeletetBookById("3");
		changes = BookDao.UpdateBook(book,"4");
		System.out.println(changes);

	}

}
