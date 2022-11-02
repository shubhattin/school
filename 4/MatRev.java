import java.util.*;

class MatRev {
    int[][] arr;
    int m, n;

    MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrx of " + m + " x " + n + " = ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
    }

    int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    void revMat(MatRev P) {
        for (int x = 0; x < P.m; x++)
            for (int y = 0; y < P.n; y++)
                P.arr[x][y] = reverse(P.arr[x][y]);
    }

    void show() {
        System.out.println("Reversed Matrix:- ");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n of the Matrix: ");
        MatRev a = new MatRev(sc.nextInt(), sc.nextInt());
        a.fillarray();
        a.revMat(a);
        a.show();
        sc.close();
    }
}
