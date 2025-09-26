public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Doe", 4500);
        Employee e2 = new Employee(2, "James", "Smith", 5000);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1.getAnnualSalary());
        System.out.println(e2.getAnnualSalary());

        e1.raiseSalary(20);
        e2.raiseSalary(20);

        System.out.println(e1);
        System.out.println(e2);
    }
}
