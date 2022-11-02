import java.util.Scanner;

public class Combine {
    int n;
    int[] A;

    Combine(int n) {
        this.n = n;
        A = new int[n];
    }

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array of Size " + n + ": ");
        for (int x = 0; x < n; x++)
            A[x] = sc.nextInt();
    }

    void sort() {
        for (int x = 0; x < n - 1; x++) {
            int large = A[x], i = x;
            for (int y = x; y < n; y++)
                if (A[y] < large) {
                    large = A[y];
                    i = y;
                }
            A[i] = A[x];
            A[x] = large;
        }
    }

    Combine mix(Combine A) {
        Combine B = new Combine(n + A.n);
        int max = Math.max(n, A.n), i = 0;
        for (int x = 0; x < max; x++) {
            if (x < this.n)
                B.A[i++] = this.A[x];
            if (x < A.n)
                B.A[i++] = A.A[x];
        }
        return B;
    }

    void display() {
        for (int x = 0; x < n; x++)
            System.out.print(A[x] + ", ");
    }

    public static void main(String[] args) {
        Combine a1 = new Combine(4);
        Combine a2 = new Combine(2);
        a1.inputArray();
        a1.sort();
        a2.inputArray();
        a2.sort();
        Combine b = a1.mix(a2);
        b.display();
    }
}