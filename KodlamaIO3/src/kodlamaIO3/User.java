package kodlamaIO3;

public class User {
	int id;
	String username;
	String mail;
	String firstName;
	String lastName;
	String password;
	
	public User() {
		
	}
	
	public User(int id,String username,String mail,String firstName,String lastName,String password) {
		this();
		this.id = id;
		this.mail = mail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;

		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
