package Bai_tap_them.Quan_ly_Product.View;

import Bai_tap_them.Quan_ly_Product.Model.ProductNhapKhau;
import Bai_tap_them.Quan_ly_Product.Model.ProductXuatKhau;
import Bai_tap_them.Quan_ly_Product.Model.Product;
import Bai_tap_them.Quan_ly_Product.Service.ProductService;
import Bai_tap_them.Quan_ly_Product.Util.ValidationUtil;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    private static ValidationUtil validationUtil = new ValidationUtil();

    public static void main(String[] args) {
        displayHomeMenu();

//        while (true) {
//            System.out.println("______Product Menu______");
//            System.out.println("1. Create");
//            System.out.println("2. Display");
//            System.out.println("3. Delete");
//            System.out.println("4. Search by Name");
//            System.out.println("5. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choose = Integer.parseInt(scanner.nextLine());
//
//            switch (choose) {
//                case 1:
//                    create();
//                    break;
//                case 2:
//                    display();
//                    break;
//                case 3:
//                    delete();
//                    break;
//                case 4:
//                    searchByName();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//            }
//        }
    }

    public static void displayHomeMenu() {

        String tmp = "";
        int choose = 0;
        do {
            System.out.println("______Product Menu______");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Search by Name");
            System.out.println("5. Exit");

//            System.out.print("Enter your choice: ");
//            choose = Integer.parseInt(scanner.nextLine());

            System.out.print(tmp.isEmpty() ? "Input your choice: " : "Please just input number from 1 to 5: ");
            tmp = scanner.nextLine();
            if (validationUtil.isNumber(tmp)) choose = Integer.parseInt(tmp);
        }
        while (choose <= 0 || choose >= 6);

        switch (choose) {
            case 1:
                create();
                break;
            case 2:
                display();
                break;
            case 3:
                delete();
                break;
            case 4:
                searchByName();
                break;
            case 5:
                System.exit(0);
                break;
        }
        displayHomeMenu();
    }


    private static void create() {
        String tmp = "";
        int choice = 0;
        do {
            System.out.println("Choice type product to create:");
            System.out.println("1. Nhập khẩu: ");
            System.out.println("2. Xuất khẩu: ");
            System.out.print(tmp.isEmpty() ? "Input your choice: " : "Please just input number from 1 to 2: ");
            tmp = scanner.nextLine();
            if (validationUtil.isNumber(tmp)) choice = Integer.parseInt(tmp);
        } while (choice <=0 || choice >=3);

//        System.out.println("Choice type product to create:");
//        System.out.println("1. Nhập khẩu: ");
//        System.out.println("2. Xuất khẩu: ");
//        System.out.print("Enter your choice: ");
//        choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Mã sản phẩm: ");
        String codeProduct = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng:");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Manufacturer: ");
        String manufacturer = scanner.nextLine();
        Product product;

        if (choice == 1) {
            System.out.print("Giá nhập khẩu: ");
            double giaNhapKhau = Integer.parseInt(scanner.nextLine());
            System.out.print("Tỉnh thành nhập: ");
            String tinhThangNhap = scanner.nextLine();
            System.out.print("Giá nhập khẩu: ");
            double thueNhapKhau = Integer.parseInt(scanner.nextLine());

            product = new ProductNhapKhau(0, codeProduct, name, price, soLuong, manufacturer, giaNhapKhau, tinhThangNhap, thueNhapKhau);
        } else {
            System.out.print("Giá xuất khẩu: ");
            double giaXuatKhau = Double.parseDouble(scanner.nextLine());
            System.out.print("Quốc gia nhập sản phẩm: ");
            String quocGiaNhap = scanner.nextLine();
            product = new ProductXuatKhau(0, codeProduct, name, price, soLuong, manufacturer, giaXuatKhau, quocGiaNhap);
        }
        productService.create(product);
        System.out.println("Create successfully");
    }

    private static void display() {
        List<Product> products = productService.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void delete() {
        display();
        System.out.print("Enter id to delete: ");
       // int id = Integer.parseInt(scanner.nextLine());
        String codeProduct = scanner.nextLine();
        productService.delete(codeProduct);
        System.out.println("Delete successfully");
    }

    private static void searchByName() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        List<Product> products = productService.searchByName(name);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
