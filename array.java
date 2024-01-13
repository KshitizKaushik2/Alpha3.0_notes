
import java.util.*;

public class array {

    // check if there is element present in array or not
    // public static int linearSearch(int[] arr, int key) {

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // find largest number in array
    // public static int largestValue(int[] arr) {
    // int val = Integer.MIN_VALUE;

    // if (arr.length == 0) {
    // return Integer.MIN_VALUE;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > val) {
    // val = arr[i];
    // }

    // }
    // return val;
    // }

    // reverse an array
    // public static void revarr(int[] arr) {
    // int first = 0;
    // int last = arr.length - 1;
    // int temp = 0;
    // int i = 0;

    // while (first < last) {
    // temp = arr[last];
    // arr[last] = arr[first];
    // arr[first] = temp;

    // last--;
    // first++;
    // }
    // while (i < arr.length) {
    // System.out.println(arr[i]);
    // i++;
    // }

    // }

    // print pairs of an array
    // public static void pairsarr(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int current = arr[i];
    // for (int j = i + 1; j < arr.length; j++) {
    // System.out.print("(" + current + "," + arr[j] + ") ");
    // }
    // System.out.println();
    // }
    // }

    // print subarray its sum and maximum sum
    // public static void subarray(int[] arr) {
    // int sum = 0;
    // int MaxSum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // for (int k = i; k <= j; k++) {
    // System.out.print(arr[k] + " ");
    // // sum = 0;
    // sum += arr[k];
    // }
    // System.out.println();
    // System.out.println("sum: " + sum);
    // if (sum > MaxSum) {
    // MaxSum = sum;
    // }
    // sum = 0;

    // }
    // System.out.println();
    // }
    // System.out.println("your maximum sum is: " + MaxSum);
    // }

    public static void subarray(int[] arr) {
        int currsum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int Maxsum = Integer.MIN_VALUE;

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                currsum = i == 0 ? prefix[i] : prefix[i] - prefix[j - 1];

                if (currsum > Maxsum) {
                    Maxsum = currsum;
                }
            }
        }
        System.out.println("your max sum is: " + Maxsum);
    }

    public static void main(String[] args) {

        // element present in array?
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your key");
        // int a = sc.nextInt();
        int arr[] = { 1, 2, 3, 5, 4, 6 };
        // int val = linearSearch(arr, a);
        // if (val > -1) {
        // System.out.println("your element is on position " + val);
        // } else {
        // System.out.println("sorry element is not present");
        // }
        // int val = largestValue(arr);
        // if (val == Integer.MIN_VALUE) {
        // System.out.println("sorry there is no element in your list");
        // } else {
        // System.out.println("your largest number is: " + val);
        // }

        // reverse array
        // revarr(arr);

        // pairs of an arraay
        // pairsarr(arr);

        subarray(arr);

    }
}
