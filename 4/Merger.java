import java.util.*;

class Merger {
    long n1, n2, mergeNum;

    Merger() {
        n1 = 0;
        n2 = 0;
        mergeNum = 0;
    }

    void readNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = sc.nextLong();
        System.out.print("Enter n2: ");
        n2 = sc.nextLong();
        sc.close();
    }

    void joinNum() {
        String join = String.valueOf(n1) + String.valueOf(n2);
        mergeNum = Long.parseLong(join);
    }

    void display() {
        System.out.println("Merged Number: " + mergeNum);
    }

    public static void main(String[] args) {
        Merger a = new Merger();
        a.readNum();
        a.joinNum();
        a.display();
    }
}
