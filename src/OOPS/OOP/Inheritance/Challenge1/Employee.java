package OOPS.OOP.Inheritance.Challenge1;

public class Employee extends Worker {
    private final long employeeID;
    private final String hireDate;
    private static int employee = 1;
    public Employee(String name, String birthDate, String hireDate ){
        super(name, birthDate );
        employeeID = Employee.employee++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
