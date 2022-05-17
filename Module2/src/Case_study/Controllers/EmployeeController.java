package Case_study.Controllers;

import Case_study.Services.impl.EmployeeService;

public class EmployeeController {
    private static final EmployeeService employeeService = new EmployeeService();

    public void displayEmployeeMenu() {
        employeeService.displayMenu();
    }

    public void addEmployee() {
        employeeService.addEmployee();
    }

    public void editEmployee() {
        employeeService.editEmployee();
    }
}
