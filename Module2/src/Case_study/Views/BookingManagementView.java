package Case_study.Views;

import java.util.Scanner;

public class BookingManagementView {
    public static void displayBookingManagement() {
        System.out.println("Booking Management");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new constracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 6);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                FuramaView.displayMenuFurama();
                break;
        }
    }
}
