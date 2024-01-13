public class Recursion_fabonacci {

    public static int fabonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fn1 = fabonacci(n-1);
        int fn2 = fabonacci(n-2);
        int fnl = fn1 + fn2;
        return fnl;
    }
    public static void main(String[] args) {
        System.out.println(fabonacci(8));
    }
}
