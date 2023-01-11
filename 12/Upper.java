import java.util.*;

public class Upper {
    String sent = "";
    int wordIndex = -1;
    String wordToInsert = "";
    String outSent = ""; // output sentence

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        sent = sc.nextLine().toUpperCase();
        // Checking if the sentence only ends in '.' or '?' or '!'
        // using demorgan's law to obtain the boolean expression below
        if (!sent.endsWith(".") && !sent.endsWith("?") && !sent.endsWith("!")) {
            System.out.println("Invalid sentence");
            System.exit(-1);
        }
        System.out.print("Enter the word to insert: ");
        wordToInsert = sc.next().toUpperCase();
        System.out.print("Enter the word position in the sentence: ");
        wordIndex = sc.nextInt() - 1;
        sc.close();
    }

    void display() {
        StringTokenizer tokens = new StringTokenizer(sent, " ");
        String res = "";
        for (int i = 0; tokens.hasMoreTokens(); i++) {
            String word = tokens.nextToken();
            if (i == wordIndex)
                res += wordToInsert + " ";
            res += word + " ";
        }
        outSent = res;
        System.out.println("The new sentence is:\n" + outSent);
    }

    public static void main(String[] args) {
        Upper obj = new Upper();
        obj.input();
        obj.display();
    }
}
/*
 * Variable Description
 * Name | Type | Description
 * - | - | -
 * ***global***
 * sent | String | to store the sentence
 * wordToInsert | String | to store the word to be inserted
 * wordIndex | int | to store the index of the word to be inserted
 * outSent | String | to store the output sentence
 * ***void input()***
 * sc | Scanner | to take user input
 * ***void display()***
 * tokens | StringTokenizer | to tokenize the sentence to extract words
 * res | String | to store the output sentence
 * i | int | to store the index of the word (counter variable)
 */
/*
 * Algorithm
 * #### Algorithm for ***main()*** method
 * 1. Create an object of class Upper
 * 2. Call the method input() to take input
 * 3. Call the method display() to display the output
 * #### Algorithm for ***input()*** method
 * 1. Initialize the Scanner object to take input.
 * 2. Take a String input of sentence into a String variable *sent*
 * 3. Take a String input of word to be inserted into a String variable
 * *wordToInsert*
 * 4. Take a integer input of index of the word to be inserted into a integer
 * variable *wordIndex*
 * 5. Check if the sentence ends with '.' or '?' or '!'. If not, print an error
 * message and exit.
 * #### Algorithm for ***display()*** method
 * 1. Initialize the StringTokenizer object to tokenize the sentence into words.
 * 2. Initialize a String variable *res* to store the output sentence.
 * 3. Initialize a integer variable *i* to store the index of the word (counter
 * variable).
 * 4. Start a **for** loop with initialization of *int i=0* and condition
 * *tokens.hasMoreTokens()* and increment *i++*.
 * 5. If the index of the word is equal to the index of the word to be inserted,
 * Append the word to be inserted to the output sentence.
 * 6. Append the word to the output sentence.
 * 6. End **for** loop.
 * 7. Print the output sentence.
 */
