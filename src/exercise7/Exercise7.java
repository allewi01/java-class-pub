package exercise7;

/**
 *
 * @author allewi01
 */
public class Exercise7 {

    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "123-45-6789");
        Employee bob = new HourlyEmployee("Bob", "124-81-6326", 15.0, 40.0);
        Employee charlie = new SalariedEmployee("Charlie", "139-27-8124", 82750.0);

        alice.printWeeklyCheck();
        bob.printWeeklyCheck();
        charlie.printWeeklyCheck();
    }

}
