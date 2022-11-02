import java.util.*;

public class MirrorMat {
    int m, n;
    int[][] arr;

    MirrorMat(int m, int n) {
        this.m = m;
        this.n = n;
        arr = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + m + " x " + n + " Matrix :- ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
        sc.close();
    }

    MirrorMat mirror() {
        MirrorMat b = new MirrorMat(m, n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                b.arr[x][y] = arr[x][n - y - 1];
        return b;
    }

    void display() {
        System.out.println("Matrix:- ");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MirrorMat a = new MirrorMat(4, 4);
        a.input();
        a.mirror().display();
    }
}
