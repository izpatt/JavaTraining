package employeesystem;

import java.util.HashMap;

public class Employee {

    private HashMap<String, String> employeeList = new HashMap<>();
    private enum Department { Finance, HR, IT }
    private String address;

    public HashMap<String, String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(HashMap<String, String> employeeList) {
        this.employeeList = employeeList;
    }
}
