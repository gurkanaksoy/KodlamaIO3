package kodlamaIO3;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Yeni ��renci eklendi...");
	}
	
	public void delete(Student student) {
		System.out.println("��renci kayd� silindi...");
	}
	
	public void list(Student student) {
		System.out.println("��renciler listelendi...");
}
	
	public void addCourse(Student student, Course course) {
		System.out.println(student.firstName + " " + course.courseName +" kursu k�t�phanenize eklendi...");
	}
	
	public void studentCheck(Student student) {
		System.out.println("��renci yoklamas� al�nd�...");
	}
}