import java.util.*;

public class HCF {
    int fnHCF(int a, int b) {
        if (b % a == 0)
            return a;
        return fnHCF(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        HCF obj = new HCF();
        System.out.println("HCF: " + obj.fnHCF(a, b));
        sc.close();
    }
}
