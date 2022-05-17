package Case_study.Views;

import java.util.Scanner;

public class CustomerManagementView {

    public static void displayCustomerManagement() {
        System.out.println("Customer Management");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                FuramaView.displayMenuFurama();
                break;
        }
    }
}
