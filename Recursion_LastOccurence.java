public class Recursion_LastOccurence {

    public static int lastOccur(int arr[], int key, int n) {

        if (n == arr.length) {
            return -1;
        }
        int finalVal = lastOccur(arr, key, n + 1);

        if (finalVal == -1 && arr[n] == key) {
            return n;
        }
        return finalVal;
    }

    public static void main(String[] args) {

        int arr[] = { 11, 55, 654, 9, 54, 55, 456 };
        System.out.println(lastOccur(arr, 55, 0));
    }
}
