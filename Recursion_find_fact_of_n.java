public class Recursion_find_fact_of_n {

    public static int nfact(int n){
        if(n==0){
            return 1;
        }
        int fn = nfact(n-1);
        int factorial = n * fn;
        return factorial;
        // one liner
        // return n* nfact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(nfact(5));
    }
}
