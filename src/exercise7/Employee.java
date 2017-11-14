package exercise7;

/**
 *
 * @author allewi01
 */
public class Employee {

    protected String name;
    protected String ssn = "000-00-0000";
    protected double netPay;

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    protected double getNetPay() {
        return 0;
    }

    protected void printWeeklyCheck() {
    }

}
