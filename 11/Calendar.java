import java.util.*;

class Calendar {
    String mnName, startDay;
    int y;
    int[] DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String[] MONTH_NAME = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };
    String[] DAY_NAME = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    int[][] Cal = new int[5][7];

    Calendar(int year, String month, String day) {
        y = year;
        mnName = month.toLowerCase();
        startDay = day.toLowerCase();
    }

    private int indexOf(String[] S, String v) {
        for (int x = 0; x < S.length; x++)
            if (v.equalsIgnoreCase(S[x]))
                return x;
        return -1;
    }

    void makeCalendar() {
        int d = 0, start = 0;
        int mnIndex = indexOf(MONTH_NAME, mnName);
        if (y % 4 == 0 && mnIndex == 1)
            d = 29;
        else
            d = DAY_COUNT[mnIndex];
        start = indexOf(DAY_NAME, startDay);
        mnName = MONTH_NAME[mnIndex];
        for (int i = 0; i < d; i++) {
            int rw = (i + start) / 7, cl = (i + start) % 7;
            Cal[rw % 5][cl] = i + 1;
        }
    }

    void display() {
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t " + mnName + " " + y);
        System.out.println("\t----------------------------------------------------");
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------");
        for (int i = 0; i < Cal.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < Cal[0].length; j++) {
                int vl = Cal[i][j];
                System.out.printf("%s\t", vl != 0 ? vl : " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int y = sc.nextInt();
        System.out.print("Enter month name : ");
        String mName = sc.next();
        System.out.printf("Enter the week day name of 1st day of %s : ", mName);
        String wName = sc.next();
        Calendar a = new Calendar(y, mName, wName);
        a.makeCalendar();
        a.display();
        sc.close();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * mnName | String | to store the entered month name
 * startDay | String | name of staring weekday
 * y | int | to store entered year
 * DAY_COUNT | int[] | this stores the number of days in month
 * MONTH_NAME | Names of the 12 months
 * DAY_NAME | Names of weekdays
 * Cal | int[][] | This a 5 by 7 Matrix to store thr calendar
 * ***int indexOf()***
 * S | String[] | This is the string array which is to be searched
 * v | String | Value to search for in the array
 * x | int | this is the index of array where element may be found
 * ***void makeCalendar()***
 * d | int | to store the number of days of the current month
 * start | int | to store the starting day of the week
 * mnIndex | int | this stores the month index
 * mnName | int | this stores the month name
 * ***void display()***
 * i, j | int | counter variables to iterate over the calendar matrix
 * ***void main()***
 * sc | Scanner | object to take user input
 * y | int | to store entered year
 * mName | String | to store entered month name
 * wName | String | to store starting day of the week
 * a | Calendar | object to call methods
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the scanner object to take user input
 * 2. Enter the current year into a integer *y*
 * 3. Enter the month current month name in a variable mName of String typ
 * 4. Enter the starting day of the week and store it in wName of String type
 * 5. make a object of class Calendar and pass values *y, nName, wName* as
 * Constructor parameters.
 * 6. Call the methods *makeCalendar()* and *display()*.
 * #### ***int indexOf(String[] S, String v)***
 * 1. Start *for* loop with *x=0* and condition *x<S.length* and x=x+1
 * 2. if the value at current index(x) is equal to v then return x
 * 3. End **for** loop.
 * 4. return -1, as no matching element is found.
 * #### ***void makeCalendar()***
 * 1. Initialize d=0 and start=0
 * 2. Calculate mnIndex as indexOf(MONTH_NAME, mnName)
 * 3. If it is leap year and month is february then d=19 else it
 * d=DAY_COUNT[mnIndex].
 * 4. Calculate start as indexOf(DAY_NAME, startDay)
 * 5. Calculate mnName as MONTH_NAME[mnIndex]
 * 6. Start **for** loop with *i=0* and condition as *i<d* and i=i+1
 * 7. Calculate rw = (i+start)/7 (This is the row of the matrix for current day)
 * 8. Calculate c; = (i+start)%7 (This is the column of the matrix for current
 * day)
 * 9. Store Cal[rw % 5][cl] = i + 1
 * 10. End **for** loop.
 * #### ***void display()***
 * 1. Print the relevant markup, i.e. month name, yaer, days of week.
 * 2. Intertate over the Double Dimensional Array *Cal* and print it.(This is
 * the actual Calendar printed)
 */