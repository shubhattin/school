import java.util.*;;

public class Quiz {
    char[] key = new char[5];
    char[][] ans;
    int N;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Participants: ");
        N = sc.nextInt();
        ans = new char[N][5];
        for (int x = 0; x < N + 1; x++) {
            System.out.print((x != N ? ("Participant " + (x + 1)) : "Key") + " :");
            for (int y = 0; y < 5; y++) {
                char ch = sc.next().toUpperCase().charAt(0);
                if (x != N)
                    ans[x][y] = ch;
                else
                    key[y] = ch;
            }
        }
        sc.close();
    }

    void scrores() {
        int max = 0;
        int[] scr = new int[N];
        System.out.println("Scores: ");
        for (int x = 0; x < N; x++) {
            int s = 0;
            for (int y = 0; y < 5; y++)
                if (ans[x][y] == key[y])
                    s++;
            scr[x] = s;
            max = Math.max(max, s);
            System.out.println("Participant " + (x + 1) + " =  " + s);
        }
        System.out.println("Highest Scores");
        for (int x = 0; x < N; x++)
            if (scr[x] == max)
                System.out.println("Participant " + (x + 1));
    }

    public static void main(String[] args) {
        Quiz a = new Quiz();
        a.input();
        a.scrores();
    }
}
