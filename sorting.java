/**
 * sorting
 */
public class sorting {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Bubble(int arr[]) {
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            print(arr);
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        print(arr); 
    }

    public static void insertionSort

    public static void main(String[] args) {
        int arr[] = { 1, 55, 8, 95, 66, 78, 54 };
        // Bubble(arr);
        selectionSort(arr);
    }
}