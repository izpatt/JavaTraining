package abstraction2;

public abstract class Employee {

    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public abstract double calculatePay(double salary);

}
