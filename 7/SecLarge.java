public class SecLarge {
    int[] A = { -33, -12, -50, 1, -76, -68, -2, -10 };

    int sec_large() {
        int s_max = A[0], max = A[1]; // initializing ant value from array
        for (int x = 0; x < A.length; x++) {
            int nm = A[x];
            if (nm > max) {
                s_max = max;
                max = nm;
            }
            if (nm > s_max && nm < max)
                s_max = nm;
        }
        return s_max;
    }

    public static void main(String[] args) {
        SecLarge a = new SecLarge();
        System.out.println("Second Largest: " + a.sec_large());
    }
}