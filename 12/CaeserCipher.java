import java.util.Scanner;

public class CaeserCipher {
    String text;
    int shift;
    String cipherText;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        text = sc.nextLine().toUpperCase();
        System.out.print("Enter the shift: ");
        shift = sc.nextInt();
        sc.close();
    }

    void storeCipherText() {
        String res = "";
        for (int x = 0; x < text.length(); x++) {
            char ch = text.charAt(x);
            int index_ch = ch - 'A' + 1; // index of char
            int shifted_ch = ((index_ch + shift) % (26)); // shifted index of char
            if (shifted_ch == 0)
                shifted_ch = 26; // if remainder is zero it points to 26th alphabet
            res += (char) (shifted_ch + 'A' - 1);
        }
        cipherText = res;
    }

    void display() {
        System.out.println("Cipher Text: " + cipherText);
    }

    public static void main(String[] args) {
        CaeserCipher a = new CaeserCipher();
        a.input();
        a.storeCipherText();
        a.display();
    }
}
/*
 * Variable Description
 * Name | Type | Description
 * - | - | -
 * ***global***
 * text | String | to store the text
 * shift | int | to store the shift
 * cipherText | String | to store the cipher text
 * ***void input()***
 * sc | Scanner | to take user input
 * ***void storeCipherText()***
 * res | String | to store the cipher text
 * x | int | to store the index of the character (counter variable)
 * ch | char | to store the character
 * index_ch | int | to store the index of the character
 * shifted_ch | int | to store the shifted index of the character
 * ***void main()***
 * a | CaeserCipher | to create an object of the class
 */
/*
 * Algorithm
 * #### Algorithm for ***main()*** method
 * 1. Create an object of class CaeserCipher
 * 2. Call ***input()*** method
 * 3. Call ***storeCipherText()*** method
 * 4. Call ***display()*** method
 * #### Algorithm for ***input()*** method
 * 1. Initialize the Scanner object to take input.
 * 2. Take the text as input.
 * 3. Take the shift as input.
 * 4. Close the Scanner object.
 * #### Algorithm for ***storeCipherText()*** method
 * 1. Initialize the result string to empty.
 * 2. For each character in the text
 * 3. Get the character
 * 4. Get the index of the character
 * 5. Get the shifted index of the character
 * 6. If the shifted index is 0, set the shifted index to 26
 * 7. Add the shifted character to the result string
 * 8. Set the result string to the cipher text
 * #### Algorithm for ***display()*** method
 * 1. Print the cipher text
 */