package kodlamaIO3;

public class Student extends User{
	int studentId;
	String studentLectures;
	
	public Student() {
		
	}
	
	public Student(int studentId,String studentLectures) {
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentLectures() {
		return studentLectures;
	}
	public void setStudentLectures(String studentLectures) {
		this.studentLectures = studentLectures;
	}
	
	
}
