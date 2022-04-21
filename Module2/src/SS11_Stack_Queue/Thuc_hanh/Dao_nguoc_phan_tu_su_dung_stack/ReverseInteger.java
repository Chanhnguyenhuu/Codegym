package SS11_Stack_Queue.Thuc_hanh.Dao_nguoc_phan_tu_su_dung_stack;

import java.util.Stack;

public class ReverseInteger {
    Stack<Integer> stack = new Stack<>();

    public ReverseInteger() {
    }

    public void push(int item) {
            stack.push(item);
    }

    public int size() {
        return stack.size();
    }

    public int get(int i) {
        return stack.get(i);
    }

    public void reverse() {
        Stack<Integer> temp = new Stack<>();
        for (int i = stack.size() - 1; i >= 0 ; i--) {
            temp.push(stack.get(i));
        }
        stack.clear();
        stack = temp;
    }
}
