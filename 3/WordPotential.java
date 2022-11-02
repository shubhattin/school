
import java.util.*;

public class WordPotential {
    String sent;
    String[] words;
    int[] codes;
    int len = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        sent = sc.nextLine().toUpperCase();
        sc.close();
    }

    void extract() {
        StringTokenizer st = new StringTokenizer(sent, " .");
        words = new String[st.countTokens()];
        codes = new int[st.countTokens()];
        while (st.hasMoreElements()) {
            String s = st.nextToken();
            words[len] = s;
            codes[len++] = sum(s);
        }
    }

    void arrange() {
        boolean sorted = false;
        for (int x = 0; x < len - 1 && !sorted; x++) {
            sorted = true;
            for (int y = 0; y < len - x - 1; y++)
                if (codes[y] > codes[y + 1]) {
                    int tmp = codes[y];
                    codes[y] = codes[y + 1];
                    codes[y + 1] = tmp;
                    String tm = words[y];
                    words[y] = words[y + 1];
                    words[y + 1] = tm;
                    sorted = false;
                }
        }
    }

    void display() {
        StringBuffer a = new StringBuffer();
        for (int x = 0; x < len; x++)
            a.append(words[x] + " ");
        System.out.println(a.toString());
    }

    int sum(String s) {
        int sm = 0;
        for (int x = 0; x < s.length(); x++)
            sm += s.charAt(x) - 'A' + 1;
        return sm;
    }

    public static void main(String[] args) {
        WordPotential a = new WordPotential();
        a.input();
        a.extract();
        a.arrange();
        a.display();
    }
}
