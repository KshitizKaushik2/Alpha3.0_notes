public class DAC_mergeSort {

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void devide(int arr[], int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = si  + (ei - si) / 2;
        devide(arr, si, mid);
        devide(arr, mid + 1, ei); // why this line is not executed 
        merge(arr, si, ei, mid); //we only returend one array how we are comparing i and j then
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int newarr[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                newarr[k] = arr[i];
                i++;
                k++;
            }

            else {
                newarr[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            newarr[k++] = arr[i++];
        }

        while (j <= ei) {
            newarr[k++] = arr[j++];
        }

        for (k = 0, i = si; k < newarr.length; k++, i++) {
            arr[i] = newarr[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 51, 55 };
        devide(arr, 0, arr.length-1);
        printarr(arr);
    }
}
