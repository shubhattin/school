import java.util.*;

public class Scalar {
    int n;
    int A[][];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("SIze of Matrix: ");
        n = sc.nextInt();
        A = new int[n][n];
        System.out.println("The Matric is :- ");
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++)
                A[x][y] = sc.nextInt();
        sc.close();
    }

    void display() {
        System.out.println("Is " + (check() ? "" : "not ") + "a Lower Triangular Matrix");
    }

    boolean check() {
        int k = A[0][0];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int vl = A[i][j];
                if (i == j && vl != k)
                    return false;
                else if (i != j && vl != 0)
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scalar a = new Scalar();
        a.input();
        a.display();
    }
}
