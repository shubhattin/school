import java.util.*;

class VowelShift {
    String wrd, newwrd;
    int vow_cn = 0, oth_cn = 0;

    VowelShift() {
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        wrd = sc.next().toUpperCase();
        sc.close();
    }

    void freq_vow_con() {
        for (int x = 0; x < wrd.length(); x++)
            if (is_vowel(wrd.charAt(x)))
                vow_cn++;
            else
                oth_cn++;
        System.out.println("Vowel count: " + vow_cn);
        System.out.println("Consonant count: " + oth_cn);
    }

    void arrange() {
        StringBuffer vw = new StringBuffer(""); // vowels
        StringBuffer oth = new StringBuffer(""); // others
        for (int x = 0; x < wrd.length(); x++) {
            char c = wrd.charAt(x);
            if (is_vowel(c))
                vw.append(c);
            else
                oth.append(c);
        }
        newwrd = vw.toString() + oth.toString();
    }

    void display() {
        System.out.println("Original Word: " + wrd);
        System.out.println("Rearranged Word: " + newwrd);
    }

    boolean is_vowel(char val) {
        String vw = "AEIOU";
        return vw.indexOf(val) != -1;
    }

    public static void main(String[] args) {
        VowelShift a = new VowelShift();
        a.readword();
        a.freq_vow_con();
        a.arrange();
        a.display();
    }
}

/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * wrd | String | to store the entered word
 * newwrd | String | to store changed(final) word
 * vow_cn | int | to store vowel freequency
 * oth_cn | int | to store other characters freequency
 * ***void readword()***
 * sc | Scanner | object to take user input
 * ***void freq_vow_con()***
 * x | int | counter variable to iterate over the string value
 * ***void arrange()***
 * vw | StringBuffer | to store extracted vowels
 * oth | StringBuffer | to store other extracted characters
 * ***void main()***
 * a | VowelShift | to call the objects its class
 */
/*
 * Algorithm
 * #### ***void readword()***
 * 1. Initialize a scanner object to take input.
 * 2. Enter a string(word) and convert it into upper case and store it in global
 * variable 'wrd'
 * #### ***void freq_vow_count()***
 * 1. Start **for** loop with *x=0, x<wrd.length(), x=x+1*.
 * 2. If the charcter at the curreny index 'x' is a vowel then incremrnt
 * *vow_cn* by 1 else increment *oth_cn* by 1.
 * 3. End **for** loop
 * 4. Print the values of 'vow_cn' and 'oth_cn'.
 * #### ***void arrange()***
 * 1. Initialize a StringBuffer named 'vow' to store the vowels
 * 2. Initialize a StringBuffer named 'oth' to store other characters
 * 3. Start **for** loop with x=0, x<wrd.length() and x=x+1
 * 4. If the character at current position is a vowel then append the charcter
 * to 'vow' else append it to 'oth'
 * 5. End **for** loop
 * 6. newwrd = vow.toString() + con.toString()
 * #### ***void display()***
 * 1. Print the Original word
 * 2. Print the Rearranged word
 * #### ***boolean is_vowel(char val)***
 * 1. Initialize *vw* as "AEIOU"
 * 2. return vw.indexOf(val)!=-1
 * #### ***void main()***
 * 1. Initialize the object of class VowelShift to call its functions
 * 2. Call the function readword() to input the word
 * 3. Call the function freq_vow_con() to count the freequency of vowels and to
 * display them
 * 4. Call the function arrange() and then display() to rearrange and then
 * display the results.
 */