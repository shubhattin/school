import java.util.Scanner;

class SaddlePoint {
    int M;
    int[][] A;

    public static void main(String[] args) {
        SaddlePoint a = new SaddlePoint();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order of Square Matrix(M): ");
        M = sc.nextInt();
        A = new int[M][M];
        System.out.println("Enter Matrix of " + M + " by " + M + ": ");
        for (int x = 0; x < M; x++)
            for (int y = 0; y < M; y++)
                A[x][y] = sc.nextInt();
        System.out.println("Entered Matrix:-");
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < M; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
        sc.close();
    }

    void check() {
        int found = 0;
        for (int x = 0; x < M; x++)
            for (int y = 0; y < M; y++) {
                int vl = A[x][y];
                if (min_row(vl, x) && max_col(vl, y)) {
                    found++;
                    System.out.println("Saddle Point found at " + x + "," + y + " = " + vl);
                }
            }
        if (found == 0)
            System.out.println("No Saddle Point found");
    }

    boolean min_row(int v, int i) {
        int min = A[i][0];
        for (int x = 0; x < M; x++)
            min = Math.min(min, A[i][x]);
        return min == v;
    }

    boolean max_col(int v, int i) {
        int max = A[0][i];
        for (int x = 0; x < M; x++)
            max = Math.max(max, A[x][i]);
        return max == v;
    }
}

/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * M | int | this is the dimension of the square matrix
 * A | int[][] | this is the main matrix for evaluation
 * ***void main(***
 * a | SaddlePoint | Object to call the functions
 * ***void main()***
 * sc | Scanner | Object to take user input
 * ***void check()***
 * found | int | This is the number of saddle points found
 * x, y | int | This is the counter variable to itertate over the 2D Array
 * ***boolean min_row()***
 * min | int | this is the minimum value in the row to return
 * ***boolea max_col()***
 * max | int | this is the maximum value in the column to return
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the SaddlePoint object.
 * 2. Call the *input()* and *check()* functions.
 * #### ***void input()***
 * 1. Initialize the scanner object to take the user input
 * 2. Take input of value of **M**, i.e. the dimensions of the sqaure matrix
 * 3. Initialize the 2D Array as M by M Array (reserving memory)
 * 4. Take input into the 2D Matrix and print it as well
 * #### ***void check()***
 * 1. Initialize a found interger as 0
 * 2. Iterate over the square matrix and check if the value is minimum in row
 * (using *min_row()* method) and also check it the value in maximum in column
 * (using *max_col()* method), if it evaluates true then increment value of
 * *found by 1* and print the current index where the saadle point is found,
 * i.e. the row and column.
 * 2. if value of *found* is 0 then print "No Saddle Point found"
 * #### ***boolean min_row()***
 * 1. Intialize *min* as A[i][0], here i is the current row
 * 2. Start *for* loop as x=0 and condition x<M and x=x+1
 * 3. min = Math.min(min, A[i][x])
 * 4. End **for** loop
 * 5. if v == min then return true else false (v is the argument value o be checked here)
 * #### ***boolean max_col()***
 * 1. Intialize *max* as A[0][i], here i is the current column
 * 2. Start *for* loop as x=0 and condition x<M and x=x+1
 * 3. max = Math.max(max, A[i][x])
 * 4. End *for* loop
 * 5. if v == max then return true else false (v is the argument value o be checked here)
 */