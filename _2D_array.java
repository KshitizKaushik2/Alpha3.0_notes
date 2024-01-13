import java.security.Key;
import java.util.Scanner;

public class _2D_array {

    public static void search(int arr[][],int KEY){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==KEY) {
                    a = 1;
                }
            }
        }
        if(a == 1){
            System.out.println("element found");
        }
        else{
            System.out.println("key not found");
        }
    }

    public static void largestSmallest(int arr[][]){
        int larges = 0;
        int smalles = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j] > larges){
                        larges = arr[i][j];
                    }
                }
                for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j] < smalles){
                        smalles = arr[i][j];
                    }
                }
        }
        System.out.println(larges+" "+smalles);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int KEY = 78;
        int n = arr.length, m = arr[0].length;

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        search(arr, KEY);
        largestSmallest(arr);
    }
}
