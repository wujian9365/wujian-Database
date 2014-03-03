/**
 * WuJian
 */
package BookBean;

/**
 * @author WuJian 2014年2月27日上午10:34:48
 */
public class Book {
	private String Chapter;
	private String Section;
	private String Content;
	private String Focus;
	private String Id;
	private String ParentId;
	private String CourseId;

	public Book() {
	}

	/**
	 * @return the chapter
	 */
	public String getChapter() {
		return Chapter;
	}

	/**
	 * @param chapter the chapter to set
	 */
	public void setChapter(String chapter) {
		Chapter = chapter;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return Section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		Section = section;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		Content = content;
	}

	/**
	 * @return the focus
	 */
	public String getFocus() {
		return Focus;
	}

	/**
	 * @param focus the focus to set
	 */
	public void setFocus(String focus) {
		Focus = focus;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return ParentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		ParentId = parentId;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [Chapter=" + Chapter + ", Section=" + Section
				+ ", Content=" + Content + ", Focus=" + Focus + ", Id=" + Id
				+ ", ParentId=" + ParentId + ", CourseId=" + CourseId + "]";
	}

	/**
	 * @param chapter
	 * @param section
	 * @param content
	 * @param focus
	 * @param id
	 * @param parentId
	 * @param courseId
	 */
	public Book(String chapter, String section, String content, String focus,
			String id, String parentId, String courseId) {
		super();
		Chapter = chapter;
		Section = section;
		Content = content;
		Focus = focus;
		Id = id;
		ParentId = parentId;
		CourseId = courseId;
	}

	

}
