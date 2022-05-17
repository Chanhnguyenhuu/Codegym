package SS10_Danh_sach.Thuc_hanh.Trien_khai_lop_LinkedList_don_gian;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            
        }
    }
}
