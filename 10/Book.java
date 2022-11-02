class Stack {
    protected String[] name;
    protected int max, point = -1;

    Stack(int cap) {
        max = cap;
        name = new String[max];
    }

    void add(String n) {
        if (point < max - 1) {
            name[++point] = n;
        } else {
            System.out.println("SHELF FULL");
        }
    }

    String tell() {
        if (point != -1) {
            return name[point--];
        } else {
            System.out.println("SHELF EMPTY");
            return "$$";
        }
    }

    void display() {
        for (int x = 0; x < point; x++)
            System.out.println(name[x]);
    }
}

public class Book {
    public static void main(String[] args) {

    }
}
