package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.Locale;
import java.util.Scanner;

public class Dem_so_lan_xuat_hien_ki_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kì: ");
        String str = scanner.nextLine().toUpperCase();
        System.out.println("Nhập một kí tự muốn kiểm tra: ");
        String check = scanner.nextLine().toUpperCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (check.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        System.out.println("Trong chuỗi có " + count + " kí tự " + check);
    }
}
