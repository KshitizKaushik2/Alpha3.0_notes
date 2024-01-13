public class backtreaking_inArray {

    // this code is to print the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // this code if for m-2 code
    public static void array_2(int arr[], int n, int m) {
        if (n == arr.length) { // base case
            print(arr);
            return;
        }

        arr[n] = m; // kam
        array_2(arr, n + 1, m + 1); // call
        arr[n] = m - 2; // backtracking step
    }

    // main code
    public static void main(String[] args) {
        int arr[] = new int[5];
        array_2(arr, 0, 1);
        print(arr);

    }
}
