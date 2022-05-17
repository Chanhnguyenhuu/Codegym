package Case_study.Views;

import java.util.Scanner;

public class FuramaView {
    public static void displayMenuFurama() {
        System.out.println("Chào mừng bạn đến với khu nghỉ dưỡng Furama");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 6);

        switch (choice) {
            case 1:
                EmployeeManagementView.displayEmployeeManagement();
                break;
            case 2:
                CustomerManagementView.displayCustomerManagement();
                break;
            case 3:
                FacilityManagementView.displayFacilityManagement();
                break;
            case 4:
                BookingManagementView.displayBookingManagement();
                break;
            case 5:
                PromotionManagementView.displayPromotionManagement();
                break;
            case 6:

                break;
        }
    }

    public static void main(String[] args) {
        displayMenuFurama();
    }
}
