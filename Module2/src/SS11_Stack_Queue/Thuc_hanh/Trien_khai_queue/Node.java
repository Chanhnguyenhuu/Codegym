package SS11_Stack_Queue.Thuc_hanh.Trien_khai_queue;

public class Node {
    private int data;
    public Node link;

    public Node(int data, Node link) {
        this.data = data;
        this.link = null;
    }

    public Node() {

    }

    public int getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
