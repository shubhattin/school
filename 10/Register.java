class Stack {
    protected String[] stud;
    protected int size, top = -1;

    Stack(int max) {
        size = max;
        stud = new String[size];
    }

    void push(String n) {
        if (top < size - 1) {
            stud[++top] = n;
        } else {
            System.out.println("StatckOverflow");
        }
    }

    String pop() {
        if (top != -1) {
            return stud[top--];
        } else {
            System.out.println("StatckUnderFlow");
            return "$$";
        }
    }

    void display() {
        for (int x = 0; x < top; x++)
            System.out.println(stud[x]);
    }
}

public class Register {
    public static void main(String[] args) {

    }
}
