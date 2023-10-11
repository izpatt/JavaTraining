package employeesystem;

import java.util.HashMap;

public class Employee {

    private HashMap<String, String> employeeList = new HashMap<String, String>();
    private String name, address;

    public HashMap<String, String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(String name, String address) {
      this.employeeList.put(name,address);
    }
}
