package abstraction2;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, int age, double salary){
        super(name, age, salary);
    }

    @Override
    public double calculatePay(double salary) {
        return (salary/20) / 8;
    }
}
