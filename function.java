import java.util.*;

public class function {

    // void function hello world
    public static void printHello() {

        System.out.println("hellow world");
        return;
    }

    // parametarized calculateSum function
    public static int calculateSum(int a, int b) {

        int sum = a + b;
        return sum;
    } 

    //factorial function
    public static int fact(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }
        
        return fact;
    }

    // bionomial function 
    public static int bionomial_func(int n, int r){
        int a = fact(n);
        int b = fact(r);
        int ab = fact(n-r);

        return (a/(b*ab));
    }

    //check prime
    public static boolean isprime(int n){

        //cornor cases
        if(n == 2){
            return true;
        }

        // main case
        for (int i = 2; i < n-1; i++) {
            if(n%i == 0){ 
          return false;
            }
        }
        return true;
    }


        //prime is in range
        public static void primeRange(int n){
            for (int i = 2; i <= n; i++) {
                if(isprime(i) == true){
                    System.out.println(i+" ");
                }
                
            }

        }

        //decimal to binary
        public static void dectobin(int n){
            int pow = 0;
            int binnum = 0;
            int mynum = n;
            while(n  > 0){
                int rem = n%2;
                binnum = binnum + (int)Math.pow(10, pow);

                pow++;
                n=n/2;
            }

            System.out.println("binary form of " + mynum + " = " + binnum);
        }

    // main function
    public static void main(String[] args) {

        // printHello(); // calling printHello function
        Scanner sc = new Scanner(System.in);

        //sum function
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("sum is: " + sum);

        //factorial functon
        // System.out.println("please write number you want factorial of");
        // int num = sc.nextInt();
        // // int fact = fact(num);
        // System.out.println("factorial of your number is :"+fact(num));

        //bionomial function arguments
        // System.out.println("please enter your n");
        // int n = sc.nextInt();
        // System.out.println("please enter your r");
        // int r = sc.nextInt();
        // int result = bionomial_func(n,r);
        // System.out.println(result);

        //check prime number
        // System.out.println(isprime(2)); 

        //prime in range
        // primeRange(100);   

        dectobin(7);

    }
}
