import java.util.*;

public class Exchange {
    String sent, rev;
    int size;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        sent = sc.nextLine();
        size = sent.length();
        sc.close();
    }

    void exfirstlast() {
        StringTokenizer st = new StringTokenizer(sent, " .");
        StringBuffer str = new StringBuffer();
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            str.append(exchange(s) + " ");
        }
        rev = str.toString();
    }

    void display() {
        System.out.println("Sentence: " + sent);
        System.out.println("Changed Sentence: " + rev);
    }

    private String exchange(String s) {
        StringBuffer a = new StringBuffer(s);
        a.setCharAt(0, s.charAt(s.length() - 1));
        a.setCharAt(s.length() - 1, s.charAt(0));
        return a.toString();
    }

    public static void main(String[] args) {
        Exchange a = new Exchange();
        a.input();
        a.exfirstlast();
        a.display();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * sent | String | to store the entered string
 * rev | String | to store the reversed(word order) string required
 * size | int | the size of the word entered
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***void exfirstlast()***
 * st | StringTokenizer | object to extract tokens(words) from the sentence
 * str | StringBuffer | to store the new resultant string
 * ***String exchange()***
 * a | StringBuffer | to make and store the resultant string
 * ***void main()***
 * a | Exchange | object to call its functions
 */
/*
 * Algorithm
 * #### ***void main()***
 * 1. create a object of class Exchange
 * 2. Call the functions input(), exfirstlast() and display
 * #### ***void input()***
 * 1. Initialize Scanner object to take user input
 * 2. Enter the sentence in 'sent'
 * 3. Store length of 'sent' in 'size'
 * #### ***String exchange()***
 * 1. Initialize a StringBuffer 'a'
 * 2. a.setCharAt(0, s.charAt(s.length() - 1))
 * 3. a.setCharAt(s.length() - 1, s.charAt(0))
 * 4. return a.toString()
 * #### ***void exfirstlast()***
 * 1. Initialize a StringTokenizer object to get the words as 'st'.
 * 2. Initialize 'str' as a StringBuffer object to store the output
 * 3. Start **while** loop with condition st.hasMoreTokens().
 * 4. Store s=st.nextToken()
 * 5. str.append(exchange(s)+" ")
 * 6. End **for** loop
 * 7. rev=str.toString()
 * #### ***void display()***
 * 1. Print the original sentence
 * 2. Print the changed sentence
 */