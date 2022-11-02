import java.util.*;

public class CircleMat {
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
        int a = 0, x = 1;
        while (x <= n * n) {
            int b = n - 1 - a;
            for (int i = a; i <= b; i++)
                A[i][a] = x++;
            for (int i = a + 1; i <= b; i++)
                A[b][i] = x++;
            for (int i = b - 1; i >= a; i--)
                A[i][b] = x++;
            for (int i = b - 1; i >= a + 1; i--)
                A[a][i] = x++;
            a++;
        }
    }

    void display() {
        System.out.println("Circular Matrix :- Anti Clockwise");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircleMat a = new CircleMat();
        a.input();
        a.fillMat();
        a.display();
    }
}

/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * n | int | to store the dimensions of the square matrix
 * A | int[][] | the matrix in which the pattern to be printed will be stored
 * ***void main()***
 * a | CircleMat | object to call it's method
 * ***void display()***
 * x, y | int | counter variables to iterate over the matrix
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***void fillMat()***
 * x | int | this is the value which will be stored in the matrix
 * a, b | int | indices to help us give printing location
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the object of class *CircleMat*
 * 2. Call the methods *input()*, *fillMat()* and *display()* successively.
 * #### ***void input()***
 * 1. Initialize Scanner object to take input
 * 2. Enter value of n into the variable 'n'.
 * #### ***void fillMat()***
 * 1. Initialize the 2D Array *'A'* as a n by n matrix
 * 2. Initialize value of a=0 and x=1
 * 3. Start **while** loop with condition *x <= n<sup>2</sup>*
 * 4. Store b = n-1-a
 * 5. Add a **for** loop with *i=a*, *i<=b* and i=i+1 and do A[i][a] = x++ (this
 * prints from left top to left bottom)
 * 6. Add a **for** loop with *i=a+1*, *i<=b* and i=i+1 and do A[b][i] = x++
 * (this prints pattern from left bottom to right bottom)
 * 7. Add a **for** loop with *i=b-1*, *i>=a* and i=i-1 and do A[i][b] = x++
 * (this prints pattern from right bottom to right top)
 * 8. Add a **for** loop with *i=b-1*, *i>=a+1* and i=i-1 and do A[a][i] = x++
 * (this prints pattern from right top to back to left top)
 * #### ***void display()***
 * 1. Iterate over the 2D Array and print it and this will the *required
 * circular pattern*.
 */