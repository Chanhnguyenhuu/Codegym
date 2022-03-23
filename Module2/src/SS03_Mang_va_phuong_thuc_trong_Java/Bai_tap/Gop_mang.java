package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng thứ nhất: ");
        int sizeArray1 = scanner.nextInt();
        System.out.print("Nhập độ dài của mảng thứ hai: ");
        int sizeArray2 = scanner.nextInt();

        while (sizeArray1 <= 0 || sizeArray2 <= 0) {
            System.out.print("Nhập sai, xin vui lòng nhập lại độ dài của mảng thứ nhất: ");
            sizeArray1 = scanner.nextInt();
            System.out.print("Nhập sai, xin vui lòng nhập lại độ dài của mảng thứ hai: ");
            sizeArray2 = scanner.nextInt();
        }

        int[] array1 = new int[sizeArray1];
        for (int i = 0; i < sizeArray1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ nhất");
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[sizeArray2];
        for (int i = 0; i < sizeArray2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ hai");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[sizeArray1 + sizeArray2];
        for (int i = 0; i < sizeArray1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < sizeArray2; i++) {
            array3[sizeArray1 + i] = array2[i];
        }

        System.out.println("Mảng thứ nhất là: ");
        for (int i = 0; i < sizeArray1; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Mảng thứ hai là: ");
        for (int i = 0; i < sizeArray2; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("Mảng thứ ba là: ");
        for (int i = 0; i < sizeArray1 + sizeArray2; i++) {
            System.out.println(array3[i]);
        }
    }
}
