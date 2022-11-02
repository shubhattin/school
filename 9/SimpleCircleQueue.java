class Queue {
    protected int f = 0, r = 0, size;
    int[] Q;

    public Queue(int max) {
        size = max;
        // actual capacity will be size-1 as 0 is reserved for pointers
        Q = new int[size];
    }

    void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            r = (r + 1) % size;
            Q[r] = val;
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        } else {
            f = (f + 1) % size;
            return Q[f];
        }
    }

    boolean isFull() {
        return (r + 1) % size == f;
    }

    boolean isEmpty() {
        return r == f;
    }
}

public class SimpleCircleQueue {
    public static void main(String[] args) {
        Queue q = new Queue(4); // actual capacity would be 3
        q.enQueue(34);
        q.enQueue(89);
        q.enQueue(17);
        while (!q.isEmpty()) {
            System.out.println(q.deQueue());
        }
        q.enQueue(12);
        q.enQueue(12);
        q.deQueue();
        q.enQueue(12);
        q.enQueue(12);
    }
}
