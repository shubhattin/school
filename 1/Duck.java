import java.util.*;

public class Duck {
    boolean isduck(int num) {
        for (; num != 0; num /= 10)
            if (num % 10 == 0) // if 0 is there as a digit then it is a duck number
                return true;
        return false;
    }

    public static void main(String[] args) {
        Duck a = new Duck();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.printf("Is%s a Duck Number", (a.isduck(num) ? "" : " not"));
        sc.close();
    }
}
/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize a object 'a' of class Duck to call its methods.
 * 2. Intialize the Scanner object to take input.
 * 3. Take the number input into integer 'num'
 * 4. Pass the variable 'num' into *isduck()* as argument and based on return
 * value print display if it is a duck number or not.
 * #### ***boolean isduck(int num)***
 * 1. Start a **for** for with condition **num!=0** and evaluate expression as
 * **num/=10**.
 * 2. if num is a factor of 10,(i.e. contains zero) then return true
 * 3. End **for** loop.
 * 4. return *false* as it not a duck number
 */
/*
 * Variable Description
 * | Name | Type | Uses |
 * | - | - | - |
 * | ***void main()*** |
 * | a | Duck | object to call method |
 * | sc | Scanner | object to take user input |
 * | num | int | to store enetered number |
 */