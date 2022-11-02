import java.util.*;

class Fasc {
    long num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextLong();
        sc.close();
    }

    boolean is_fasc() {
        if (num < 100)
            return false;
        long n2 = num * 2, n3 = num * 3;
        int[] cnt = new int[10];
        String join = "" + num + n2 + n3;
        num = Long.parseLong(join);
        while (num != 0) {
            int dig = (int) (num % 10);
            cnt[dig]++;
            num /= 10;
        }
        for (int x = 1; x < 10; x++) // we have to ignore 0s
            if (cnt[x] != 1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Fasc a = new Fasc();
        a.input();
        System.out.println("Is " + (a.is_fasc() ? "" : "not ") + "a Fascinating number");
    }
}

/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize a *object* of class **Fasc** named as '**a**', to call the
 * methods.
 * 2. invoke the **input** method using the 'a' object.
 * 3. Use the '**is_fasc**' method to check it is a fascinating number and
 * accordingly display the appropriate messages.
 * #### ***boolean is_fasc()***
 * 1. The number has to be atleast of 3 digits, so if the number is smaller than
 * 100 return false.
 * 2. Initialize variables n2, n3 storing double and triple of the entered
 * number 'num'.
 * 3. Initialize a integer array '**cnt**' of size of 10 in order to store the
 * count of each digit.
 * 4. Concat num, n2 and n3 as string and parser it back to a integer and store
 * it in '**num**'.
 * 5. Start a **while** loop with condition **num!=0**.
 * 6. Extract the last digit of 'num' and store it in an integer '**dig**'.
 * 7. increment value of ***cnt[dig]*** by 1 as this stores the count of digit.
 * 8. Divide **num** by 10 and store it in **num**.
 * 9. **End While Loop**
 * 10. Start a for loop with value of **x as 1**, condition as **x < 10** and
 * **x=x+1** (*Starting x from as we don't want to check freequency of zero*).
 * 11. if ***cnt[x]*** is not 1 then **return false**, as this means that the
 * digit
 * is not unique and thus violates condition to be fascinating.
 * 12. **End for loop**
 * 13. Return **true** as it is a fascinating number.
 * #### ***void input()***
 * 1. Initialize the Scanner object with argument System.in to take input.
 * 2. Enter the number into *global variables* '**num**'.
 */
/*
 * Variable Description
 * | Name | Type | Uses |
 * | - | - | - |
 * | ***global*** |
 * | num | long | to store entered number |
 * | ***void main()*** |
 * | a | Fasc | Object to call the function |
 * | ***boolean isfasc()*** |
 * | n2 | long | To store double of **num** |
 * | n3 | long | To store triple of **num** |
 * | cnt | int[] | Integer array of size 10 to store digit freequency |
 * | join | String | To store concated num, n2 and n3 |
 * | dig | int | To store extracted digit |
 * | ***void input()*** |
 * | sc | Scanner | Object to take User Input |
 */