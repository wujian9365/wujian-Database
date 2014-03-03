/**
 * WuJian
 */
package TeacherDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import ConnectionFactory.ConnectionFactory;
import TeacherBean.Teacher;

/**
 * @author WuJian 2014年2月28日下午2:32:09
 */
public class TeacherDao {

	/**
	 * 
	 * @param Id
	 * @return Teacher实例
	 * @throws SQLException
	 */
	public static Teacher FindTeacherById(String Id) throws SQLException {
		Teacher teacher = new Teacher();
		ResultSet rs = null;
		String SQL = "select * from Teacher where TeacherId = ?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		while (rs.next()) {
			teacher.setTeacherId(rs.getString(1));
			teacher.setTeacherName(rs.getString(2));
			teacher.setAcademy(rs.getString(3));
			teacher.setTeachingClass(rs.getString(4));
			teacher.setInstallDate(rs.getDate(5));
			teacher.setGender(rs.getBoolean(6));
			teacher.setRace(rs.getString(7));
			teacher.setOffice(rs.getString(8));
			teacher.setTitle(rs.getString(9));
			teacher.setAccount(rs.getString(10));
			teacher.setPassword(rs.getString(11));
			teacher.setPicture(rs.getString(12));
			teacher.setRoot(rs.getBoolean(13));

		}

		return teacher;

	}

	
	/**
	 * 
	 * @param teacher
	 * @return 变化行数
	 * @throws SQLException
	 */
	public static int InsertTeacher(Teacher teacher) throws SQLException {
		int changes = 0;
		String SQL = "insert into teacher values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);

		ps.setString(1, teacher.getTeacherId());
		ps.setString(2, teacher.getTeacherName());
		ps.setString(3, teacher.getAcademy());
		ps.setString(4, teacher.getTeachingClass());
		ps.setDate(5, (Date) teacher.getInstallDate());
		ps.setBoolean(6, teacher.isGender());
		ps.setString(7, teacher.getRace());
		ps.setString(8, teacher.getOffice());
		ps.setString(9, teacher.getTitle());
		ps.setString(10, teacher.getAccount());
		ps.setString(11, teacher.getPassword());
		ps.setString(12, teacher.getPicture());
		ps.setBoolean(12, teacher.isRoot());
		
		changes = ps.executeUpdate();
		return changes;
		
	}
	
	/**
	 * 
	 * @param Id
	 * @return 变化行数
	 * @throws SQLException
	 */
	public static int DeleteTeacherById(String Id) throws SQLException{
		int changes = 0;
		String SQL = "delete from teacher where teacherid = ?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		changes = ps.executeUpdate();
		return changes;
		
	}
	
	/**
	 * 
	 * @param teacher
	 * @return 变化行数
	 * @throws SQLException
	 */
	public static int UpdateTeacherBy(Teacher teacher) throws SQLException{
		int changes = 0;
		String SQL = "update teacher set teacher = ?,teachername = ?,academy = ?,Class = ?,installdate =?,gender =?,race = ?,office =?,title =?,account=?,password =?,picture=?,root =? where teacherid =?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		
		ps.setString(1, teacher.getTeacherId());
		ps.setString(2, teacher.getTeacherName());
		ps.setString(3, teacher.getAcademy());
		ps.setString(4, teacher.getTeachingClass());
		ps.setDate(5, (Date) teacher.getInstallDate());
		ps.setBoolean(6, teacher.isGender());
		ps.setString(7, teacher.getRace());
		ps.setString(8, teacher.getOffice());
		ps.setString(9, teacher.getTitle());
		ps.setString(10, teacher.getAccount());
		ps.setString(11, teacher.getPassword());
		ps.setString(12, teacher.getPicture());
		ps.setBoolean(12, teacher.isRoot());
		ps.setString(1, teacher.getTeacherId());
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
