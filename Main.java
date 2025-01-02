 //displaying the employee details
class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}//extends the employee details from user

 class Employee extends User {
    double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}//main class

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Raj", 10000.0);
        double annualSalary = employee.calculateAnnualSalary();

        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Annual Salary: " + annualSalary);
    }
}