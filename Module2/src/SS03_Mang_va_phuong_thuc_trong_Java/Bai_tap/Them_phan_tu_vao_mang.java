package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] arsg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.print("Nhập sai, xin nhập lại kích thước của mảng: ");
            size = scanner.nextInt();
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử cần thêm: ");
        int add = scanner.nextInt();
        System.out.print("Nhập vị trí muốn thêm vào mảng: ");
        int index = scanner.nextInt();
        boolean check = false;

        while (index<0 || index> size) {
            System.out.print("Nhập không đúng, vui lòng nhập lại vị trí muốn thêm vào mảng: ");
            index = scanner.nextInt();
        }

        int a = array[size-1];

        for (int i = 0; i <= size-index; i++) {
            array[size-1 - i] = array[size-2-i];
        }
        array[index-1]=add;
        //array[size-1]=0;

        System.out.println("Mảng sau khi thêm là: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Phần tử bị mất là: " + a);
    }
}
