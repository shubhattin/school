import java.util.Scanner;

class MatrixMul {
    int[][] arr;
    int m, n;

    MatrixMul(int m1, int n1) {
        m = m1;
        n = n1;
        arr = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrx of " + m + " x " + n + " = ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
    }

    MatrixMul multiply(MatrixMul A) {
        if (n != A.m) {
            System.out.println("MAtrix Multiplicaton not applicable");
            System.exit(-1);
        }
        MatrixMul B = new MatrixMul(m, A.n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < A.n; y++) {
                int sum = 0;
                for (int i = 0; i < n; i++)
                    sum += arr[x][i] * A.arr[i][y];
                B.arr[x][y] = sum;
            }
        return B;
    }

    void print() {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n of the Matrix 1: ");
        MatrixMul a = new MatrixMul(sc.nextInt(), sc.nextInt());
        a.input();
        System.out.print("Enter m,n of the Matrix 2: ");
        MatrixMul b = new MatrixMul(sc.nextInt(), sc.nextInt());
        b.input();
        MatrixMul C = a.multiply(b);
        System.out.println("Multiplied Matrix: ");
        C.print();
        sc.close();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * m | int | number of rows
 * n | int | number of columns
 * arr | int[][] | array of dimension m by n
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***MatrixMul multiply()***
 * A | MatrixMul | **argument** :- the second matrix
 * B | MatrixMul | the resultant of matrix multiplication
 * ***void main()***
 * sc | Scanner | to take user input
 * a | MatrixMul | to store first matrix
 * b | MatrixMul | to store second matrix
 * C | MatrixMul | to store resultant matrix of multiplication
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize Matric 'a' using MatrixMul class and take input using *input()*
 * method
 * 2. Initialize Matric 'b' using MatrixMul class and take input using *input()*
 * method
 * 3. Declare C= a.multiply(b), this stores the matrix multiplication resultant
 * 4. display the resultant matrix using *C.print()*
 * #### ***void input()***
 * 1. Initialize Scanner object to take input
 * 2. Take input in the matrix elements using nested for loops
 * #### ***void print()***
 * 1. Print the elements of matrix using nested for loops
 * #### ***MatrixMul multiply(MatrixMul A)***
 * 1. if n is not equal to A.m then print "Matrix Multiplication not Applicable and exit"
 * 2. Initialize the Resultant matrix 'B' of order m by A.n.
 * 3. Start **for** loop with x=0, x<m and x=x+1
 * 4. Start **for** loop with y=0, y<A.n and y=y+1
 * 5. Initialize sum=0
 * 6. Start **for** loop with i=0, i<n and i=i+1
 * 7. sum = sum + arr[x][i] * A.arr[i][y]
 * 8. End **for** loop
 * 9. Store B.arr[x][y]=sum
 * 10. End **for** loop
 * 11. End **for** loop
 * 12. return B
 */