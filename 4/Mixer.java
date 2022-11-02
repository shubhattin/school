import java.util.*;

class Mixer {
    int[] arr;
    int n;

    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array of " + n + " in ascending order without repeating: ");
        for (int x = 0; x < n; x++)
            arr[x] = sc.nextInt();
    }

    Mixer mix(Mixer A) {
        Mixer B = new Mixer(n + A.n);
        int i = 0, max = Math.max(n, A.n);
        for (int x = 0; x < max; x++) {
            if (x < n)
                B.arr[i++] = arr[x];
            if (x < A.n)
                B.arr[i++] = A.arr[x];
        }
        return B;
    }

    void display() {
        for (int y = 0; y < n; y++)
            System.out.print(arr[y] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n of the Array 1: ");
        Mixer A = new Mixer(sc.nextInt());
        A.accept();
        System.out.print("Enter n of the Array 2: ");
        Mixer B = new Mixer(sc.nextInt());
        B.accept();
        Mixer C = A.mix(B);
        System.out.println("Merged Matrix");
        C.display();
        sc.close();
    }
}
