public class Str {
    public static void main(String[] args) {
        String na = "a ProFile";
        String s = "";
        for (int x = 0; x < na.length(); x++) {
            char ch = na.charAt(x);
            if (Character.isLowerCase(ch))
                s += Character.toUpperCase(ch);
            else if (Character.isUpperCase(ch))
                if (x % 2 != 0)
                    s += Character.toLowerCase(na.charAt(x - 1));
                else
                    s += ch--;
        }
        System.out.println(s);
    }
}