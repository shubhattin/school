import java.util.*;;

public class ColumnShift {
    int m, n;
    int[][] arr;

    ColumnShift(int m, int n) {
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

    ColumnShift shift() {
        ColumnShift b = new ColumnShift(m, n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                b.arr[x + 1 == m ? 0 : x + 1][y] = arr[x][y];
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
        ColumnShift a = new ColumnShift(4, 4);
        a.input();
        a.shift().display();
    }
}