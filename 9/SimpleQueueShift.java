class Queue {
    protected int r = -1, size;
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
            int val = Q[0];
            for (int x = 0; x < r; x++)
                Q[x] = Q[x + 1];
            r--;
            return val;
        }
    }

    boolean isFull() {
        return r == size - 1;
    }

    boolean isEmpty() {
        return r == -1;
    }
}

public class SimpleQueueShift {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enQueue(34);
        q.enQueue(12);
        q.enQueue(134);
        q.enQueue(13); // overflow
        while (!q.isEmpty())
            System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(901);
        q.enQueue(902);
        q.enQueue(903);
        q.enQueue(904); // overflow
        while (!q.isEmpty())
            System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}