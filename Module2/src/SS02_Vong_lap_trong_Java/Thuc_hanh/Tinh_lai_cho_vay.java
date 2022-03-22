package Vong_lap_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Tinh_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền vay");
        double money = scanner.nextDouble();
        System.out.println("Nhập lãi suất");
        double lai = scanner.nextDouble();
        System.out.println("Nhập số tháng vay");
        int month = scanner.nextInt();

        double totalInterest = 0;
        for (int i = 1; i <= month; i++) {
            totalInterest += money * (lai / 100) / 12 * month;
        }

        System.out.println("Số tiền lãi là: " + totalInterest);
    }
}
