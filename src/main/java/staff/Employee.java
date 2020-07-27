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

    public void setName(String name){
        String originalName = this.name;
        if( name == null || name.length()<=0){this.name = originalName;}
        else {this.name = name;}
    }

    public String getNINumber(){
        return NINumber;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double salaryIncrement){
        if (salaryIncrement > 0){
        salary += salaryIncrement;}
    }

    public double payBonus(){
        return salary*0.01;
    }
}
