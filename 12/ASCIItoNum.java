import java.util.Scanner;

public class ASCIItoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        String res = "";
        for (int x = 0; x < s.length(); x++) {
            int c = s.charAt(x);
            res += c;
        }
        System.out.println("The ASCII code for " + s + " is " + res);
    }
}
