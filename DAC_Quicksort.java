public class DAC_Quicksort {
    public static void printtarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivot = partition(arr, si, ei);
        quicksort(arr, si, pivot - 1);
        quicksort(arr, pivot + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    

    public static void main(String[] args) {
        int arr[] = { 12, 5, 77, 8, 4, 3, 44 };
        quicksort(arr, 0, arr.length - 1);
        printtarr(arr);
    }
}
