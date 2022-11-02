import java.util.*;

public class LowTri {
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
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i < j && A[i][j] != 0)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        LowTri a = new LowTri();
        a.input();
        a.display();
    }
}
