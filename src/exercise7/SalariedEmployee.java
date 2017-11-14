package exercise7;

/**
 *
 * @author allewi01
 */
public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String name, String ssn, double salary) {
        super(name, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getNetPay() {
        return this.netPay;
    }

    @Override
    public void printWeeklyCheck() {
        System.out.println(this.name + " worked and earned $" + String.format("%.2f", this.salary / 52.00) + " this week.");
    }

}
