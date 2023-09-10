package abstraction2;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int age, double salary){
        super(name, age, salary);
    }

    @Override
    public double calculatePay(double salary) {
        return salary * 12;
    }
}
