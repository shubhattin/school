import java.util.*;

public class MatPattern {
    char[] ch = new char[3];
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        n = sc.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Size out of range");
            System.exit(-1);
        }
        for (int x = 0; x < 3; x++) {
            System.out.print("Character " + (x + 1) + " :");
            ch[x] = sc.next().charAt(0);
        }
        sc.close();
    }

    void pattern() {
        int size = n;
        n--;
        boolean[] con = new boolean[3]; // condition to print
        System.out.println();
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                int r_x = n - x; // reverse index of x
                con[0] = (x > y && r_x > y) || (x < y && r_x < y);
                con[1] = (x < y && r_x > y) || (x > y && r_x < y);
                con[2] = y == x || y == r_x;
                for (int i = 0; i < 3; i++)
                    if (con[i])
                        System.out.print(ch[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatPattern a = new MatPattern();
        a.input();
        a.pattern();
    }
}

/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * ch | char[] | the 3 characters on which the pattern will be based
 * n | int | the dimension of the 2D Array(sqaure) to be printed
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***void pattern()***
 * size | int | to store the size of the sqaure matrix
 * con | int[] | condition if the 3 characters are to be printed
 * x, y | int | counter variables to iterate over the matrix
 * i | int | counter variable to print the 3 charcaters
 * ***void main()***
 * a | MatPattern | object to call its methods
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize object of *MatPattern* class to call its function.
 * 2. Call the functions *input()* and *pattern()*
 * #### ***void input()***
 * 1. Enter of value of 'n' and store it.
 * 2. If value of n is not in range of *1 to 10* then print "SIze out of Range"
 * and exit
 * 3. Enter the three characters from which the pattern is to be printed
 * #### ***void pattern()***
 * 1. Store *size=n*
 * 2. Initialize an array of size 3 named 'con' to store constion to print characters
 * 3. Print a new line
 * 4. Start **for** loop as y=0, y<size and y=y+1
 * 5. Start **for** loop as x=0, x<size and x=x+1
 * 6. Initialize *r_x*=n-x, this is the index from the right side
 * 7. con[0] = (x > y and r_x > y) or (x < y and r_x < y)
 * 8. con[1] = (x < y and r_x > y) or (x > y and r_x < y)
 * 9. con[2] = y == x or y == r_x
 * 10. Start **for** loop as i=0, i<3 and i=i+1
 * 11. if con[i] is true then print ch[i]+" "
 * 12. End **for** loop
 * 13. End **for** loop
 * 14. Print a new line
 * 15. End **for** loop
 */