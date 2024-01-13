public class P_DAC_Return_Majority_element {
    //printing 
    public static void print(int arr[]){
       for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
       } 
       System.out.println();
       
    }


    // sorting using merge sort
    public static void sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sort(arr, si, mid);
        sort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int newarr[] = new int[(ei - si) + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                newarr[k] = arr[i];
                i++;
            } else {
                newarr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            newarr[k++] = arr [i++]; 
        }
        while (j <= ei) {
            newarr[k++] = arr [j++]; 
        }

        for (int k2 = 0, g = si; k2 < newarr.length; k2++,g++) {
            arr[g] = newarr[k2];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5, 6, 7, 3 };
        sort(arr, 0, arr.length-1);
        print(arr);
        int mid = arr[arr.length-1]/2;
        System.out.println("majority element is "+ arr[mid]);
    }
}
