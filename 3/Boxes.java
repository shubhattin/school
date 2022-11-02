import java.util.*;

public class Boxes {
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Boxes: ");
        n = sc.nextInt();
        if (n < 0 || n > 1000) {
            System.out.println("Invalid Input");
            System.exit(-1);
        }
        sc.close();
    }

    void denomination() {
        int[] order = { 48, 24, 12, 6 };
        for (int x = 0; x < order.length; x++) {
            int v = n / order[x];
            n -= order[x] * v;
            if (n != 0 && order[x] == 6)
                v++;
            if (v == 0)
                continue;
            System.out.println(order[x] + " * " + v + " = " + order[x] * v);
        }
    }

    public static void main(String[] args) {
        Boxes a = new Boxes();
        a.input();
        a.denomination();
    }
}