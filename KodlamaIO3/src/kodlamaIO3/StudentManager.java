package kodlamaIO3;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Yeni öğrenci eklendi...");
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci kaydı silindi...");
	}
	
	public void list(Student student) {
		System.out.println("Öğrenciler listelendi...");
}
	
	public void addCourse(Student student, Course course) {
		System.out.println(student.firstName + " " + course.courseName +" kursu kütüphanenize eklendi...");
	}
	
	public void studentCheck(Student student) {
		System.out.println("Öğrenci yoklaması alındı...");
	}
}