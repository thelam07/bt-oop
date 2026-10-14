class Employee {
    protected String name;
    protected long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public long calculateSalary() {
        return salary;
    }
}

class OfficeEmployee extends Employee {
    public static final long ALLOWANCE = 1000000;

    public OfficeEmployee(String name, long salary) {
        super(name, salary);
    }

    @Override
    public long calculateSalary() {
        return salary + ALLOWANCE;
    }
}

class TechnicalEmployee extends Employee {
    public static final long ALLOWANCE = 2000000;

    public TechnicalEmployee(String name, long salary) {
        super(name, salary);
    }

    @Override
    public long calculateSalary() {
        return salary + ALLOWANCE;
    }
}

public class bai2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new OfficeEmployee("An", 10000000),
            new TechnicalEmployee("Binh", 10000000)
        };

        for (Employee e : employees) {
            System.out.println(e.getName() + " - Luong: " + e.calculateSalary());
        }
    }
}
