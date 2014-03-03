/**
 * WuJian
 */
package CourseInfoDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import ConnectionFactory.ConnectionFactory;
import CourseInfoBean.CourseInfo;

/**
 * @author WuJian 2014年2月27日下午12:16:54
 */

// PrimeId CourseId CourseName CourseSequence Value(int)
// BeginTime(Date) teachingPeriod Nature(boolean) Place
public class CourseInfoDao {

	/**
	 * 
	 * @param Id
	 * @return
	 * @throws SQLException
	 */
	public static CourseInfo FindCousreInfoById(String Id) throws SQLException {
		Connection conn = ConnectionFactory.CreateConnection();
		CourseInfo cInfo = new CourseInfo();
		ResultSet rs = null;
		String SQL = "Select * from Course_Info where CourseId = ? ";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		rs = ps.executeQuery();
		while (rs.next()) {
			cInfo.setPrimeId(rs.getString("PrimeId"));
			cInfo.setCourseId(rs.getString("CourseId"));
			cInfo.setCourseName(rs.getString("CourseName"));
			cInfo.setCourseSequence(rs.getString("CourseSequence"));
			cInfo.setValue(rs.getInt("Value"));
			cInfo.setBeginTime(rs.getDate("BeginTime"));
			cInfo.setTeachingPeriod(rs.getInt("TeachingPeriod"));
			cInfo.setTeacher(rs.getString("Teacher"));
			cInfo.setNature(rs.getBoolean("Nature"));
			cInfo.setPlace(rs.getString("Place"));
		}
		return cInfo;

	}

	public static int InsertCourseInfo(CourseInfo cInfo) throws SQLException {
		int changes = 0;
		String SQL = "insert into CourseInfo values(?,?,?,?,?,?,?,?,?,?)";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);

		ps.setString(1, cInfo.getPrimeId());
		ps.setString(2, cInfo.getCourseId());
		ps.setString(3, cInfo.getCourseName());
		ps.setString(4, cInfo.getCourseSequence());
		ps.setInt(5, cInfo.getValue());
		ps.setDate(6, (Date) cInfo.getBeginTime());
		ps.setInt(7, cInfo.getTeachingPeriod());
		ps.setString(8, cInfo.getTeacher());
		ps.setBoolean(9, cInfo.isNature());
		ps.setString(10, cInfo.getPlace());
		changes = ps.executeUpdate();
		return changes;

	}
	
	
	public static int DeleteCourseInfoById(String Id) throws SQLException{
		int changes = 0;
		String SQL = "";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		
		ps.setString(1, Id);
		changes = ps.executeUpdate();
		return changes;
	}

	/**
	 * 
	 * @param cInfo
	 * @return
	 * @throws SQLException
	 */
	public static int UpdateCourseInfo(CourseInfo cInfo) throws SQLException{
		int changes = 0;
		String Sql = "update Course_Info set PrimeId = ?,CourseId = ?, CourseName = ?,CourseSequence = ?,Value = ?.BeginTime = ?,TeachingPeriod = ?,Teacher = ?,Nature = ?,Place = ? where PrimeId = ?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(Sql);
		
		ps.setString(1, cInfo.getPrimeId());
		ps.setString(2, cInfo.getCourseId());
		ps.setString(3, cInfo.getCourseName());
		ps.setString(4, cInfo.getCourseSequence());
		ps.setInt(5, cInfo.getValue());
		ps.setDate(6, (Date) cInfo.getBeginTime());
		ps.setInt(7, cInfo.getTeachingPeriod());
		ps.setString(8, cInfo.getTeacher());
		ps.setBoolean(9, cInfo.isNature());
		ps.setString(10, cInfo.getPlace());
		ps.setString(11, cInfo.getPrimeId());
		
		changes = ps.executeUpdate();
		return changes;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
