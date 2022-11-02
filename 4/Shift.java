import java.util.*;;

class Shift {
    int[][] mat;
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix of " + m + " x " + n + " :");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                mat[x][y] = sc.nextInt();
    }

    void cyclic(Shift A) {
        int[][] mt = new int[m][n];
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                mt[(x - 1) % (m + 1)][y] = A.mat[x][y];
        mat = mt;
    }

    void display() {
        System.out.println("Shifted Arary :-");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(mat[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n for Matrix: ");
        Shift a = new Shift(sc.nextInt(), sc.nextInt());
        a.input();
        a.cyclic(a);
        a.display();
        sc.close();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * mat | int[][] | the matrix to be shifted by one row
 * m, n | int | dimensions of the matrix
 * ***void input()***
 * sc | Scanner | object to take user input
 * x, y | int | counter variables used to enter value into the matrix
 * ***void cyclic()***
 * mt | int[][] | the matrix to store the shifted matrix
 * x, y | int | counter variables to iterate over the matrix
 * ***void display()***
 * x, y | int | counter variables to iterate over the matrix to print it
 * ***void main()***
 * sc | Scanner | object to take user input
 * a | Shift | object to call the methods of the class
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the Scanner object to take input
 * 2. Enter the dimensions of the matrix and pass it as the constructor
 * parameters in the object initialization of class Shift
 * 3. Call the methods as input(), cyclic(a), display()
 * #### ***void input()***
 * 1. Initialize the scanner object to take input
 * 2. Take input of the Matrix 'mat' which is m by n using nested for loops.
 * #### ***void cyclic(Shift A)***
 * 1. Initailize a matrix 'mt' of the same dimensions as that of 'mat'
 * 2. Start **for** loop as x=0, x<m and x=x+1
 * 3. Start **for** loop as y=0, y<n and y=y+1
 * 4. mt[(x-1)%(m+1)]=A.mat[x][y]
 * 5. End **for** loop
 * 6. End **for** loop
 * #### ***void display()***
 * 1. Print the shifted array using nested for loops for iterating over the
 * matrix to print individual cells
 */