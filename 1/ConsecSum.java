import java.util.Scanner;

class ConsecSum {
    int num;

    public static void main(String[] args) {
        ConsecSum a = new ConsecSum();
        a.input();
        a.sum();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Not a positive Number");
            System.exit(0);
        }
        sc.close();
    }

    void sum() {
        int found = 0;
        for (int x = 1; x < num; x++) {
            int sum = 0;
            String sm = "";
            for (int t = x; t < num; t++) {
                sum += t;
                sm += String.valueOf(t);
                if (sum == num) {
                    System.out.println(sm);
                    found++;
                    break;
                } else if (sum >= num)
                    break;
                sm += " + ";
            }
        }
        if (found == 0)
            System.out.println("No Consecutive Sum found");
    }
}