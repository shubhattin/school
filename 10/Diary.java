class Queue {
    protected int start = -1, end = -1, size;
    String[] Q;

    public Queue(int max) {
        size = max;
        Q = new String[size];
    }

    void pushadd(String val) {
        if (end == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            Q[++end] = val;
        }
    }

    String popadd() {
        if (end == start) {
            System.out.println("Empty Queue");
            return "?????";
        } else {
            return Q[++start];
        }
    }

    void show() {
        for (int x = start + 1; x <= end; x++) {
            System.out.println(Q[x]);
        }
    }
}

public class Diary {
    public static void main(String[] args) {

    }
}
