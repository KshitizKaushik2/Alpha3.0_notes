public class Recursion_powerofx {
    public static int power(int x, int n) {

        // this is optimized sollution
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);//this statement also reduced recursion calls
         
        int halfPowersq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;

        // this solution is not optimized
        // if(n == 0){
        // return 1;
        // }
        // // int xn1 = power(x,n-1);
        // // int xfinal = x * xn1;
        // return x * power(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
