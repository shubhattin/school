import java.util.*;

public class DateDiff {
    int d, m, y;

    DateDiff(String date) {
        int[] ind = { date.indexOf('/'), date.lastIndexOf('/') };
        d = Integer.parseInt(date.substring(0, ind[0]));
        m = Integer.parseInt(date.substring(ind[0] + 1, ind[1]));
        y = Integer.parseInt(date.substring(ind[1] + 1));
    }

    int getDaysofMonth() {
        int res = 0;
        int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (y % 4 == 0)
            DAY_COUNT[1]++;
        for (int x = 1; x < m; x++)
            res += DAY_COUNT[x - 1];
        return res;
    }

    int subtract(DateDiff b) {
        int d = b.getDaysofMonth() + b.d - (this.getDaysofMonth() + this.d);
        if (b.y - this.y != 0) {
            int bg = Math.max(b.y, this.y);
            int sm = Math.min(b.y, this.y);
            for (int x = sm; x < bg; x++)
                if (x % 4 == 0)
                    d += 366;
                else
                    d += 365;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date 1: ");
        DateDiff d1 = new DateDiff(sc.next());
        System.out.print("Date 2: ");
        DateDiff d2 = new DateDiff(sc.next());
        System.out.printf("Difference: %d days", d1.subtract(d2));
        sc.close();
    }
}

/*
 * Variable Description
 * Name | Type | Use
 * - | - | -
 * ***global***
 * d | int | to store date
 * m | int | to store month
 * y | int | to store year
 * ***int getDaysofMonth()***
 * res | int | Resultant value which will be returned later on in the function
 * DAY_COUNT | in[] | Integer array storing the number of days of the 12 months
 * ***int subtract()***
 * b | DateDiff | the object of the date from which the current date has to be
 * subtracted
 * d | int | stores the difference in number of days between the dates
 * bg | int | store the year of gretater numerical value
 * sm | int | store the year of smaller numerical value
 * ***void main***
 * sc | Scanner | to take user input
 * d1 | DateDiff | Objecr to store first date
 * d2 | DateDiff | Objecr to store second date
 */
/*
 * Algorithm
 * #### ***public DateDiff(String date)***
 * 2. Initialize int[] ind = { date.indexOf('/'), date.lastIndexOf('/') }
 * 3. Store d as parsed int of substring of date from 0 to ind[0]
 * 4. Store m as parsed int of substring of date from ind[0]+1 to ind[1]
 * 5. Store y as parsed int of substring of date from ind[1] to end
 * #### ***int getDaysofMonth()***
 * 1. Intialize r=0
 * 2. Initialize DAY_COUNT and store the number of days of each month as an
 * inteer array.
 * 3. if a leap year then DAY_COUNT[1]=DAY_COUNT[1]+1
 * 4. Start **for** loop with *x = 1* and condition *x < m* and x=x+1
 * 5. res = res + DAY_COUNT[x - 1]
 * 6. End **for** loop
 * 7. return res
 * #### ***int subtract(DateDiff b)***
 * 1. Intialize d = b.getDaysofMonth() + b.d - (getDaysofMonth() + d), this
 * stores the differnce in dates and months
 * 2. Start **if** with condtion *b.y - y != 0*
 * 3. Stores the maximum between b.y and y in *int bg*
 * 4. Stores the minimum between b.y and y in *int sm*
 * 5. Start **for** loop with x=sm and condition x<bg and x=x+1
 * 6. if it's a laep year the d=d+366 else d=d+365
 * 7. End **for** loop
 * 8. End **if**
 * 9. return d
 * #### ***void main()***
 * 1. Intialize Scanner object to take input.
 * 2. Intialize object named d1 of class DateDiff to store first entered date.
 * 3. Take input pass it to d1.input()
 * 4. Intialize object named d2 of class DateDiff to store second entered date.
 * 5. Take input pass it to d2.input()
 * 6. Calculate the day differnece using 'd1.subtract(d2)' method and print thr result
 */