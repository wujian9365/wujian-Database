/**
 * WuJian
 */
package StuedntBean;

import java.util.Date;

/**
 * @author WuJian
 *2014年2月27日上午10:30:41
 */
public class Student {
	private long StudentId;
	private String StudentName;
	private String Academy;
	private String StudingClass;
	private Date InstallDate;
	private int Grade;
	private boolean Gender;
	private String Race;
	private String Account;
	private String Password;
	private String Picture;
	private boolean root;
	/**
	 * @return the studentId
	 */
	public long getStudentId() {
		return StudentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(long studentId) {
		StudentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return StudentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	/**
	 * @return the academy
	 */
	public String getAcademy() {
		return Academy;
	}
	/**
	 * @param academy the academy to set
	 */
	public void setAcademy(String academy) {
		Academy = academy;
	}
	/**
	 * @return the studingClass
	 */
	public String getStudingClass() {
		return StudingClass;
	}
	/**
	 * @param studingClass the studingClass to set
	 */
	public void setStudingClass(String studingClass) {
		StudingClass = studingClass;
	}
	/**
	 * @return the installDate
	 */
	public Date getInstallDate() {
		return InstallDate;
	}
	/**
	 * @param installDate the installDate to set
	 */
	public void setInstallDate(Date installDate) {
		InstallDate = installDate;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return Grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		Grade = grade;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		Gender = gender;
	}
	/**
	 * @return the race
	 */
	public String getRace() {
		return Race;
	}
	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		Race = race;
	}
	/**
	 * @return the account
	 */
	public String getAccount() {
		return Account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		Account = account;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return Picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		Picture = picture;
	}
	/**
	 * @return the root
	 */
	public boolean isRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(boolean root) {
		this.root = root;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName="
				+ StudentName + ", Academy=" + Academy + ", StudingClass="
				+ StudingClass + ", InstallDate=" + InstallDate + ", Grade="
				+ Grade + ", Gender=" + Gender + ", Race=" + Race
				+ ", Account=" + Account + ", Password=" + Password
				+ ", Picture=" + Picture + ", root=" + root + "]";
	}
	
	

}
