/**
 * RoughWork
 */
public class RoughWork {

    public static void repeate(int arr[], int k, int N, int i) {

        if (i == N) {
            return;
        }
        if (arr[i] == k) {
            System.out.print(i + " ");
        }
        repeate(arr, k, N, i + 1);
    }

    public static void convert(int N) {
        if (N == 0) {
            return;
        }

        convert(N / 10);

         if (N % 10 == 0) {
            System.out.println("zero");
        }
        if (N % 10 == 1) {
            System.out.println("one");
        }
        if (N % 10 == 2) {
            System.out.println("two");
        }
        if (N % 10 == 3) {
            System.out.println("three");
        }
         if (N % 10 == 4) {
            System.out.println("four");
        }
         if (N % 10 == 5) {
            System.out.println("five");
        }
         if (N % 10 == 6) {
            System.out.println("six");
        }
         if (N % 10 == 7) {
            System.out.println("seven");
        }
         if (N % 10 == 8) {
            System.out.println("eight");
        }
         if (N % 10 == 9) {
            System.out.println("nine");
        }

        
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int k = 2;
        int i = 0;
        // int N = 1235;
        // repeate(arr, k, arr.length, i);
        convert(1547);
    }
}
