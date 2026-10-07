abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract long salary();
}

class OfficeEmployee extends Employee {
    public static final long DAILY_WAGE = 100;

    private int workingDays;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    @Override
    public long salary() {
        return workingDays * DAILY_WAGE;
    }
}

class TechnicalEmployee extends Employee {
    private int workingHours;
    private long hourlyRate;

    public TechnicalEmployee(String name, int age, int workingHours, long hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public long getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public long salary() {
        return workingHours * hourlyRate;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Employee[] employees = {
            new OfficeEmployee("An", 28, 22),
            new TechnicalEmployee("Bình", 31, 160, 20),
            new TechnicalEmployee("Chi", 26, 150, 25)
        };

        for (Employee e : employees) {
            System.out.println(e.getName() + " (" + e.getAge() + " tuổi): lương = " + e.salary());
        }
    }
}
