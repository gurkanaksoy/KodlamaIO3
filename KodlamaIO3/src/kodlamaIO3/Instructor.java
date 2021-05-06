package kodlamaIO3;

public class Instructor extends User{
	int InstructorId;
	String courseName;
	
	public Instructor() {
		
	}
	
	public Instructor(int InstructorId,String courseName) {
		this();
		this.InstructorId = InstructorId;
		this.courseName = courseName;
	}
	
	
	public int getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(int instructorId) {
		this.InstructorId = instructorId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
