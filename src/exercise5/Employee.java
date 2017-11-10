package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author allewi01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean fullTime;
    
    public Employee (String firstName, String lastName, double salary, boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.fullTime = fullTime;
    }
    
    public String getFirstName () {
        return this.firstName;
    }
    
    public String getLastName () {
        return this.lastName;
    }
    
    public double getSalary () {
        return this.salary;
    }
    
    public boolean isFullTime () {
        return this.fullTime;
    }
    
    @Override
    public String toString () {
        if (this.fullTime) {
            return this.firstName + " " + this.lastName + " earns $" + String.format("%.2f", this.salary) + " annually";
        } else {
            return this.firstName + " " + this.lastName + " earns $" + String.format("%.2f", this.salary) + " hourly";
        }
    }
}
