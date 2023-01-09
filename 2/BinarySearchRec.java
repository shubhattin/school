public class BinarySearchRec {
    public static void main(String[] args) {
        BinarySearchRec a = new BinarySearchRec();
        System.out.println("Recursive Binary Search");
        a.test();
    }
    int bin_search(int[] arr, int val, int l, int u){
        if(l > u) return -1;
        else{
            int mid = (l + u)/2;
            if(arr[mid] == val) return mid;
            else if(val < arr[mid]) u = mid - 1;
            else l = mid + 1;
            return bin_search(arr, val, l, u);
        }
    }
    void test(){
        int[] data = {2, 4, 5, 9, 12, 22, 23, 24, 35, 39, 44, 48, 50, 53, 55, 59, 60, 76, 87, 92, 100};
        int[] result = {0, 0};
        for(int x = 0 ; x < data.length ; x++){
            int val = data[x];
            int index = bin_search(data, val, 0, data.length - 1);
            result[1]++;
            if(index == x) result[0]++;
        }
        System.out.printf("Test Result: %d/%d%n",result[0], result[1]);
    }
}
