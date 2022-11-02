import java.util.*;

class AddTime {
    int[] A = new int[2];

    AddTime() {
        A[0] = 0;
        A[1] = 0;
    }

    void readtime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        A[0] = sc.nextInt();
        System.out.print("Enter Minutes: ");
        A[1] = sc.nextInt();
    }

    void addtime(AddTime a, AddTime b) {
        int t1 = a.A[0] * 60 + a.A[1];
        int t2 = b.A[0] * 60 + b.A[1];
        int t = t1 + t2;
        A[0] = t / 60; // hours
        A[1] = t % 60; // minutes
    }

    void disptime() {
        System.out.println("Time: " + A[0] + " hours " + A[1] + " minutes");
    }

    public static void main(String[] args) {
        AddTime a = new AddTime();
        AddTime b = new AddTime();
        a.readtime();
        b.readtime();
        a.addtime(a, b);
        a.disptime();
    }
}
