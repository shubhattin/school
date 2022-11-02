import java.util.*;

class Combine {
    int[] arr;
    int n;

    Combine(int nn) {
        n = nn;
        arr = new int[n];
    }

    void inputarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array of " + n + " length: ");
        for (int x = 0; x < n; x++)
            arr[x] = sc.nextInt();
    }

    void sort() {
        for (int x = 0; x < n - 1; x++) {
            int small = arr[x], i = x;
            for (int y = x; y < n; y++) {
                if (arr[y] < small) {
                    small = arr[y];
                    i = y;
                }
            }
            arr[i] = arr[x];
            arr[x] = small;
        }
    }

    void mix(Combine A, Combine B) {
        Mixer C = new Mixer(A.n + B.n);
        int i = 0, max = Math.max(A.n, B.n);
        for (int x = 0; x < max; x++) {
            if (x < A.n)
                C.arr[i++] = A.arr[x];
            if (x < B.n)
                C.arr[i++] = B.arr[x];
        }
        n = A.n + B.n;
        arr = C.arr;
    }

    void display() {
        for (int y = 0; y < n; y++)
            System.out.print(arr[y] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n of the Array 1: ");
        Combine A = new Combine(sc.nextInt());
        A.inputarray();
        System.out.print("Enter n of the Array 2: ");
        Combine B = new Combine(sc.nextInt());
        B.inputarray();
        A.mix(A, B);
        A.sort();
        System.out.println("Sorted and Merged Array: ");
        A.display();
        sc.close();
    }
}
