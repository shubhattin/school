import java.util.*;

public class DateVerify {
    final int[] MIN_DATE = { 1, 1, 1800 };
    final int[] MAX_DATE = { 31, 12, 9999 };
    final int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public int[] d = new int[3];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day as dd: ");
        d[0] = sc.nextInt();
        System.out.print("Enter month as mm: ");
        d[1] = sc.nextInt();
        System.out.print("Enter year as yyyy: ");
        d[2] = sc.nextInt();
        sc.close();
    }

    boolean verify() {
        if (!(d[2] >= MIN_DATE[2] && d[2] <= MAX_DATE[2]))
            return false;
        if (d[0] < 1 || d[1] < 1 || d[1] > 12)
            return false;
        boolean isLeap = d[2] % 4 == 0;
        if (d[1] == 2 && isLeap && d[0] == 29)
            return true;
        else if (d[0] > DAY_COUNT[d[1] - 1])
            return false;
        // checking for strict range
        if (d[2] == MIN_DATE[2] && d[1] == MIN_DATE[1] && d[0] < MIN_DATE[0])
            return false;
        else if (d[2] == MAX_DATE[2] && d[1] == MAX_DATE[1] && d[0] > MAX_DATE[0])
            return false;
        return true;
    }

    public static void main(String[] args) {
        DateVerify a = new DateVerify();
        a.input();
        System.out.printf("The given date %d/%d/%d is %s Date\n", a.d[0], a.d[1], a.d[2],
                (a.verify() ? "a Valid" : "an Invalid"));
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * d | int[] | integer array of size 3 to store date
 * MIN_DATE | int[] | integer array storing minimum possible date
 * MAX_DATE | int[] | integer array storing maximum possible date
 * DAY_COUNT | int[] | this stores the day count for 12 months of the year
 * ***void main()***
 * a| DateVerify | object to call method
 * ***void input()***
 * sc | Scanner | to take user Input
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize Object of the class DateVerify to call its method.
 * 2. Take input of the date by calling the *input()* method.
 * 3. Check if the date entered is valid by calling *verify()* and then print
 * the message accordingly.
 * #### ***void input()***
 * 1. Initialize Scanner object to take input.
 * 2. Store thr entered *date* at index 0 of array **d**.
 * 3. Store thr entered *month* at index 1 of array **d**.
 * 4. Store thr entered *year* at index 2 of array **d**.
 * #### ***boolean verify()***
 * 1. If the entered year is smaller than the MIN_DATE[2] or entered year is
 * greater than MAX_DATE[2] then return **false**.
 * 2. if days are smaller than 1 or month is smaller than 1 or month is greater
 * than 1 then return **false**
 * 3. Initialize a boolean value *isLeap* which is the status if the current is
 * a leap year.
 * 4. If month is February and it a leap year and days are 29 then retuen
 * **true**
 * 5. If days is greater than *DAY_COUNT[month-1]* then return **false**
 * 6. If *year* == MIN_DATE[2] and *month* == MIN_DATE[1] && *days* <
 * MIN_DATE[0] return **false**
 * 7. If *year* == MAX_DATE[2] and *month* == MAX_DATE[1] and *days* >
 * MAX_DATE[0] return **false**
 */