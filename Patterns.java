/**
 * Patterns
 */
public class Patterns {

    public static void main(String[] args) {
        
        // for(int i = 0; i <=4; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        //inverted star pattern
        // int n = 5;
        
        //1st approach
        // for (int i = 1; i<= n; i++){
        //     for(int j = 1; j <= (n-i+1); j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //second approach
        // for(int i=n; i > 0; i-- ){
        //     for (int j2 = 0; j2 < i;j2++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //program to print ABCD in row in half pyramid

        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
            System.out.print(ch);
            ch++;
            }
            System.out.println();
        }
    }
}
