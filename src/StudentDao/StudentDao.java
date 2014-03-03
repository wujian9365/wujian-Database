/**
 * WuJian
 */
package StudentDao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ConnectionFactory.ConnectionFactory;
import StuedntBean.Student;

/**
 * @author WuJian 2014年2月28日下午1:08:20
 */
public class StudentDao {
	/**
	 * 
	 * @param Id
	 *            学生ID
	 * @return Student实例
	 * @throws SQLException
	 */
	public static Student FindStudentById(String Id) throws SQLException {
		Student student = new Student();
		ResultSet rs = null;
		String SQL = "select * from Student where StudentId = ?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);

		ps.setString(1, Id);
		rs = ps.executeQuery();
		while (rs.next()) {
			student.setStudentId(rs.getLong("studentId"));
			student.setStudentName(rs.getString(2));
			student.setAcademy(rs.getString(3));
			student.setStudingClass(rs.getString(4));
			student.setInstallDate(rs.getDate(5));
			student.setGrade(rs.getInt(6));
			student.setGender(rs.getBoolean(7));
			student.setRace(rs.getString(8));
			student.setAccount(rs.getString(9));
			student.setPassword(rs.getString(10));
			student.setPicture(rs.getString(11));
			student.setRoot(rs.getBoolean(12));
		}

		return student;

	}

	/**
	 * 
	 * @param student
	 * @return
	 * @throws SQLException
	 */
	public static int InsertStudent(Student student) throws SQLException {
		int changes = 0;
		String SQL = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);

		ps.setLong(1, student.getStudentId());
		ps.setString(2, student.getStudentName());
		ps.setString(3, student.getAcademy());
		ps.setString(4, student.getStudingClass());
		ps.setDate(5, (Date) student.getInstallDate());
		ps.setInt(6, student.getGrade());
		ps.setBoolean(7, student.isGender());
		ps.setString(8, student.getRace());
		ps.setString(9, student.getAccount());
		ps.setString(10, student.getPassword());
		ps.setString(11, student.getPicture());
		ps.setBoolean(12, student.isRoot());

		changes = ps.executeUpdate();
		return changes;

	}

	public static int DeleteStudentById(String Id) throws SQLException {
		int changes = 0;
		String SQL = "delete from student where studentid = ?";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		changes = ps.executeUpdate();
		return changes;

	}
	
	
	public static int UpdateStudent(Student student) throws SQLException{
		int changes = 0;
		String SQL = "update student set StudentId = ?,StudentName = ?,Academy = ?,StudingClass = ?,InstallDate = ?,Grade = ?Gender = ?,Race = ?,Account = ?,Password = ?,Picture = ?,Root = ? where StudentId = ? ";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL);
		
		ps.setLong(1, student.getStudentId());
		ps.setString(2, student.getStudentName());
		ps.setString(3, student.getAcademy());
		ps.setString(4, student.getStudingClass());
		ps.setDate(5, (Date) student.getInstallDate());
		ps.setInt(6, student.getGrade());
		ps.setBoolean(7, student.isGender());
		ps.setString(8, student.getRace());
		ps.setString(9, student.getAccount());
		ps.setString(10, student.getPassword());
		ps.setString(11, student.getPicture());
		ps.setBoolean(12, student.isRoot());
		ps.setLong(13, student.getStudentId());
		
		changes = ps.executeUpdate();
		return changes;
		
		
	}

	
	public static List<String> getStudentCoursesById(String Id) throws SQLException{
		int changes = 0;
		ResultSet rs = null;
		List<String> list = new ArrayList<String>();
		String SQL ="select coursename from student_course ,Course_info where Student_Course.StudentId = ? && student_course.CourseId = Course_info.primeId;";
		Connection conn = ConnectionFactory.CreateConnection();
		PreparedStatement  ps = (PreparedStatement) conn.prepareStatement(SQL);
		ps.setString(1, Id);
		rs = ps.executeQuery();
		while(rs.next()){
			list.add(rs.getString(1));
		}
		return list;
		
		
	}
	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student = StudentDao.FindStudentById("1");
		System.out.println(student);
		List<String> list = new ArrayList<String>();
		list = StudentDao.getStudentCoursesById("11195002");
		System.out.println(list);
		
		
	}
	


}
