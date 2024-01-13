public class Recursion_First_occurence {

    public static int firstOccurence(int arr[], int key, int n) {
        if (n == arr.length-1) {
            return -1;
        }
        if (arr[n] == key) {
            return n;
        }
        
        return firstOccurence(arr, key, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 7, 8, 9, };
        System.out.println(firstOccurence(arr, 5, 0));
    }
}
