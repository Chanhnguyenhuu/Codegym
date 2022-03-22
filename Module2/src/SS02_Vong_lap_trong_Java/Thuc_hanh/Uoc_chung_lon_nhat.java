package Vong_lap_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai");
        int num2 = scanner.nextInt();

        int a = Math.abs(num1);
        int b = Math.abs(num2);

        if (a == 0 || b == 0) {
            System.out.println("Hai số không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + a);
    }
}
