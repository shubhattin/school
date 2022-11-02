import java.util.Scanner;

class Kaprekar {
    public static void main(String[] args) {
        Kaprekar a = new Kaprekar();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (is_kapr(n))
            System.out.println("Is a Kaprekar number");
        else
            System.out.println("Is not a Kaprekar number");
        sc.close();
    }

    boolean is_kapr(int n) {
        String nm = String.valueOf(n * n); // number converted to a string
        int ln = nm.length(), first = 0, second = 0;
        first = Integer.parseInt(nm.substring(0, ln / 2));
        second = Integer.parseInt(nm.substring(ln / 2));
        return first + second == n;
    }
}

/*
 * Algorithm
 * #### ***void main()***
 * 1. Initialize a object of class *Kaprekar* to invoke its methods.
 * 2. Call the function *input()* using the object.
 * #### ***boolean iskapr(int n)***
 * 1. Initailize a String namesd **nm** which stpores string value of squre of
 * n.
 * 2. Store length of 'nm' in **ln** as a int.
 * 3. Intialize a variable '**first**' and store parsed integer of substring of
 * 'nm' from 0 to 'ln/2'.
 * 4. Intialize a variable '**second**' and store parsed integer of substring of
 * 'nm' from 'ln/3' to last.
 * 5. if the sum of *first* and *second* is equal to n then return true else
 * return false.
 * #### ***void input()***
 * 1. Intialize the Scanner Object to take input.
 * 2. Input a integer value and store it in integer '**n**'.
 * 3. Pass the integer **n** into *is_fasc** as argument and depending on the
 * return value print if it is a kaprekar number or not.
 */
/*
 * Variable Description
 * | Name | Type | Uses |
 * | - | - | - |
 * | ***void main()*** |
 * | a | Kaprekar | Object to call the methods |
 * | ***boolean iskaprekar()*** |
 * | n | int | **argument** :- variable to test for kaprekar number |
 * | nm | String | to store string value of sqaure of 'n'
 * | ln | int | to store length of string |
 * | first | int | to store first part of the substring |
 * | second | int | to store second part of the substring |
 * | ***void input()*** |
 * | sc | Scanner | To Take User Input |
 * | n | int | to store entered number |
 */