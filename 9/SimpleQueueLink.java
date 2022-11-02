class Node {
    protected int data;
    protected Node next = null;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    void setData(int data) {
        this.data = data;
    }

    void setLink(Node link) {
        this.next = link;
    }

    Node getLink() {
        return next;
    }

    int getData() {
        return data;
    }
}

class Queue {
    protected Node f = null, r = null;

    void enQueue(int val) {
        Node nptr = new Node(val, null);
        if (f == null) {
            f = r = nptr;
        } else {
            r.setLink(nptr);
            r = nptr;
        }
    }

    int deQueue() {
        if (f == null) {
            System.out.println("Queue Empty");
            return -1;
        } else {
            int val = f.getData();
            f = f.getLink();
            return val;
        }
    }

    boolean isEmpty() {
        return f == null;
    }
}

public class SimpleQueueLink {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(34);
        q.enQueue(12);
        q.enQueue(134);
        q.deQueue();
        q.enQueue(10);
        while (!q.isEmpty()) {
            System.out.println(q.deQueue());
        }
        System.out.println(q.deQueue());
        q.enQueue(90);
        q.enQueue(29);
        while (!q.isEmpty()) {
            System.out.println(q.deQueue());
        }
    }
}
