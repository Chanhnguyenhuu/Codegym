package SS11_Stack_Queue.Thuc_hanh.Dao_nguoc_phan_tu_su_dung_stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        ReverseInteger stack = new ReverseInteger();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        stack.reverse();
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }


    }
}
