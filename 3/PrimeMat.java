
public class PrimeMat {
    int m, n;
    int[][] arr;

    PrimeMat(int m, int n) {
        this.m = m;
        this.n = n;
        arr = new int[m][n];
    }

    void prime() {
        int i = 0;
        for (int x = 2; i < m * n; x++) {
            if (is_prime(x))
                arr[i / n][i++ % n] = x;
        }
    }

    private boolean is_prime(int n) {
        for (int x = 2; x <= n / 2; x++)
            if (n % x == 0)
                return false;
        return true;
    }

    void display() {
        System.out.println("Prime Number Matrix:- ");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrimeMat a = new PrimeMat(6, 4);
        a.prime();
        a.display();
    }
}
