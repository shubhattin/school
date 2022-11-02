class Queue {
    protected int f = -1, r = -1, size;
    int[] Q;

    public Queue(int max) {
        size = max;
        Q = new int[size];
    }

    void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            Q[++r] = val;
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        } else {
            return Q[++f];
        }
    }

    boolean isFull() {
        return r == size - 1;
    }

    boolean isEmpty() {
        return r == f;
    }
}

public class SimpleQueue {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enQueue(34);
        q.enQueue(12);
        q.enQueue(134);
        q.enQueue(134);
        while (!q.isEmpty()) {
            System.out.println(q.deQueue());
        }
        System.out.println(q.deQueue());
        q.enQueue(90); // we can also not add an element
    }
}