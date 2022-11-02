import java.util.Scanner;

class CentInt1 {
    int[] num;

    public static void main(String[] args) {
        CentInt1 a = new CentInt1();
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
        int len2 = len % 2;
        // 2nd Method, with limited memory
        for (int x = 1; x <= (len - 1 + len2) / 2; x += 2) {
            int tmp = num[x];
            int end_ind = len - x - 1 + len2;
            num[x] = num[end_ind];
            num[end_ind] = tmp;
        }
        int ind = len / 2 + len2;
        sort(num, 0, ind);
        sort(num, ind, len);
        reverse(num, 0, ind);
        System.out.println("Output:");
        for (int x = 0; x < len; x++)
            System.out.print(num[x] + " ");
        System.out.println();
    }

    int[] reverse(int[] arr, int start, int end) {
        for (int x = start; x < end / 2; x++) {
            int tmp = arr[x];
            arr[x] = arr[end - 1 - x];
            arr[end - 1 - x] = tmp;
        }
        return arr;
    }

    int[] sort(int[] arr, int start, int end) {
        for (int x = start; x < end - 1; x++) {
            for (int y = start; y < end + start - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                }
            }
        }
        return arr;
    }

    int[] sort(int[] arr) {
        return sort(arr, 0, arr.length);
    }
}
