import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
    private static <T> void printArr(List<T> a){  
        for(T x : a) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {     
        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> minus = (a, b) -> a - b;
        Operation<Double> multi = (a,b) -> a * b;
        Operation<Double> divide = (a,b) -> (b != 0 ? a / b : 0);    

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student > students = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            students.add(new Student(sc.next(), sc.next(), sc.nextDouble()));
        }
        
        System.out.println();

        students.removeIf(student -> student.getGPA() < 5.0);
        System.out.println("After removing GPA < 5.0:");
        printArr(students);
        
        System.out.println(); 

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorting by name:");
        printArr(students);
    }
}
