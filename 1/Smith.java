import java.util.Scanner;

class Smith {

    public static void main(String[] args) {
        Smith a = new Smith();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (check(num))
            System.out.println("Is a Smith number");
        else
            System.out.println("Is not a Smith number");
        sc.close();
    }

    boolean check(int num) {
        int sm = dig_sum(num); // sum of digits of the number
        int pr_sm = 0; // sum of the digits of the prime number
        int d = 2;
        while (num != 1) {
            if (num % d == 0) {
                pr_sm += dig_sum(d);
                num /= d;
            } else
                d++;
        }
        return pr_sm == sm;
    }

    int dig_sum(int n) {
        int r = 0;
        while (n != 0) {
            r += (n % 10);
            n /= 10;
        }
        return r;
    }
}
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize the Object from the class Smith.
 * 2. Call the function *input()*.
 * #### ***int dig_sum(int n)***
 * 1. Initialize integer 'r' as 0.
 * 2. Start **while** loop whith condtion **n!=0**.
 * 3. r = r + (n % 10)
 * 4. Divide n by 10 and store it in 'n'.
 * 5. End **while** loop.
 * 6. return r
 * #### ***boolean check(int num)***
 * 1. Initialize a integer named 'sm' and store sum of digits of num.
 * 2. Inintialize a integer named 'pr_sm' as 0. This will be used to store sum
 * of digit of prime factors of the number.
 * 3. Initialize int d as 2. This is the first factor to be evaluated.
 * 4. Start **while** loop with condition **num!=1**.
 * 5. Start **if** with condition **num%d==0**.
 * 6. pr_sm = pr_sm + (sum of digit of 'd')
 * 7. End **if** and not true then d=d+1
 * 8. End **while**
 * 9. Return *true* if pr_sm==sm else return *false*.
 * #### ***void input()***
 * 1. Intialize the Scanner Object to take input.
 * 2. Input a integer value and store it in integer '**n**'.
 * 3. Pass the integer **num** into *check** as argument and depending on the
 * return value print if it is a Smith number or not.
 */
/*
 * Variable Description
 * | Name | Type | Uses |
 * | - | - | - |
 * | ***void main()*** |
 * | a | Smith | Object to call the methods |
 * | ***void input()*** |
 * | sc | Scanner | Object to take user input |
 * | num | int | to store entered number |
 * | ***boolean check()***
 * | num | int | **argument** :- number to check if smith |
 * | sm | int | to store sum of digits of 'num' |
 * | pr_sm | int | to store sum of digits of prime factors of 'num' |
 * | d | int | this is the starting index of prime numbers to be evaluated |
 * | ***int dig_sum()*** |
 * | n | int | **argument** :-  number whose sum of digits is to be found |
 * | r | int | to store sum of digits |
 * | dig | int | to store the extracted digit |
 */