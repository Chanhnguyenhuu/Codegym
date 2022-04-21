package SS11_Stack_Queue.Thuc_hanh.Dem_tu_trong_chuoi_su_dung_map;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Nhập một chuỗi bất kì: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        CountWord countWord = new CountWord();
        String[] word = string.split("");
        for (int i = 0; i < word.length; i++) {
            countWord.push(word[i], 1);
        }
        System.out.println(countWord.getTree());
    }
}
