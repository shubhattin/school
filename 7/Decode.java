import java.util.*;

public class Decode {
    int sh;// shift value
    String str, dec;

    void input() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Shift Value: ");
        sh = sc.nextInt();
        System.out.print("Input Coded Text: ");
        str = sc1.nextLine().toUpperCase();
        if (str.length() > 100) {
            System.out.println("Invalid Input");
            System.exit(-1);
        }
        sc.close();
        sc1.close();
    }

    void decode() {
        StringBuffer mrg = new StringBuffer();
        for (int x = 0; x < str.length(); x++)
            if (!Character.isWhitespace(str.charAt(x)))
                mrg.append(str.charAt(x));
        str = mrg.toString();
        System.out.println(str);
        char[] out = str.toCharArray();
        for (int x = 0; x < out.length; x++) {
            int ch = out[x] + sh - 'A';
            if (ch > 26)
                ch = ch - 26;
            else if (ch < 0)
                ch = 26 + ch;
            out[x] = (char) (ch + 'A' - 1);
        }
        str = String.valueOf(out);
        StringTokenizer a = new StringTokenizer(str, "QQ");
        StringBuffer rs = new StringBuffer();
        while (a.hasMoreTokens())
            rs.append(a.nextToken() + " ");
        dec = rs.toString();
    }

    void display() {
        System.out.println("Decoded Text: " + dec);
    }

    public static void main(String[] args) {
        Decode a = new Decode();
        a.input();
        a.decode();
        a.display();
    }
}
