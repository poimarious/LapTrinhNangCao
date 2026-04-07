public class Technician extends Employee {
    private int overtimeHours;
    
    public Technician(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    public void work() {
        System.out.println("Lap dat thiet bi");
    }
    public double calculatePay() {
        return baseSalary + overtimeHours * 20000; 
    }
}
