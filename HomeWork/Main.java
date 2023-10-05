package HomeWork;

public class Main {

    public static void main(String[] args){

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Вася Пупкин Иванович", 1, 10000);
        employees[1] = new Employee("Дима Пупкин Петрович", 2, 10000);
        employees[2] = new Employee("Вася Непупкин Владимирович", 3, 11000);
        employees[3] = new Employee("Кирил Иванов Христофорович", 4, 20000);
        employees[4] = new Employee("Петр Первый Иванович", 5, 30000);
        employees[5] = new Employee("Андрей Димов Кирилович", 1, 10000);
        employees[6] = new Employee("Ирина Пупкина Ивановна", 3, 15000);
        employees[7] = new Employee("Мария Ворникова Константиновна", 5, 19000);
        Employee.getLessSalary(employees, 12500);
        Employee.getMoreSalary(employees,11000);
        Employee.indexAllSalaries(employees,3);
        Employee.indexDepartmentSalaries(employees,2,4);
        Employee.toString(employees);
        Employee.getAllSalariesCost(employees);
        Employee.getMinSalary(employees);
        Employee.getMaxSalary(employees);
        Employee.getMediumSalariesCost(employees);
        Employee.getNames(employees);
        Employee.getDepartmentMinSalary(employees,5);
        Employee.getDepartmentMaxSalary(employees,5);
        Employee.getDepartmentSumSalary(employees,5);
        Employee.getDepartmentAverageSalary(employees,5);
        Employee.printAllEmployeesDepartment(employees,5);

        }

        }
