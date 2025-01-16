public class EmployeeSalary {

    private double basicSalary;

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Basic salary must be positive. Please enter a valid amount.");
        }
    }

    public double calculateAnnualSalary() {
        if (basicSalary <= 0) {
            System.out.println("Basic salary has not been set.");
            return 0;
        }
        double tax = basicSalary * 0.10; 
        double bonus = basicSalary * 0.02; 
        double travellingAllowance = basicSalary * 0.015; 
        double monthlySalary = basicSalary - tax + bonus + travellingAllowance;

        return monthlySalary * 12;
    }

    public static void main(String[] args) {
        EmployeeSalary employee = new EmployeeSalary();
        
        employee.setBasicSalary(50000); 
        
        double annualSalary = employee.calculateAnnualSalary();
        if (annualSalary > 0) {
            System.out.println("The annual salary of the employee is: " + annualSalary);
        }
    }
}
