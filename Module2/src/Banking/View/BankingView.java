package Banking.View;

import Banking.Model.Account;
import Banking.Model.SavingAccount;
import Banking.Model.TinDungAccount;
import Banking.Service.BankingService;

import java.util.List;
import java.util.Scanner;

public class BankingView {
    private static Scanner scanner = new Scanner(System.in);
    private static BankingService bankingService = new BankingService();

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            int choice;
            do {
                System.out.println("___Menu___\n" +
                        "1. Add new Account\n" +
                        "2. Delete Account\n" +
                        "3. Display Banking Account\n" +
                        "4. Search Account\n" +
                        "5. Exit"
                );

                System.out.print("In put your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        create();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
            }
            while (choice <= 0 || choice >= 5);
        }
    }


    public static void create() {
        Account account;
        int choice;
        do {
            System.out.println("Choice type of Account to create:\n" +
                    "1. Saving\n" +
                    "2. Tin Dung\n");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
            }
        } while (choice <= 0 || choice > 2);

        System.out.print("1. Account id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("2. Name:");
        String name = scanner.nextLine();
        System.out.print("3. Phone :");
        String phone = scanner.nextLine();
        System.out.print("4. Birthday:");
        String birthday = scanner.nextLine();
        System.out.print("5. Số dư :");
        double sodu = Double.parseDouble(scanner.nextLine());
        System.out.print("6. Chi nhanh :");
        String chiNhanh = scanner.nextLine();

        if (choice == 1) {
            System.out.print("7. Số tài khoản :");
            String stk = scanner.nextLine();
            System.out.print("8. Status :");
            String status = scanner.nextLine();
            account = new SavingAccount(id, name, phone, birthday, sodu, chiNhanh, stk, status);
        } else {
            System.out.print("7. Số thẻ :");
            String soThe = scanner.nextLine();
            System.out.print("8. Mã Pin :");
            String maPin = scanner.nextLine();
            account = new TinDungAccount(id, name, phone, birthday, sodu, chiNhanh, soThe, maPin);
        }

        bankingService.create(account);
        System.out.println("Create successfully");
    }

    public static void display() {
        List<Account> accounts = bankingService.FindAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void delete() {
        display();
        System.out.print("Enter id to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        bankingService.delete(id);
        System.out.println("Deleted successfully");
    }
}
