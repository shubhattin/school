import java.util.*;

public class TimeToWord {
    int h, m;
    String[] N = {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "FourTeen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
            "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six",
            "Twenty Seven", "Twenty Eight", "Twenty Nine"
    };

    TimeToWord(int hr, int min) {
        h = hr;
        m = min;
    }

    String getName() {
        if (m == 0)
            return String.format("%s o'clock", N[h - 1]);
        else if (m == 15)
            return String.format("Quarter past %s", N[h - 1]);
        else if (m == 30)
            return String.format("Half past %s", N[h - 1]);
        else if (m == 45)
            return String.format("Quarter to %s", N[h]);
        else if (m < 30)
            return String.format("%s minutes past %s", N[m - 1], N[h - 1]);
        else
            return String.format("%s minutes to %s", N[60 - m - 1], N[h]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time as hr,min :");
        String time = sc.next().trim();
        int ind = time.indexOf(',');
        int hr = Integer.parseInt(time.substring(0, ind));
        int min = Integer.parseInt(time.substring(ind + 1));
        System.out.printf("%d:%d  %s", hr, min, (new TimeToWord(hr, min)).getName());
        sc.close();
    }
}
/*
 * Variable Description
 * Name | Type | Use
 * - | - | -
 * ***global***
 * h | int | to store hours
 * m | int | to store minutes
 * N | String[] | Name of numbers from 1 to 29 in a array
 * ***void main()***
 * sc | Scanner | object used to take user input
 * time | String | to store entered time
 * ind | int | stores index of ',' in 'time'
 * hr | int | parsed integer of substring of *time* from 0 to ind (hours)
 * min | int | parsed integer of substring of *time* from ind+1 to end (minutes)
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the Scanner object to take input.
 * 2. Take a String input of time in the format of "hour,minute" into a String
 * varaible *time*
 * 3. Declare ind=time.indexOf(","), to store the index of ',' in the sytring.
 * 4. hr(hours) is parsed integer of substring of time from 0 to *ind*
 * 5. min(minutes) is parsed integer of substring of time from *ind* to end
 * 6. Create a object of class TimeToWord by passing hr, min as constructor
 * parameters and then call the method getName() to print the time in words.
 * #### ***String getName()***
 * 1. if minutes is 0 then return time in format "<hour> o'clock"
 * 2. else if minutes in 15 then return time in format "Quarter past <hour>"
 * 3. else if minutes in 30 then return time in format "Half past <hour>"
 * 4. else if minutes is 45 then return time in format "Quarter to <hour+1>"
 * 5. else if minutes are smaller than 30 then return time in format
 * "<minutes> minutes past <hour>"
 * 6. else return time in format "<60-minutes> minutes to <hour+1>"
 */