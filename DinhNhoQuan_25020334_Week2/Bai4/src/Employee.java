public class Employee {
	private String name;
	private MyDate birthday;

	public Employee(String name, MyDate birthday){
		this.name = name;
		this.birthday = birthday;
	}

	public Employee(Employee e) {
		this.name = e.name;
		//this.birthday = e.birthday;
		this.birthday = new MyDate(e.birthday);
	}

	public void setBirthday(int d, int m, int y) {
		this.birthday.setDate(d, m, y);
	}

	public void getBirthday() {
		this.birthday.getDate();
	}

}