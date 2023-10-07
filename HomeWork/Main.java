package HomeWork;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args){
        employees[0] = new Employee("Вася Пупкин Иванович", 1, 10000);
        employees[1] = new Employee("Дима Пупкин Петрович", 2, 10000);
        employees[2] = new Employee("Вася Непупкин Владимирович", 3, 11000);
        employees[3] = new Employee("Кирил Иванов Христофорович", 4, 20000);
        employees[4] = new Employee("Петр Первый Иванович", 5, 30000);
        employees[5] = new Employee("Андрей Димов Кирилович", 1, 10000);
        employees[6] = new Employee("Ирина Пупкина Ивановна", 3, 15000);
        employees[7] = new Employee("Мария Ворникова Константиновна", 5, 19000);
        employees[8] = new Employee("Анна Ворникова Константиновна", 5, 19000);
        employees[9] = new Employee("Кристина Ворникова Константиновна", 5, 19000);
        printAllEmployees();
        System.out.println(getAllSalariesCost());
        System.out.println(getMinSalary());
        System.out.println(getMediumSalariesCost());
        getNames();
        getLessSalary(12500);
        getMoreSalary(11000);
        indexAllSalaries(3);
        indexDepartmentSalaries(2,4);
        System.out.println(getAllSalariesCost());
        System.out.println(getMaxSalary());
        System.out.println(getMediumSalariesCost());
        getNames();
        System.out.println(getDepartmentMinSalary(5));
        System.out.println(getDepartmentMaxSalary(5));
        System.out.println(getDepartmentSumSalary(5));
        System.out.println(getDepartmentAverageSalary(5));
        printAllEmployeesDepartment(5);

        }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static double getAllSalariesCost() {
        double totalSalaryCost = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalaryCost += employee.getEmployeeSalary();
            }
        }
        return totalSalaryCost;
    }

    public static Employee getMinSalary() {
        Employee employeeWithMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getEmployeeSalary()) {
                    minSalary = employee.getEmployeeSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getMaxSalary() {
        Employee employeeWithMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getEmployeeSalary()) {
                    maxSalary = employee.getEmployeeSalary();
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getMediumSalariesCost() {
        double allSalaries = getAllSalariesCost();
        double mediumSalaryCost = 0.0;

        mediumSalaryCost = getAllSalariesCost()/ employees.length ;
        return mediumSalaryCost;
    }

    public static void getNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО: " + employee.getFullName());
            }
        }
    }

    public static void indexAllSalaries(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setEmployeeSalary(employee.getEmployeeSalary() + (employee.getEmployeeSalary() * (percent / 100)));
            }
        }
    }

    public static Employee getDepartmentMinSalary(int department) {
        Employee employeeWithMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (minSalary > employee.getEmployeeSalary()) {
                        minSalary = employee.getEmployeeSalary();
                        employeeWithMinSalary = employee;
                    }
                }
            }
        }
            return employeeWithMinSalary;
    }

    public static Employee getDepartmentMaxSalary( int department) {
        Employee employeeWithMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (maxSalary < employee.getEmployeeSalary()){
                        maxSalary = employee.getEmployeeSalary();
                        employeeWithMaxSalary = employee;
                    }
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getDepartmentSumSalary(int department) {
        double sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sumSalary += employee.getEmployeeSalary();
                }
            }
        }
        return sumSalary;
    }

    public static double getDepartmentAverageSalary(int department) {
        double averageSalary = 0;
        int countPeopleInDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    countPeopleInDepartment++;
                }
            }
        }
        averageSalary = getDepartmentSumSalary(department) / countPeopleInDepartment;
        return averageSalary;
    }

    public static void indexDepartmentSalaries(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    employee.setEmployeeSalary(employee.getEmployeeSalary() + (employee.getEmployeeSalary() * (percent / 100)));
                }
            }
        }
    }

    public static void printAllEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee);
                }
            }
        }
    }
    public static void getLessSalary(int number) {
        System.out.println("Сотруники с зп поменьше: ");
        for (Employee employee : employees) {
            if (employee != null) {
                if(employee.getEmployeeSalary() < number){
                    System.out.println("ID сотрудника " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getEmployeeSalary());
                }
            }
        }
    }

    public static void getMoreSalary(int number) {
        System.out.println("Сотрудники с зп побольше:");
        for (Employee employee : employees) {
            if (employee != null) {
                if(employee.getEmployeeSalary() >= number){
                    System.out.println("ID сотрудника " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getEmployeeSalary());
                }
            }
        }
    }

}
