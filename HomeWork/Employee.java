package HomeWork;

public class Employee {
    private String fullName;
    private int department;
    private double employeeSalary;
    private int id;
    private static int idCounter = 0;

   private static int id() {
        return idCounter++;

    }

    public Employee(String fullName, int department, double employeeSalary) {
        this.id = id();
        this.fullName = fullName;
        this.department = department;
        this.employeeSalary = employeeSalary;
    }

    public String getFullName() {

        return this.fullName;
    }

    public int getId() {

        return id;
    }


    public int getDepartment() {

        return this.department;
    }

    public double getEmployeeSalary() {

        return this.employeeSalary;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setEmployeeSalary(double employeeSalary) {

        this.employeeSalary = employeeSalary;
    }
    @Override
    public String toString() {
        return "ID: " + getId() +
                " ФИО: " + getFullName() +
                " Отдел: " + getDepartment() +
                " ЗП: " + getEmployeeSalary();
    }




}
