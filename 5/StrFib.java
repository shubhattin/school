import java.util.*;

public class StrFib {
    String x = "a", y = "b", z;
    int n;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'n': ");
        n = sc.nextInt();
        sc.close();
    }

    void series() {
        System.out.println("Series: ");
        System.out.print(x + ", " + y + ", ");
        for (int i = 2; i <= n; i++) {
            z = y + x;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }

    public static void main(String[] args) {
        StrFib a = new StrFib();
        a.accept();
        a.series();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * x | String | first entry point of fibonacci series as "a"
 * y | String | second entry point of fibonacci series as "b"
 * z | String | to store the next item in the series
 * n | int | index till whicht the series shall be printed
 * ***void accept()***
 * sc | Scanner | object to take user input
 * ***void main()***
 * a | StrFib | object to call the functions of the class
 * ***void series()***
 * i | int | counter variable to generate the series
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize a object *StrFib*.
 * 2. Call the functions accept() and series()
 * #### ***void accept()***
 * 1. Initialize the scanner object to take user input
 * 2. Enter value of '**n**'
 * #### ***void series()***
 * 1. Print 'x', 'y'
 * 2. Start **for** loop with i=2, i<=n and i=i+1
 * 3. z=y+x
 * 4. Print z
 * 5. x=y
 * 6. y=z
 * 7. End **for** loop 
 */