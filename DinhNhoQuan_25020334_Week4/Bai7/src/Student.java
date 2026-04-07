public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {return name;} 
    public double getGPA() {return gpa;}

    public String toString() {
        return String.format("ID: %s - Name: %s - GPA: %f", id, name, gpa);
    }
}
