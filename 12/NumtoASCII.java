import java.util.Scanner;

public class NumtoASCII {
    String code = "";

    NumtoASCII(String code) {
        this.code = code;
    }

    String getASCII() {
        String res = "";
        int i = 0;
        while (i < code.length()) {
            int update_index = 2;
            char ch = (char) Integer.parseInt(code.substring(i, i + update_index));
            if (ch == ' ') {
                res += " ";
            } else if (ch >= 'A' && ch <= 'Z') {
                res += ch;
            } else if (ch >= 'a' && ch < 'd') {
                res += ch;
            } else {
                ch = (char) Integer.parseInt(code.substring(i, i + update_index + 1));
                if (ch >= 'd' && ch <= 'z') {
                    res += ch;
                    update_index++;
                } else
                    return "Invalid Input";
            }
            System.out.println(ch + "\t" + i);
            i += update_index;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Code: ");
        String s = input.nextLine();
        NumtoASCII n = new NumtoASCII(s);
        System.out.println("The ASCII code is :- " + n.getASCII());
    }
}
