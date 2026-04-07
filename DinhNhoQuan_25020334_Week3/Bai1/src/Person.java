public class Person {
	protected String name;
	protected String dob;

	public Person(String name) {
		this.name = name;
		System.out.println("1. Person is created");
	}

	public String getName() {
		return name;
	}
}