package Vong_lap_trong_Java.Bai_tap;

import java.util.Scanner;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố");
        int n = scanner.nextInt();
        int count = 1;
        System.out.println("Số nguyên tố thứ " + count + ": " + 2);
        for (int i = 3; count < n; i = i + 2) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                count++;
                System.out.println("Số nguyên tố thứ " + count + ": " + i);
            }
        }
    }
}
