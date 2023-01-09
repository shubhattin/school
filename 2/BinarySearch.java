public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch a = new BinarySearch();
        System.out.println("Binary Search");
        a.test();
    }
    int bin_search(int[] arr, int val){
        int l = 0, u = arr.length - 1;
        while(l <= u){
            int mid = (l + u)/2;
            if(val == arr[mid]) return mid;
            else if(val > arr[mid]) l = mid + 1;
            else u = mid - 1;
        }
        return -1;
    }
    void test(){
        int[] data = {2, 4, 5, 9, 12, 22, 23, 24, 35, 39, 44, 48, 50, 53, 55, 59, 60, 76, 87, 92, 100};
        int[] result = {0, 0};
        for(int x = 0 ; x < data.length ; x++){
            int val = data[x];
            int index = bin_search(data, val);
            result[1]++;
            if(index == x) result[0]++;
        }
        System.out.printf("Test Result: %d/%d%n",result[0], result[1]);
    }
}
