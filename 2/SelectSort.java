class SelectSort {
    public static void main(String[] args) {
        SelectSort a = new SelectSort();
        int[] A = { -33, -12, -50, 89, 76, 68, 26, 90, 64, 897 };
        int[] B = a.sort(A);
        for (int x = 0; x < B.length; x++) {
            System.out.print(B[x] + "\t");
        }
        System.out.println();
    }

    int[] sort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            int large = arr[x], i = x;
            for (int y = x; y < arr.length; y++) {
                if (arr[y] > large) {
                    large = arr[y];
                    i = y;
                }
            }
            arr[i] = arr[x];
            arr[x] = large;
        }
        return arr;
    }
}