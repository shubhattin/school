import java.util.Scanner;

public class MOBIUS {

    public static void main(String[] args) {
        MOBIUS a = new MOBIUS();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to exit loop");
        int num = -1;
        while (true) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num == 0)
                break;
            System.out.println("Output of MOBIUS: " + cal(num));
            System.out.println("-------------------------");
        }
        sc.close();
    }

    int cal(int num) {
        if (num == 1)
            return 1;
        int d = 2, cn = 0, t_cn = 0;
        while (num != 1) {
            // in this loop the value of d is only prime factors
            if (num % d == 0) {
                num /= d;
                if (++cn == 2)
                    return 0; // returnig 0 if a factor comes more than once
                t_cn++; // total count of all factors
            } else {
                d++; // incrementing prime factor
                cn = 0; // resetting the count if factor changes
            }
        }
        return (int) (Math.pow(-1, t_cn));
    }
}
