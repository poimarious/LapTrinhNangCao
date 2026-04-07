public class OfficeWorker extends Employee {
    
    public OfficeWorker(String id, String name, double baseSalary){
        super(id, name, baseSalary);
    }
    
    public void work() {
        System.out.println("Soan thao van ban");
    }
    public double calculatePay() {
        return baseSalary;
    }
}
