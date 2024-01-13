public class Recursion_sum_of_n_natural_no {



    public static int sumOfNatural(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNatural(n-1);
    }
    public static void main(String[] args) {
    System.out.println(sumOfNatural(5));
    }
}
