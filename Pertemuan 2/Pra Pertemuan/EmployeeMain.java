public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Dwinanda", "Keyzha", 5000000);
        System.out.println(e1);
        System.out.println(e1.getID());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.raiseSalary(20));
        // System.out.println(e1.toString());
    }
}
