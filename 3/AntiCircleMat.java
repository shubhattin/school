import java.util.*;

public class AntiCircleMat {
    int n;
    int[][] A;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of n: ");
        n = sc.nextInt();
        sc.close();
    }

    void fillMat() {
        A = new int[n][n];
        int a = 0, x = n*n;
        while (x >= 1) {
            int b = n - 1 - a;
            for (int i = a; i <= b; i++)
                A[i][a] = x--;
            for (int i = a + 1; i <= b; i++)
                A[b][i] = x--;
            for (int i = b - 1; i >= a; i--)
                A[i][b] = x--;
            for (int i = b - 1; i >= a + 1; i--)
                A[a][i] = x--;
            a++;
        }
    }

    void display() {
        System.out.println("Circular Matrix :- Clockwise");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AntiCircleMat a = new AntiCircleMat();
        a.input();
        a.fillMat();
        a.display();
    }
}
