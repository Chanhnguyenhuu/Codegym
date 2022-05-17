package Bai_tap_them.Quan_ly_xe.Views;

import Bai_tap_them.Quan_ly_xe.Controllers.CarController;
import Bai_tap_them.Quan_ly_xe.Models.impl.Car;

import java.util.Scanner;

public class ThemPhuongTien {
    private static final CarController carController = new CarController();
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayPhuongTien() {
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm oto");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Trở lại Menu chính");
        System.out.print("Chọn loại xe: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:

                break;
            case 2:
                carController.addCar(taoCar());
                ViewHome.displayMenu();
                break;
            case 3:

                break;
            case 4:
                ViewHome.displayMenu();
                break;
        }
    }

    private static Car taoCar() {
        Car car = new Car();
        System.out.print("Nhập biển số xe: ");
        String bienSoXe = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        return car = new Car(bienSoXe,hangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
    }
}
