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

class Stack {
    protected Node top = null;

    public void push(int val) {
        // Currently we have set no limits to pushing elements
        Node nptr = new Node(val, top);
        top = nptr;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int val = top.getData();
            top = top.getLink();
            return val;
        }
    }

    public void show() {
        Node ptr = top;
        while (ptr != null) {
            System.out.printf("%d, ", ptr.getData());
            ptr = ptr.getLink();
        }
    }
}

public class SimpleStackLink {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.pop(); // should show error
        stk.push(198);
        stk.push(298);
        stk.push(1298);
        stk.push(1878);
        stk.push(1843);
        stk.push(1843);
        stk.push(1843);
        stk.push(1843);
        stk.push(1843);
        stk.show();
    }
}
