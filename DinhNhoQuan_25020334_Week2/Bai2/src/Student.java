public class Student {
	private String id;
	private String name;
	private String email;
	private double gpa;
	
	public Student() {}

	public Student(String Id,String Name) {
		this.id = id;
		this.name = Name;
	}

	public Student(String Id, String Name, String Email, double Gpa) {
		this.id = Id;
		this.name = Name;
		this.email = Email;
		this.gpa = Gpa;
	}

	public void SetGPA(double GPA) {
		if(GPA < 0 || GPA > 4) {
			System.out.println("Error: 0.0 <= GPA <= 4.0");
			return ;
		}
		this.gpa = GPA;
	}
	public void SetName(String Name) {
		this.name = name;
	}
	public void setEmail(String Email) {
		if(Email.contains("@")) {
			this.email = Email;
		} else {
			System.out.println("Error: Invalid email.");
		}	
	}

	public void getInfo() {
		System.out.println("ID:" + this.id);
		System.out.println("Name:" + this.name);
		System.out.println("Email:" + this.email);
		System.out.println("GPA:" + this.gpa);
	}

}