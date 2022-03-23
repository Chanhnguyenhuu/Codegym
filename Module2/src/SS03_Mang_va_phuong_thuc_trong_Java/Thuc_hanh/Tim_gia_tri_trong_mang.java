package SS03_Mang_va_phuong_thuc_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Hãy nhập tên học sinh: ");
        String name = scanner.nextLine();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                check = true;
                index = i + 1;
            }
        }
        if (check) {
            System.out.println("Học sinh " + name + " nằm ở vị trí " + index + " trong mảng");
        } else {
            System.out.println("Học sinh " + name + " không nằm trong mảng");
        }
    }
}
