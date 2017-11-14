package exercise7;

/**
 *
 * @author allewi01
 */
public class HourlyEmployee extends Employee {

    private double wageRate;
    private double hours;

    public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getNetPay() {
        return this.netPay;
    }

    @Override
    public void printWeeklyCheck() {
        System.out.println(this.name + " worked " + this.hours + " hours at $" + String.format("%.2f", this.wageRate) + " per hour and made $" + String.format("%.2f", this.wageRate * this.hours) + " this week.");
    }

}
