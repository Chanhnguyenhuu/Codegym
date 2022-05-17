package Case_study.Views;

import Case_study.Controllers.EmployeeController;

import java.util.Scanner;

public class EmployeeManagementView {
    private static final EmployeeController employeeController = new EmployeeController();

    public static void displayEmployeeManagement() {
        System.out.println("Employee Management");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                employeeController.displayEmployeeMenu();
                break;
            case 2:
                employeeController.addEmployee();
                break;
            case 3:
                employeeController.editEmployee();
                break;
            case 4:
                FuramaView.displayMenuFurama();
                break;
        }
    }
}
