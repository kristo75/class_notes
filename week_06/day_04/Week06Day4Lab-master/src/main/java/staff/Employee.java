package staff;


public class Employee {

    protected String name;
    protected String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        salary += raise;
    }

    public double payBonus() {
        if (this.salary/100 >= 0){
            return this.salary / 100;
        } else {
            return 0.00;}
    }

    public void setName(String name) {
        this.name = name;
    }
}
