
public class decreasingnumber {
    public static void decreasing(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        decreasing(num - 1);
    }

    // print number in increasing order
    public static void increasing(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        increasing(num - 1);
        System.out.println(num);
    }

    // print factorial
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fact(num - 1);
    }

    // print sum of n natural number
    public static int Nsum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + Nsum(num - 1);
    }

    // fibonachi number
    public static int fabinachi(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        int f1 = fabinachi(num - 1);
        int f2 = fabinachi(num - 2);
        return f1 + f2;
    }

    // check if array is in sorted order or not
    public static boolean isSorted(int arr[], int i) {

        // this is a base case
        if (i == arr.length - 1) {
            return true;
        }

        // here we are doing some work
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // here we are repeating by incrementation
        return isSorted(arr, i + 1);
    }

    public static int npow(int num, int pow) {

        // this function do work in o(n) time

        // if(pow == 0){
        // return 1;
        // }
        // return num * npow(num, pow-1);

        // this is a optimized solution of same problem
        if (pow == 0) {
            return 1;
        }
        int halfpow = npow(num, pow / 2);
        int sqpow = halfpow * halfpow;
        // if n is odd
        if (pow % 2 != 0) {
            sqpow = num * sqpow;
        }

        return sqpow;
    }

    public static void main(String[] args) {
        int num = 2;
        int pow = 4;
        // decreasing(num);
        // increasing(num);
        // System.out.println(fact(num));
        // System.out.println(Nsum(num));
        // System.out.println(fabinachi(num));
        int arr[] = { 1, 2, 3, 4 };
        // System.out.println(isSorted(arr, num));
        System.out.println(npow(num, pow));

    }

}
