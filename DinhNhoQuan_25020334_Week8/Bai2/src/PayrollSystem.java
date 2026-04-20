public class PayrollSystem {

    private static final double SOCIAL_INSURANCE_RATE = 0.08;
    private static final double HEALTH_INSURANCE_RATE = 0.015;
    private static final double PERSONAL_DEDUCTION = 11000000;
    private static final double TAX_LEVEL_1_MAX = 5000000;
    private static final double TAX_LEVEL_2_MAX = 10000000;
    private static final double TAX_RATE_LEVEL_1 = 0.05;
    private static final double TAX_RATE_LEVEL_2 = 0.10;
    private static final double TAX_BASE_LEVEL_2 = 250000;
    private static final double TAX_BASE_LEVEL_3 = 750000;

    public void printPayroll(String name, double baseSalary, int workDays, int totalDays, double taxRate, double bonus) {
        
        double actualSalary = calculateActualSalary(baseSalary, workDays, totalDays);
        double insurance = calculateInsurance(actualSalary);
        double tax = calculatePersonalTax(actualSalary, insurance, taxRate);
        double netSalary = calculateNetSalary(actualSalary, insurance, tax, bonus);

        
        System.out.println("=== BẢNG LƯƠNG (REFACTORED) ===");
        System.out.println("Nhân viên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Ngày công: " + workDays + "/" + totalDays);
        System.out.println("Lương thực tế: " + actualSalary);
        System.out.println("Bảo hiểm: " + insurance);
        System.out.println("Thuế TNCN: " + tax);
        System.out.println("Thưởng: " + bonus);
        System.out.println("Thực nhận: " + netSalary);
        System.out.println("------------------------------");
    }

    private double calculateActualSalary(double baseSalary, int workDays, int totalDays) {
        return baseSalary * workDays / totalDays;
    }

    private double calculateInsurance(double actualSalary) {
        double socialInsurance = actualSalary * SOCIAL_INSURANCE_RATE;
        double healthInsurance = actualSalary * HEALTH_INSURANCE_RATE;
        return socialInsurance + healthInsurance;
    }

    private double calculatePersonalTax(double actualSalary, double insurance, double highLevelTaxRate) {
        double taxableIncome = actualSalary - insurance - PERSONAL_DEDUCTION;
        if (taxableIncome <= 0) return 0;

        if (taxableIncome <= TAX_LEVEL_1_MAX) {
            return taxableIncome * TAX_RATE_LEVEL_1;
        } else if (taxableIncome <= TAX_LEVEL_2_MAX) {
            return TAX_BASE_LEVEL_2 + (taxableIncome - TAX_LEVEL_1_MAX) * TAX_RATE_LEVEL_2;
        } else {
            return TAX_BASE_LEVEL_3 + (taxableIncome - TAX_LEVEL_2_MAX) * highLevelTaxRate;
        }
    }

    private double calculateNetSalary(double actualSalary, double insurance, double tax, double bonus) {
        return actualSalary - insurance - tax + bonus;
    }


    public void printPayrollOld(String name, double baseSalary, int workDays, int totalDays, double taxRate, double bonus) {
        System.out.println("=== BẢNG LƯƠNG (GỐC) ===");
        System.out.println("Nhân viên: " + name);
        double actualSalary = baseSalary * workDays / totalDays;
        double insurance = actualSalary * 0.08 + actualSalary * 0.015;
        double taxableIncome = actualSalary - insurance - 11000000;
        double tax = 0;
        if (taxableIncome > 0) {
            if (taxableIncome <= 5000000) tax = taxableIncome * 0.05;
            else if (taxableIncome <= 10000000) tax = 250000 + (taxableIncome - 5000000) * 0.10;
            else tax = 750000 + (taxableIncome - 10000000) * taxRate;
        }
        double netSalary = actualSalary - insurance - tax + bonus;
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Ngày công: " + workDays + "/" + totalDays);
        System.out.println("Lương thực tế: " + actualSalary);
        System.out.println("Bảo hiểm: " + insurance);
        System.out.println("Thuế TNCN: " + tax);
        System.out.println("Thưởng: " + bonus);
        System.out.println("Thực nhận: " + netSalary);
        System.out.println("------------------------------");
    }
}