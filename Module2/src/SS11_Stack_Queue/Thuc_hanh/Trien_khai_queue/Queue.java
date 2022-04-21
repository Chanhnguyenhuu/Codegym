package SS11_Stack_Queue.Thuc_hanh.Trien_khai_queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Queue() {

    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
