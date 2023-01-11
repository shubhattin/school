import java.util.*;

public class NumberToDate {
    int days, year, after;
    private int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private String[] MONTH_NAME = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day Number: ");
        days = sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();
        System.out.print("Date After(in days): ");
        after = sc.nextInt();
        if (after < 1 || after > 100) {
            System.out.println("Date After should be between 1 and 100");
            System.exit(0);
        }
        sc.close();
    }

    private String postfix(int n) {
        int r = n % 10;
        if (r == 1 && n != 11)
            return "st";
        else if (r == 2 && n != 12)
            return "nd";
        else if (r == 3 && n != 13)
            return "rd";
        else
            return "th";
    }

    private String date_convert(int n, int y) {
        int max = 365, m = 1, d = 0;
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
            } else
                break;
        }
        return String.format("%d%s %s, %d", d, postfix(d), MONTH_NAME[m - 1], y);
    }

    void showDate() {
        System.out.println("Date: " + date_convert(days, year));
    }

    void showAfterDate() {
        System.out.printf("Date After %d Days: %s", after, date_convert(days + after, year));
    }

    public static void main(String[] args) {
        NumberToDate a = new NumberToDate();
        a.input();
        a.showDate();
        a.showAfterDate();
    }
}
