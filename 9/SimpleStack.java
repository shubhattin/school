class Stack {
    protected int[] STK;
    protected int size, top = -1;

    Stack(int size) {
        this.size = size;
        STK = new int[size];
    }

    void push(int val) {
        if (top < size - 1) {
            STK[++top] = val;
        } else {
            System.out.println("StatckOverflow");
        }
    }

    int pop() {
        if (top != -1) {
            return STK[top--];
        } else {
            System.out.println("StatckUnderFlow");
            return -1;
        }
    }
}

public class SimpleStack {
    public static void main(String[] args) {
        Stack stk = new Stack(3);
        stk.push(198);
        stk.push(298);
        stk.push(1298);
        stk.push(18); // should show error
        for (int x = 0; x < 4; x++) {
            System.out.println(stk.pop());
        }
    }
}
