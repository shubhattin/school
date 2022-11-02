import java.util.Scanner;

class RevPrime {

    public static void main(String[] args) {
        RevPrime a = new RevPrime();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (check(n) && check(rev(n)))
            System.out.println("Is a Reversible prime");
        else
            System.out.println("Is not a Reversible prime");
        sc.close();
    }

    boolean check(int n) {
        String num = String.valueOf(n);
        int ln = num.length();
        char f = num.charAt(0), l = num.charAt(ln - 1);
        if (!(f == '3' || f == '9' || l == '3' || l == '9'))
            return false;
        return is_prime(n);
    }

    boolean is_prime(int n) {
        for (int x = 2; x < n; x++)
            if (n % x == 0)
                return false;
        return true;
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