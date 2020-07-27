package staff;

public abstract class Employee {

    protected String name;
    protected String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNINumber(){
        return NINumber;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double salaryIncrement){
        salary += salaryIncrement;
    }

    public double payBonus(){
        return salary*0.01;
    }
}
