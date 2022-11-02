import java.util.*;;

public class Triangle {
    int n;

    boolean check(int n) {
        int sm = 0;
        for (int x = 0; x < n; x++) {
            sm += x;
            if (sm > n)
                return false;
            else if (sm == n)
                return true;
        }
        return false;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of n: ");
        n = sc.nextInt();
        sc.close();
    }

    void print() {
        System.out.print("Triangular Numbers:- ");
        for (int x = 3; x <= n; x++)
            if (check(x))
                System.out.print(x + ", ");
    }

    public static void main(String[] args) {
        Triangle a = new Triangle();
        a.input();
        a.print();
    }
}

/*
 * Algorithm
 * #### ***void main()***
 * 1. Intialize a object of class Traingle.
 * 2. Call the function *input()*.
 * 3. Call the function *print()*.
 * #### ***void input()***
 * 1. Initialize the Scanner Object to take input.
 * 2. Take input into the variable 'n' as integer.
 * #### ***boolean check()***
 * 1. Intialize a integer 'sm' as 0 and integer 'x' as 0.
 * 2. Start **for** loop with condition **x<n**.\
 * 3. sm=sm+x
 * 4. if sm>n return *false*
 * 5. else if sm==n return *true*
 * 6. End **for** loop
 * 7. return false, as it is not a triangular number.
 * #### ***void print()***
 * 1. Start a *for* loop to run from 3 to 'n'
 * 2. Check if the iterated number is triangular then print it.
 */
/*
 * Variable Description
 * | Name | Type | Uses |
 * | - | - | - |
 * | ***global*** |
 * | n | int | to store entered number for evaluation |
 * | ***void main()*** |
 * | a | Triangle | Object to call the functions of the class |
 * | ***void input()*** |
 * | sc | Scanner | to take user input
 * | ***boolean check()*** |
 * | sm | int | to store sum of consecutive numbers |
 * | x | int | a counter variable for the *for* loop
 * | ***void input()*** |
 * | x | int | a counter variable for the *for* loop
 */