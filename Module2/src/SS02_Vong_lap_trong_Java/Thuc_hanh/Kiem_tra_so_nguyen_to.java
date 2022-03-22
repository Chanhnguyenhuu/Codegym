package Vong_lap_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra: ");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2) {
            check = false;
        } else if (num == 2) {
            check = true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
        }
        if (check) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải số nguyên tố");
        }
    }
}
