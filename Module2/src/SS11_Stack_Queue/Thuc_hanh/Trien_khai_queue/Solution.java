package SS11_Stack_Queue.Thuc_hanh.Trien_khai_queue;

public class Solution {

    public Solution() {

    }

    public void enQueue(Queue queue, int value) {
        Node node = new Node();
        node.setData(value);
        if (queue.getFront() == null) {
            queue.setFront(node);
        } else {
            queue.getRear().setLink(queue.getFront());
        }
        queue.setRear(node);
        queue.getRear().setLink(queue.getFront());
    }

    public void deQueue() {

    }

    public void displayQueue() {

    }
}
