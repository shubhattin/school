import java.util.*;

class MatrixSub {
    int[][] arr;
    int m, n;

    MatrixSub(int mm, int nn) {
        m = mm > 25 ? 25 : mm;
        n = nn > 25 ? 25 : nn;
        arr = new int[m][n];
    }

    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrx of " + m + " x " + n + " = ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
    }

    MatrixSub SubMat(MatrixSub A) {
        if (n != A.n || m != A.m) {
            System.out.println("Matrix Subtraction not Applicable");
            System.exit(-1);
        }
        MatrixSub B = new MatrixSub(m, n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                B.arr[x][y] = arr[x][y] - A.arr[x][y];
        return B;
    }

    void show() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n of the Matrix 1: ");
        MatrixSub a = new MatrixSub(sc.nextInt(), sc.nextInt());
        a.fillarray();
        System.out.print("Enter m,n of the Matrix 2: ");
        MatrixSub b = new MatrixSub(sc.nextInt(), sc.nextInt());
        b.fillarray();
        MatrixSub C = a.SubMat(b);
        System.out.println("Subtracted Matrix:- ");
        C.show();
        sc.close();
    }
}
