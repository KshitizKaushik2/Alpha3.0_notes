public class Recursion_practice_Qus {

    // question1
    public static void countKey(int arr[], int index, int key) {
        // base condition
        if (index == -1) {
            return;
        }
        countKey(arr, index - 1, key);
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
    }

    // question 2
    public static void strn(int n) {
        // base condition
        if (n == 0) {
            return;
        }
        // reduction
        strn(n / 10);
        // solution
        int m = n % 10;

        if (m == 0) {
            System.out.print("zero ");
            return;
        }
        if (m == 1) {
            System.out.print("one ");
            return;
        }
        if (m == 2) {
            System.out.print("two ");
            return;
        }
        if (m == 3) {
            System.out.print("three ");
            return;
        }
        if (m == 4) {
            System.out.print("four ");
            return;
        }
        if (m == 5) {
            System.out.print("five ");
            return;
        }
        if (m == 6) {
            System.out.print("six ");
            return;
        }
        if (m == 7) {
            System.out.print("seven ");
            return;
        }
        if (m == 8) {
            System.out.print("eight ");
            return;
        }
        if (m == 9) {
            System.out.print("nine ");
            return;
        }
    }

    // question 3
    public static int countStr(String str){
        if(str.equals("")){
            return 0;
        }

        // int k = str.length()-1;
        return countStr(str.substring(0,str.length()-1)) + 1;
    }

    public static void main(String[] args) {
        String str = "hehelol";
        System.out.println(countStr(str));
        // System.out.println(str.deleteCharAt(str.length()-1));
    }
}
