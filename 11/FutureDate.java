import java.util.*;

public class FutureDate {
    private int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    String date_convert(int n, int m, int y) {
        int max = 365, d = 0;
        int[] D_COUNT = DAY_COUNT.clone();
        if (y % 4 == 0) {
            max++;
            D_COUNT[1]++;
        }
        while (n > max) {
            n -= max;
            y++;
        }
        while (true) {
            int m_days = D_COUNT[m - 1];
            d = n % (m_days + 1);
            n -= m_days;
            if (n > 0) {
                m++;
                if (m == 13) {
                    m = 1;
                    y++;
                }
            } else
                break;
        }
        return String.format("%d/%d/%d", d, m, y);
    }

    boolean validate(int d, int m, int y) {
        if (d < 1 || m < 1 || y < 1)
            return false;
        if (m > 12)
            return false;
        if (m == 2 && y % 4 == 0 && d == 29) // leap yaer condition
            return true;
        else if (d > DAY_COUNT[m - 1])
            return false;
        return true;
    }

    public static void main(String[] args) {
        FutureDate a = new FutureDate();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date as dd/mm/yyyy : ");
        String date = sc.next().trim();
        int[] ind = { date.indexOf('/'), date.lastIndexOf('/') };
        int d = Integer.parseInt(date.substring(0, ind[0]));
        int m = Integer.parseInt(date.substring(ind[0] + 1, ind[1]));
        int y = Integer.parseInt(date.substring(ind[1] + 1));
        if (!a.validate(d, m, y)) {
            System.out.println("Invalid Date");
            System.exit(-1);
        }
        System.out.print("Enter number of days after: ");
        int after = sc.nextInt();
        System.out.printf("Entered Date: %d/%d/%d\n", d, m, y);
        System.out.printf("Future date: %s\n", a.date_convert(d + after, m, y));
        sc.close();
    }
}
