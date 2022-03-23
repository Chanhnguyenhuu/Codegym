package SS03_Mang_va_phuong_thuc_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Độ C sang độ F");
        System.out.println("2. Độ F sang độ C");
        System.out.println("0. Exit");
        System.out.println("Nhập số muốn chọn");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hãy nhập độ C");
                double tempC = scanner.nextDouble();
                double tempF = (9.0 / 5) * tempC + 32;
                System.out.println(tempC + " độ C bằng " + tempF + " độ F");
                break;
            case 2:
                System.out.println("Hãy nhập độ F");
                tempF = scanner.nextDouble();
                tempC = (5.0 / 9) * (tempF - 32);
                System.out.println(tempF + " độ F bằng " + tempC + " độ C");
                break;
            case 0:
                System.exit(0);
                break;
        }

    }
}
