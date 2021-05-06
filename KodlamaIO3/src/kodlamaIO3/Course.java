package kodlamaIO3;

public class Course{
	int courseId;
	String courseName;
	
	public Course() {
		
	}
	
	public Course(int courseId,String courseName) {
		this();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


}
