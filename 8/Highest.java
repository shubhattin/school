import java.util.*;

class Record {
    String n[];
    int m[];
    int size;

    Record(int cap) {
        size = cap;
    }

    void readarray() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        n = new String[size];
        m = new int[size];
        for (int x = 1; x <= size; x++) {
            System.out.printf("Enter Name %d: ", x);
            n[x - 1] = sc.nextLine();
            System.out.printf("Enter Marks %d: ", x);
            m[x - 1] = sc1.nextInt();
        }
        sc.close();
        sc1.close();
    }

    void show() {
        for (int x = 0; x < size; x++) {
            System.out.println("----------------------------");
            System.out.printf("Name %d: %s\n", x + 1, n[x]);
            System.out.printf("Marks %d: %d\n", x + 1, m[x]);
        }
    }
}

public class Highest extends Record {
    int ind;

    Highest(int cap) {
        super(cap);
        ind = 0;
    }

    void find() {
        int max = m[0];
        for (int x = 1; x < size; x++)
            if (m[x] > max) {
                max = m[x];
                ind = x;
            }
    }

    void show() {
        super.show();
        System.out.println("----------------------------");
        System.out.println("Highest Details :-");
        System.out.printf("Name: %s\n", n[ind]);
        System.out.printf("Marks: %d\n", m[ind]);
    }

    public static void main(String[] args) {
        Highest a = new Highest(3);
        a.readarray();
        a.find();
        a.show();
    }
}