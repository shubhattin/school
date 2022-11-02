import java.util.*;

public class Capital {
    String sent;
    int freq;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        sent = sc.nextLine();
        sc.close();
    }

    void display() {
        StringTokenizer st = new StringTokenizer(sent, " .");
        while (st.hasMoreTokens())
            if (Character.isUpperCase(st.nextToken().charAt(0)))
                freq++;
        System.out.println("Sentence: " + sent);
        System.out.println("Freequency: " + freq);
    }

    public static void main(String[] args) {
        Capital a = new Capital();
        a.input();
        a.display();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * sent | String | to store entered sentence
 * freq | int | to store freequeny of words starting with capital letters
 * ***void input()***
 * sc | Scanner | object to take user input
 * ***void display()***
 * st | StringTokenizer | object used to extract words from the senetence
 * ***void main()***
 * a | Capital | Object to call its classes
 */
/*
 * Algorithm
 * #### ***void input()***
 * 1. Initialize the scaner object to take input from the user
 * 2. Enter the sentence and store it in 'sent'
 * #### ***void main()***
 * 1. Initialize the object of class Capital to call its methods
 * 2. Call the input and display functions
 * #### ***void display()***
 * 1. Initialize a string tokenizer object with ' ' and '.' as delimiters.
 * 2. Start a **while** loop with condtition *st.hasMoreTokens()*
 * 3. if the first charcter of the current token(word) is in upper case then
 * then increment *freq* by 1
 * 4. End **while** loop
 * 5. Print the sentence entered
 * 6. Print the frequency of Words starting with capital letters
 */