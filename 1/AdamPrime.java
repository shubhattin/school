import java.util.Scanner;

class AdamPrime {

    public static void main(String[] args) {
        AdamPrime a = new AdamPrime();
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
        System.out.print("Adam-Prime Integers are:- ");
        for (int x = m; x <= n; x++)
            if (is_prime(x) && is_adam(x)) {
                System.out.print(x + ", ");
                cn++;
            }
        System.out.println("\nFreequency: " + cn);
        sc.close();
    }

    boolean is_prime(int n) {
        for (int x = 2; x < n; x++)
            if (n % x == 0)
                return false;
        return true;
    }

    boolean is_adam(int n) {
        int n2 = n * n, n_rev = rev(n);
        int n_rev2 = n_rev * n_rev;
        return n2 == rev(n_rev2);
    }

    int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        return r;
    }
}