import java.util.*;

public class MatDiff {
    int m, n;
    int[][] arr;

    MatDiff(int m, int n) {
        this.m = m;
        this.n = n;
        arr = new int[m][n];
    }

    void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix: ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
    }

    MatDiff Subtract(MatDiff a) {
        MatDiff b = new MatDiff(m, n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                b.arr[x][y] = arr[x][y] - a.arr[x][y];
        return b;
    }

    void display() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(arr[x][y] + '\t');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatDiff a = new MatDiff(2, 3);
        MatDiff b = new MatDiff(2, 3);
        a.inputMatrix();
        b.inputMatrix();
        a.Subtract(b).display();;
    }
}
