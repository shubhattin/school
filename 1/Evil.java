import java.util.Scanner;

class Evil {
    public static void main(String[] args) {
        Evil a = new Evil();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long bin = bin(n);
        System.out.println("Binary Equivalent: " + bin);
        int cn = 0;
        while (bin != 0) {
            if (bin % 10 == 1)
                cn++;
            bin /= 10;
        }
        if (cn % 2 == 0)
            System.out.println("Is a Evil Number");
        else
            System.out.println("Is not a Evil Number");
        sc.close();
    }

    long bin(long n) {
        long r = 0, c = 0;
        while (n != 0) {
            r += (long) (Math.pow(10, c++) * (n % 2));
            n /= 2;
        }
        return r;
    }
}
