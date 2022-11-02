public class Queue {
    protected int front = -1, rear = -1, size;
    int[] Que;

    public Queue(int max) {
        size = max;
        Que = new int[size];
    }

    void addel(int val) {
        if (rear == size - 1) {
            System.out.println("Overflow");
        } else {
            Que[++rear] = val;
        }
    }

    int delete() {
        if (rear == front) {
            System.out.println("Underflow");
            return -9999;
        } else {
            return Que[++front];
        }
    }

    void display() {
        for (int x = front + 1; x <= rear; x++) {
            System.out.println(Que[x]);
        }
    }
}
