package employeesystem;

import employeesystem.exceptions.InvalidEmployeeName;
import employeesystem.exceptions.InvalidEmptyStringException;
import employeesystem.exceptions.InvalidUserMenuException;
import java.util.*;

public class Menu extends Employee {

    List<String> mainMenu = Arrays.asList("1 - Add Employee", "2 - Delete Employee", "3 - View Employee", "4 - View All Employee",
            "5 - Exit");

    public void displayMenu() {

        System.out.println("\nMenu: Employment System");
        mainMenu.stream().forEach(menu -> System.out.println("\t" + menu));

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Choice: ");
            int userInput = scan.nextInt();
            boolean isValidUserInput = userInput > 0 && userInput < 6;

            if(!isValidUserInput) {
                throw new InvalidUserMenuException("Menu is only ranging from 1-5, try again");
            } else {
                switch(userInput) {
                    case 1: addEmployee(); displayMenu(); break;
                    case 2: deleteEmployee(); displayMenu(); break;
                    case 3: viewEmployee(); displayMenu(); break;
                    case 4: viewAllEmployee(); displayMenu(); break;
                    case 5: System.out.println("Thank you for using my system!"); System.exit(0); break;
                }
            }

        } catch (InputMismatchException exception) {
            System.out.println("Invalid user input, please try again");
            displayMenu();
        } catch ( InvalidUserMenuException exception) {
            System.out.println(exception.getMessage());
            displayMenu();
        }
    }

    public void addEmployee()  {
        Scanner scan = new Scanner(System.in);
        System.out.println(" >> Add Employee << ");

        try {
            System.out.print("Enter Name: ");
            String userName = scan.nextLine();
            System.out.print("Enter Address: ");
            String userAddress =  scan.nextLine();

            if(userName.isBlank() | userAddress.isBlank()) {
                throw new InvalidEmptyStringException("Credentials cannot be blank entered");
            } else if(getEmployeeList().containsKey(userName)) {
                throw new InvalidEmployeeName("User already exists");
            } else if(userName.matches(".*\\d.*")) {
                throw new InvalidEmployeeName("Username is invalid");
            } else {
                setEmployeeList(userName, userAddress);
                System.out.println("Successfully added your Employee");
            }

        } catch(InvalidEmptyStringException e) {
            System.out.println(e.getMessage());
            addEmployee();
        } catch(InvalidEmployeeName e) {
            System.out.println(e.getMessage());
            addEmployee();
        }
    }

    public void deleteEmployee() {

        System.out.println("Delete Employee");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Name of Employee you want to delete");
            String employeeName = scan.nextLine();
            System.out.println("Enter the Address of Employee you want to delete");
            String employeeAddress = scan.nextLine();

            if(getEmployeeList().containsKey(employeeName)) {
                System.out.println("Employee with name " + employeeName + "and address " + employeeAddress + " was successfully deleted");
                getEmployeeList().remove(employeeName,employeeAddress);
            } else if(employeeName.isBlank() | employeeAddress.isBlank()) {
                throw new InvalidEmptyStringException("Invalid Employee credentials entered");
            } else {
                System.out.println("Employee with name " + employeeName + " does not exist. Please try again");
            }

        } catch(InvalidEmptyStringException e) {
            System.out.println(e.getMessage());
            deleteEmployee();
        }
    }

    public void viewEmployee() {
        System.out.println("View Employee");
        System.out.println("Enter the name of the employee you want to view");

        try {
            Scanner scan = new Scanner(System.in);
            String employeeName = scan.nextLine();

            if(getEmployeeList().containsKey(employeeName)) {
                System.out.printf("%-15s %-5s%n", "Employee Name", "Employee Address");
                System.out.printf("%-15s %-5s%n", employeeName, getEmployeeList().get(employeeName));
            }  else if (employeeName.isBlank()) {
                throw new InvalidEmployeeName("Invalid Employee Name");
            } else {
                System.out.println("Employee with name " + employeeName + " does not exist. Please try again");
            }
        } catch(InvalidEmployeeName e) {
            System.out.println(e.getMessage());
        }

    }

    public void viewAllEmployee() {
        System.out.println("View All Employee");
        System.out.println("-- List of current employees --");

        if(getEmployeeList().isEmpty()) {
            System.out.println("Empty list");
        } else {
            System.out.printf("%-15s %-5s%n", "Employee Name", "Employee Address");
            getEmployeeList().forEach((name, address) ->
                    System.out.printf("%-15s %-5s%n", name, address)
            );
        }
        
    }



}
