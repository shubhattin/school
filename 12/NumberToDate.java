import java.util.*;

public class NumberToDate {
    int days, year, after;
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
        if (year < 1000 || year > 9999) {
            System.out.println("Year should 4 digit number");
            System.exit(0);
        }
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
        int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (y % 4 == 0) {
            max++;
            DAY_COUNT[1]++;
        }
        while (n > max) {
            n -= max;
            y++;
        }
        while (true) {
            int m_days = DAY_COUNT[m - 1];
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
        System.out.printf("Date After %d Days: %s\n", after, date_convert(days + after, year));
    }

    public static void main(String[] args) {
        NumberToDate a = new NumberToDate();
        a.input();
        a.showDate();
        a.showAfterDate();
    }
}
/*
 * Variable Description
 * Name | Type | Description
 * - | - | -
 * ***global***
 * days | int | Stores the day number
 * year | int | Stores the year
 * after | int | Stores the number of days after the given date
 * MONTH_NAME | String[] | Stores the name of each month
 * ***void input()***
 * sc | Scanner | Used to take input
 * ***private String postfix(int n)***
 * r | int | stores the last digit of n
 * ***private String date_convert(int n, int y)***
 * max | int | Stores the number of days in the given year
 * m | int | Stores the month number
 * d | int | Stores the day number
 * DAY_COUNT | int[] | Stores the number of days in each month
 * n | int | Stores the day number provided in the *argument*
 * y | int | Stores the year provided in the *argument*
 * m_days | int | Stores the number of days in the current month
 * ***void main()***
 * a | NumberToDate | Object of the class NumberToDate to invoke its methods
 */
/*
 * Algorithm
 * #### Algorithm for ***main()*** method
 * 1. Create an object of the class NumberToDate
 * 2. Invoke the method ***input()*** of the object
 * 3. Invoke the method ***showDate()*** of the object
 * 4. Invoke the method ***showAfterDate()*** of the object
 * #### Algorithm for ***input()*** method
 * 1. Create a Scanner object to take input
 * 2. Take the day number as input and store it in the variable ***days***
 * 3. Take the year as input and store it in the variable ***year***
 * 4. Take the number of days after the given date as input and store it in the
 * variable ***after***
 * 5. Close the Scanner object
 * #### Algorithm for ***postfix(int n)*** method
 * 1. Store the last digit of *n* in the variable *r*
 * 2. If *r* is 1 and *n* is not 11, return "st"
 * 3. If *r* is 2 and *n* is not 12, return "nd"
 * 4. If *r* is 3 and *n* is not 13, return "rd"
 * 5. Else return "th"
 * #### Algorithm for ***date_convert(int n, int y)*** method
 * 1. Store the number of days in the given year in the variable *max*
 * 2. Store 1 in the variable *m*
 * 3. Store 0 in the variable *d*
 * 4. Store the number of days in each month in the array *DAY_COUNT*
 * 5. If the year is a leap year, increment *max* by 1 and increment the value
 * of *DAY_COUNT[1]* by 1
 * 6. Start ***while** loop with *n* is greater than *max*
 * 7. Subtract *max* from *n*
 * 8. Increment *y* by 1
 * 9. End **while** loop
 * 10. Start **while** loop with *true*
 * 11. Store the number of days in the current month in the variable *m_days*
 * 12. Store the remainder of *n* divided by *m_days + 1* in the variable *d*
 * 13. Subtract *m_days* from *n*
 * 14. If *n* is greater than 0, increment *m* by 1
 * 15. Else break the loop
 * 16. End **while** loop
 * 17. Return the string in the format "dth month, year"
 * #### Algorithm for ***showDate()*** method
 * 1. Print the string "Date: " and the result of the method
 * ***date_convert(days, year)***
 * #### Algorithm for ***showAfterDate()*** method
 * 1. Print the string "Date After *after* Days: " and the result of the method
 * ***date_convert(days + after, year)***, the **after** is provided to get
 * number of days after a date.
 */