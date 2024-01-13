public class P_DAC_Sort_String_using_MergeSort {

    public static void printarray(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void devide(String arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        devide(arr, si, mid);
        devide(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(String arr[], int si, int ei, int mid) {
        String newarr[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if ( arr[i].compareTo(arr[j]) < 0) {
                newarr[k] = arr[i];
                i++;
            } else {
                newarr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            newarr[k++] = arr[i++];
        }
        while (j <= ei) {
            newarr[k++] = arr[j++];
        }

        for (int k2 = 0,g = si; k2 < newarr.length;g++, k2++) {
            arr[g] = newarr[k2];
        }

    }

    public static void main(String[] args) {

        String arr[] = { "sun", "earth", "mars", "mercury","merctus"};
        devide(arr, 0, arr.length-1);
        printarray(arr);

    }
}
