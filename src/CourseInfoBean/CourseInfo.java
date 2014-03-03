/**
 * WuJian
 */
package CourseInfoBean;

import java.util.Date;

/**
 * @author WuJian
 *2014年2月27日上午10:23:45
 */
public class CourseInfo {
	private String PrimeId;
	private	String CourseId;
	private String CourseName;
	private String CourseSequence;
	private int Value;
	private Date BeginTime;
	private int TeachingPeriod;
	private String Teacher;
	private boolean Nature;
	private String Place;
	
	/**
	 * @return the primeId
	 */
	public String getPrimeId() {
		return PrimeId;
	}
	/**
	 * @param primeId the primeId to set
	 */
	public void setPrimeId(String primeId) {
		PrimeId = primeId;
	}
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return CourseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the courseSequence
	 */
	public String getCourseSequence() {
		return CourseSequence;
	}
	/**
	 * @param courseSequence the courseSequence to set
	 */
	public void setCourseSequence(String courseSequence) {
		CourseSequence = courseSequence;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return Value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		Value = value;
	}
	/**
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return BeginTime;
	}
	/**
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		BeginTime = beginTime;
	}
	/**
	 * @return the teachingPeriod
	 */
	public int getTeachingPeriod() {
		return TeachingPeriod;
	}
	/**
	 * @param teachingPeriod the teachingPeriod to set
	 */
	public void setTeachingPeriod(int teachingPeriod) {
		TeachingPeriod = teachingPeriod;
	}
	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return Teacher;
	}
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	/**
	 * @return the nature
	 */
	public boolean isNature() {
		return Nature;
	}
	/**
	 * @param nature the nature to set
	 */
	public void setNature(boolean nature) {
		Nature = nature;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return Place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		Place = place;
	}
	
	
}
