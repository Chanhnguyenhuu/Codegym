package SS03_Mang_va_phuong_thuc_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng điểm cần nhập: ");
        int size = Integer.parseInt(scanner.nextLine());
        while (size <= 0 || size > 30) {
            System.out.print("Nhập sai, vui lòng nhập lại số lượng điểm cần nhập: ");
            size = Integer.parseInt(scanner.nextLine());
        }
        int[] point = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập điểm thứ " + (i + 1) + ": ");
            point[i] = Integer.parseInt(scanner.nextLine());
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (point[i] >= 5 && point[i] <= 10) {
                count++;
            }
        }
        System.out.println("Có " + count + " sinh viên đỗ kì thi");
    }
}
