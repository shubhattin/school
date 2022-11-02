import java.util.*;

public class Bank {
    long amt;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amt = sc.nextLong();
        if (String.valueOf(amt).length() > 5 || amt < 0) {
            System.out.println("Invalid Input");
            System.exit(-1);
        }
        sc.close();
    }

    void name() {
        StringBuffer nm = new StringBuffer();
        String[] names = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        long tmp = amt;
        while (tmp != 0) {
            long dig = tmp % 10;
            nm.insert(0, names[(int) dig] + " ");
            tmp /= 10;
        }
        System.out.println(nm.toString());
    }

    void denomination() {
        long[] order = { 2000, 500, 200, 100, 20, 10, 5, 2, 1 };
        for (int x = 0; x < order.length; x++) {
            long v = amt / order[x];
            if (v != 0) {
                long pr = order[x] * v;
                System.out.println(order[x] + " * " + v + " = " + pr);
                amt -= pr;
            }
        }
    }

    public static void main(String[] args) {
        Bank a = new Bank();
        a.input();
        a.name();
        a.denomination();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * amt | long | to store netered amount
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***void name()***
 * nm | StringBuffer | to store the name of amount
 * names | String[] | string array storing names of digits from 0 to 9
 * tmp | int | to temporarily store the amount value
 * ***void denomination()***
 * order | long[] | stores the order of decreasing denominatory notes
 * v | long | number of notes of a denomination
 * ***void main()***
 * a | Bank | object to call its method
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. Create the object of the current class.
 * 2. From the objects call the functions input(), name() and denomination()
 * #### ***void input()***
 * 1. Initialize the scanner object to take input
 * 2. Enter amount in long integer 'amt'
 * 3. if the length of amt is greater than 5 or less than 0 then print
 * "Invalid Input" and then exit the program
 * #### ***void name()***
 * 1. Initialize a StringBuffer to store the name of amount in words.
 * 2. Initialize a String array containing name of digits from 0 to 9
 * 3. Store tmp=amt, this is to temporarily store and process 'amt' variable
 * without loosing its value
 * 4. Start **while** loop with condition *tmp!=0*
 * 5. Store dig = tmp%10, to extract the last digit;
 * 6. nm.insert(0, names[(int) dig] + " ")
 * 7. tmp = tmp / 10
 * 8. End **while** loop
 * 9. print the value of nm, this is the name of amount in words
 * #### ***void denomination()***
 * 1. Initialize a *Long* array 'order' containing the denominations which you
 * want your amount to split into in descending order.
 * 2. Start **for** loop with x=0, x<order.length and x=x+1
 * 3. Store v=amt/order[x]
 * 4. Start **if** with condition *v!=0*
 * 5. Store pr=order[x]*v
 * 6. Print order[x] + " * " + v + " = " + pr, (this is denomination breakup)
 * 7. amt=amt-pr
 * 8. End **if**
 * 9. End **for**
 */