import java.util.Scanner;

class NumFreq {
    // int[] num = { 12, 20, 14, 12, 12, 20, 16, 16, 14, 14, 12, 20, 18, 18 };
    int[] num;

    public static void main(String[] args) {
        NumFreq a = new NumFreq();
        a.input();
        a.sort(a.num);
        a.count();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int len = sc.nextInt();
        if (len < 0) {
            System.out.println("Cannot be zero");
            System.exit(0);
        }
        num = new int[len];
        System.out.println("Enter Elements of Array:");
        for (int x = 0; x < num.length; x++)
            num[x] = sc.nextInt();
        sc.close();
    }

    void count() {
        int cn = 0;
        System.out.println("Number\tFreequency");
        for (int x = 0; x < num.length; x++) {
            cn++;
            if (x == num.length - 1 || num[x] != num[x + 1]) {
                System.out.println(num[x] + "\t" + cn);
                cn = 0;
            }
        }
    }

    int[] sort(int[] arr) {
        boolean sorted = false;
        for (int x = 0; !sorted && x < arr.length - 1; x++) {
            sorted = true;
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                    sorted = false;
                }
            }
        }
        return arr;
    }
}
