package kodlamaIO3;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Yeni e�itmen eklendi...");
	}
	
	public void delete(Instructor instructor) {
		System.out.println("E�itmen silindi...");
	}
	
	public void list(Instructor instructor) {
		System.out.println("E�itmenler listelendi...");
	}
	
}
