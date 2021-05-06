package kodlamaIO3;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setUsername("grknaks");
		user.setFirstName("G�rkan");
		user.setLastName("Aksoy");
		user.setMail("deneme@outlook.com");
		user.setPassword("12345");
		
		
		Student student = new Student();
		student.setStudentId(2);
		student.setFirstName("Ali");
		student.setLastName("Akba�");
		student.setMail("deneme@outlook.com");
		student.setPassword("12345");
		student.setStudentLectures("Java React"+" Yaz�l�m Geli�tirici Kamp�"+ " Programlamaya Giri� i�in Temel Kurs");
		
		
		Instructor instructor = new Instructor();
		instructor.setInstructorId(3);
		instructor.setCourseName("Java React"+" Yaz�l�m Geli�tirici Kamp�"+ " Programlamaya Giri� i�in Temel Kurs");
		
		
		UserManager kullanici = new UserManager();
		kullanici.accountCreate(user);
		kullanici.accountDelete(user);
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.list(instructor);

	}
	
	

}
