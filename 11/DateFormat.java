import java.util.*;

public class DateFormat {
    int[] d = new int[3];
    private final int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] MONTH_NAME = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date as 'ddmmyyyy': ");
        String date = sc.next();
        if (date.length() != 8) {
            System.out.println("Invalid Input Format");
            System.exit(-1);
        }
        d[0] = Integer.parseInt(date.substring(0, 2));
        d[1] = Integer.parseInt(date.substring(2, 4));
        d[2] = Integer.parseInt(date.substring(4, 8));
        sc.close();
    }

    boolean validate() {
        if (d[0] < 1 || d[2] < 1 || d[1] < 1 || d[1] > 12)
            return false;
        if (d[1] == 2 && d[2] % 4 == 0 && d[0] == 29) // leap yaer condition
            return true;
        else if (d[0] > DAY_COUNT[d[1] - 1])
            return false;
        return true;
    }

    void show() {
        if (!validate()) {
            System.out.println("Invalid Date");
            return;
        }
        System.out.printf("%d/%d/%d\n", d[0], d[1], d[2]);
        System.out.printf("%d %s, %d\n", d[0], MONTH_NAME[d[1] - 1], d[2]);
    }

    public static void main(String[] args) {
        DateFormat a = new DateFormat();
        a.input();
        a.show();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * d | int[] | Integer array of size 3 to store date
 * DAY_COUNT | int[] | Stores the number of days of 12 months of the year
 * MONTH_NAME | String[] | Name of the 12 months of the year
 * ***void main()***
 * a | DateFormat | Object to call its methods
 * ***void input()***
 * sc | Scanner | to take user input
 * date | String | to store enetered date
 */
/*
 * Algorithm
 * #### ***boolean validate()***
 * 1. if day, month or year is smaller than 1 or month is greater than 12 return
 * *false*
 * 2. If month is february and is a leap yaer and days are 29 return *true*
 * 3. if daya > DAY_COUNT[d[1] - 1] then return *false*
 * 4. return *true*
 * #### ***void show()***
 * 1. if 'validate()' evaluates false then print "Invalid Date" and **eeturn**
 * 2. Print the date in the required format.
 * #### ***void input()***
 * 1. Initialize Scanner object to take input.
 * 2. Take date input into the string value 'date'.
 * 3. If length of date is not equal to 8 then print "Invalid Input Format" and
 * **return**.
 * 4. Store d[0] as parsed Integer of date.substring(0, 2)
 * 5. Store d[1] as parsed Integer of date.substring(2, 4)
 * 6. Store d[2] as parsed Integer of date.substring(4, 8)
 * #### ***void main()***
 * 1. Initialize the object of class DateFormat to invoke methods.
 * 2. Invoke the functions *input* and *show*
 */