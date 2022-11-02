import java.util.Scanner;

class WonderSquare {
    int M, N;
    int[][] A;

    public static void main(String[] args) {
        WonderSquare a = new WonderSquare();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order of Matrix M, N: ");
        M = sc.nextInt();
        N = sc.nextInt();
        A = new int[M][N];
        System.out.println("Enter Matrix of " + M + " by " + N + ": ");
        for (int x = 0; x < M; x++)
            for (int y = 0; y < N; y++)
                A[x][y] = sc.nextInt();
        System.out.println("Entered Matrix:-");
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
        sc.close();
        if (check())
            System.out.println("Is a Wonderous Sqaure");
        else
            System.out.println("Is not a Wonderous Sqaure");
    }

    boolean check() {
        int sum = row_sum(0);
        for (int x = 0; x < M; x++)
            if (row_sum(x) != sum)
                return false;
        for (int x = 0; x < N; x++)
            if (col_sum(x) != sum)
                return false;
        return true;
    }

    int col_sum(int i) {
        int sum = 0;
        for (int x = 0; x < N; x++)
            sum += A[x][i];
        return sum;
    }

    int row_sum(int i) {
        int sum = 0;
        for (int x = 0; x < M; x++)
            sum += A[i][x];
        return sum;
    }
}