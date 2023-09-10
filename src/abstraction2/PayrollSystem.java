package abstraction2;

public class PayrollSystem {

    public static void main(String[] args) {

        Employee salariedEmployee = new SalariedEmployee( "Patricia Anne", 23, 100000);
        Employee hourlyEmployee = new HourlyEmployee("Patricia Anne", 23, 100000);

        System.out.println(
                "\nEmployee: \t\t\t\t\t\t" + salariedEmployee.name +
                "\nAge: \t\t\t\t\t\t\t" + hourlyEmployee.age + " years old" +
                "\nHourly Rate (P): \t\t\t\t" + hourlyEmployee.calculatePay(100000) +
                "\nAnnual Salary Rate (P): \t\t" + salariedEmployee.calculatePay(100000));
    }

}
