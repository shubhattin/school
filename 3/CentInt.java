import java.util.Scanner;

class CentInt {
    int[] num;

    public static void main(String[] args) {
        CentInt a = new CentInt();
        a.input();
        a.sort(a.num);
        a.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int len = sc.nextInt();
        num = new int[len];
        System.out.println("Enter Elements of Array:");
        for (int x = 0; x < num.length; x++)
            num[x] = sc.nextInt();
        sc.close();
    }

    void display() {
        int len = num.length;
        // 1st Method, with sufficient memory
        int[] arr = new int[len];
        int start = 0, centre = (len - 1) / 2;
        if (len % 2 == 1) {
            arr[centre] = num[0];
            start = 1;
        }
        for (int x = 1; x <= len / 2; x++) {
            arr[centre + x] = num[start++];
            arr[centre - x + (1 - len % 2)] = num[start++];
        }
        num = arr;
        System.out.println("Output:");
        for (int x = 0; x < len; x++)
            System.out.print(num[x] + " ");
        System.out.println();
    }

    int[] sort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
