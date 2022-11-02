import java.util.Scanner;

class EqMat {
    int[][] A;
    int m, n;

    EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        A = new int[m][n];
    }

    void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix of " + m + " x " + n + " :");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                A[x][y] = sc.nextInt();
    }

    int check(EqMat P, EqMat Q) {
        if (P.m != Q.m || P.n != Q.n)
            return 0;
        for (int x = 0; x < P.m; x++)
            for (int y = 0; y < P.n; y++)
                if (P.A[x][y] != Q.A[x][y])
                    return 0;
        return 1;
    }

    void print() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n for Matrix 1: ");
        EqMat a = new EqMat(sc.nextInt(), sc.nextInt());
        System.out.print("Enter m,n for Matrix 2: ");
        EqMat b = new EqMat(sc.nextInt(), sc.nextInt());
        a.readArray();
        System.out.println("Entered Array:-");
        a.print();
        b.readArray();
        System.out.println("Entered Array:-");
        b.print();
        System.out.println("Matrices are " + (a.check(a, b) == 1 ? "" : "not ") + "equal");
        sc.close();
    }
}
