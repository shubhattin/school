import java.util.*;

class ConsShift {
    String wrd, shift_wrd, upper_wrd;

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        wrd = sc.next().toLowerCase();
        sc.close();
    }

    void shiftcosn() {
        StringBuffer cn = new StringBuffer();
        StringBuffer oth = new StringBuffer();
        for (int x = 0; x < wrd.length(); x++) {
            char c = wrd.charAt(x);
            if (is_cons(c))
                cn.append(c);
            else
                oth.append(c);
        }
        shift_wrd = cn.toString() + oth.toString();
        upper_wrd = cn.toString().toUpperCase() + oth.toString();
    }

    void display() {
        System.out.println("Word: " + wrd);
        System.out.println("Shifted Word: " + shift_wrd);
        System.out.println("Changed Word: " + upper_wrd);
    }

    boolean is_cons(char val) {
        if (!Character.isLetter(val))
            return false;
        char[] v = { 'a', 'e', 'i', 'o', 'u' };
        val = Character.toLowerCase(val);
        for (int x = 0; x < v.length; x++)
            if (val == v[x])
                return true;
        return false;
    }

    public static void main(String[] args) {
        ConsShift a = new ConsShift();
        a.readword();
        a.shiftcosn();
        a.display();
    }
}