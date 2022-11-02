import java.util.Scanner;

class WonderSquare1 {
    int n;
    int[][] A;

    public static void main(String[] args) {
        WonderSquare1 a = new WonderSquare1();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order of Square Matrix(n): ");
        n = sc.nextInt();
        A = new int[n][n];
        System.out.println("Enter Matrix of " + n + " by " + n + ": ");
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++)
                A[x][y] = sc.nextInt();
        System.out.println("Entered Matrix:-");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++)
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
        int[] cn = new int[n * n + 1]; // storing count of occurences of numbers from 1 to n^2
        // ^ Checking if numbers come in range and they occur only once
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++) {
                int vl = A[x][y];
                if (vl > n * n || vl < 1)
                    return false;
                if (++cn[vl] == 2)
                    return false;
            }
        int sum = n * (n * n + 1) / 2;
        for (int x = 0; x < n; x++)
            if (row_sum(x) != sum)
                return false;
        for (int x = 0; x < n; x++)
            if (col_sum(x) != sum)
                return false;
        return true;
    }

    int col_sum(int i) {
        int sum = 0;
        for (int x = 0; x < n; x++)
            sum += A[x][i];
        return sum;
    }

    int row_sum(int i) {
        int sum = 0;
        for (int x = 0; x < n; x++)
            sum += A[i][x];
        return sum;
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * n | int | order of the square matrix
 * A | int[][] | the 2D Array
 * ***void main()***
 * a | WonderSquare | object to call its method
 * ***void input()***
 * cn | int[] | a array of size *n<sup>2</sup>+1* to freequency of numbers
 * x, y | int | counter variables to iternate over the 2D Array
 * sum | int | to store the sum of evaluation of row and columns
 * ***int col_sum()***
 * i | int | **argument** :- index of the current column
 * sum | int | to store column sum
 * ***int row_sum()***
 * i | int | **argument** :- index of the current row
 * sum | int | to store row sum
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize object of WonderSquare to call its function
 * 2. Call the *input()* and *check()* methods.
 * #### ***void input()***
 * 1. Input the order of the square matrix and store it in 'n'
 * 2. Initialize the A Matrix of order n by n
 * 3. Enter the matrix and print it.
 * 4. Call the *check()* method and if returns it is wonder square and then
 * print it accordingly.
 * #### ***boolean check()***
 * 1. Initialize a integer array named 'cn' of size 'n<sup>2</sup>+1'.
 * 2. Start **for** loop with x=0, x<n and x=x+1.
 * 3. Start **for** loop with y=0, y<n and x=x+1
 * 4. Initialize vl=A[x][y]
 * 5. if vl > n<sup2</sup> or vl < 1 then return false
 * 6. cn[vl] = cn[vl] + 1
 * 7. if cn[vl] == 2 then return 2
 * 8. End **for**
 * 9. End **for**
 * 10. Initialize sum = n(n<sup>2</sup>+1)*0.5
 * 11. Start **for** loop with x=0, x < n amd x=x+1
 * 12. if row_sum(x)!=sum or col_sum(x)!=sum then return false
 * 13. End **for**
 * 14. return **true**
 * #### ***int col_sum(int i)***
 * 1. Initialize sum=0
 * 2. Start **for** loop with x=0, x<n and x=x+1
 * 3. sum=sum+A[x][i]
 * 4. End **for** loop
 * 5. return *sum*
 * #### ***int row_sum(int i)***
 * 1. Initialize sum=0
 * 2. Start **for** loop with x=0, x<n and x=x+1
 * 3. sum=sum+A[i][x]
 * 4. End **for** loop
 * 5. return *sum*
 */