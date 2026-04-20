public class Main {
	public static void main(String[] args) {
		Student student = new Student("SV001", "Nguyễn Văn A", 4.0);

        
        Course course = new Course("CS101", "Lập trình Java", 3);

        
        Transcript transcript = new Transcript(student, course, 8.0, 9.0, 9.5);

        
        System.out.println("--- KẾT QUẢ HỌC TẬP ---");
        transcript.printTranscript();
        
        System.out.println("\n-----------------------");

        Student student2 = new Student("SV002", "Trần Thị B", 2.0);
        Course course2 = new Course("MATH202", "Giải tích 2", 4);
        Transcript transcript2 = new Transcript(student2, course2, 5.0, 4.0, 6.0);
        
        transcript2.printTranscript();
	}
 }
