package HomeWork;

public class Employee {
    private String fullName;
    private int department;
    private double employeeSalary;
    private int id;
    private static int idCounter = 0;

    public static int id() {
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


    public static void toString(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ID сотрудника " + employee.getId() + " ФИО: " + employee.getFullName() + " Департамент: " + employee.getDepartment() + " Зарплата: " + employee.getEmployeeSalary());
            }
        }
    }

    public static void getAllSalariesCost(Employee[] employees) {
        double totalSalaryCost = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalaryCost += employee.getEmployeeSalary();
            }
        }
        System.out.println("Сумма затрат на все зарплаты: " + totalSalaryCost);
    }

    public static void getMinSalary(Employee[] employees) {
        double minSalary = employees[0].getEmployeeSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getEmployeeSalary())
                    minSalary = employee.getEmployeeSalary();
            }
        }
        System.out.println("Минимальная зарплата равна: " + minSalary);
    }

    public static void getMaxSalary(Employee[] employees) {
        double maxSalary = employees[0].getEmployeeSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getEmployeeSalary())
                    maxSalary = employee.getEmployeeSalary();
            }
        }
        System.out.println("Максимальная зарплата равна: " + maxSalary);
    }

    public static void getMediumSalariesCost(Employee[] employees) {
        double mediumSalaryCost = 0.0;
        int nullPointer = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                mediumSalaryCost += employee.getEmployeeSalary();
            } else {
                nullPointer++;
            }
        }
        mediumSalaryCost /= (employees.length - nullPointer);
        System.out.println("Среднее значение зарплат: " + mediumSalaryCost);
    }

    public static void getNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО: " + employee.getFullName());
            }
        }
    }

    public static void indexAllSalaries(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setEmployeeSalary(employee.getEmployeeSalary() + (employee.getEmployeeSalary() * (percent / 100)));
            }
        }
    }

    public static void getDepartmentMinSalary(Employee[] employees, int department) {
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (minSalary > employee.getEmployeeSalary())
                        minSalary = employee.getEmployeeSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе номер: " + department + " = " + minSalary);
    }

    public static void getDepartmentMaxSalary(Employee[] employees, int department) {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (maxSalary < employee.getEmployeeSalary())
                        maxSalary = employee.getEmployeeSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе номер: " + department + " = " + maxSalary);
    }

    public static void getDepartmentSumSalary(Employee[] employees, int department) {
        double sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sumSalary += employee.getEmployeeSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе номер: " + department + " = " + sumSalary);
    }

    public static void getDepartmentAverageSalary(Employee[] employees, int department) {
        double sumSalary = 0;
        double averageSalary = 0;
        int countPeopleInDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sumSalary += employee.getEmployeeSalary();
                    countPeopleInDepartment++;
                }
            }
        }
        averageSalary = sumSalary / countPeopleInDepartment;
        System.out.println("Средняя зарплата в отделе номер: " + department + " = " + averageSalary);
    }

    public static void indexDepartmentSalaries(Employee[] employees, int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    employee.setEmployeeSalary(employee.getEmployeeSalary() + (employee.getEmployeeSalary() * (percent / 100)));
                }
            }
        }
    }

    public static void printAllEmployeesDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println("ID сотрудника " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getEmployeeSalary());
                }
            }
        }
    }
    public static void getLessSalary(Employee[] employees, int number) {
        System.out.println("Сотруники с зп поменьше: ");
        for (Employee employee : employees) {
            if (employee != null) {
                    if(employee.getEmployeeSalary() < number){
                        System.out.println("ID сотрудника " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getEmployeeSalary());
                    }
            }
        }
    }

    public static void getMoreSalary(Employee[] employees, int number) {
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
