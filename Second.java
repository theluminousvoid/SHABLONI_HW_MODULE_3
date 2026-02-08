public class Second {
    public static void main(String[] args) {
        Employee emploee = new Employee("Name1", 500000, "Permanent");
        PermanentEmployee PE = new PermanentEmployee();
        PE.CalculateSalary(emploee);
    }
}

class Employee
{
    public Employee(String name,double BaseSalary, String EmployeeType) {
        this.Name = name;
        this.BaseSalary = BaseSalary;
        this.EmployeeType = EmployeeType;
    }

    public String Name;
    public double BaseSalary;
    public String EmployeeType; // "Permanent", "Contract", "Intern"
}

interface EmployeeSalaryCalculator {
    double CalculateSalary(Employee employee);
}

class PermanentEmployee implements EmployeeSalaryCalculator {
    @Override
    public double CalculateSalary(Employee employee){
        return employee.BaseSalary * 1.2; // Permanent employee gets 20% bonus
    };
}

class ContractEmployee implements EmployeeSalaryCalculator {
    @Override
    public double CalculateSalary(Employee employee){
        return employee.BaseSalary * 1.1; // Permanent employee gets 20% bonus
    };
}


class InternEmployee implements EmployeeSalaryCalculator {
    @Override
    public double CalculateSalary(Employee employee){
        return employee.BaseSalary * 0.8; // Permanent employee gets 20% bonus
    };
}
