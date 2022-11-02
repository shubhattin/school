import java.util.Scanner;

class Unique {

    public static void main(String[] args) {
        Unique a = new Unique();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range m, n: ");
        int m = sc.nextInt(), n = sc.nextInt();
        if (m > n) {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        int cn = 0;
        System.out.print("Unique numbers are:- ");
        for (int x = m; x <= n; x++)
            if (is_unique(x)) {
                System.out.print(x + ", ");
                cn++;
            }
        System.out.println("\nFreequency: " + cn);
        sc.close();
    }

    boolean is_unique(int n) {
        int cn[] = new int[10];// storing freequency of digits of a number
        while (n != 0) {
            if (++cn[n % 10] == 2)
                return false;
            n /= 10;
        }
        return true;
    }
}