public class Recursion_isSorted {

    public static boolean sortedOrnot(int arr[], int n){
        int i = 0;
        if(i == n-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return sortedOrnot(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,9};
        System.out.println(sortedOrnot(arr,4));
    }
}
