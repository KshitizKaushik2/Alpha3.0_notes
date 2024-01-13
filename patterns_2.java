public class patterns_2 {

    // function to print hollow rectangle

    // public static void hollow_rect(int row, int col) {
    // for (int i = 1; i <= row; i++) {
    // for (int j = 1; j <= col; j++) {
    // if (i == 1 || i == row || j == 1 || j == col) {

    // System.out.print("*");
    // }
    // else{
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // function to print reverse star pattern

    // public static void half_pyramid(int n) {
    // for (int i = 1; i <= n; i++) {

    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // }

    // function to print number pyramid

    // public static void half_pyramid_num(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // FLOYDS Triangle

    // public static void FLOYDS_tri(int n) {
    // int counter = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();
    // }
    // }

    // zero one pattern

    // public static void zero_one(int n){
    // for (int i = 1; i <= n; i++) {
    // for(int j = 1; j <= i; j++){

    // if ( (i+j)%2 == 0 ){
    // System.out.print("1");
    // }
    // else{
    // System.out.print("0");
    // }
    // }
    // System.out.println();
    // }
    // }

    // butterfly pattern
    public static void butterfly_pattern(int n) {
        //first half
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = n; i >= 1; i--) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rect(4, 5);

        // half_pyramid(50);

        // half_pyramid_num(5);

        // FLOYDS_tri(5);

        // zero_one(5);

        butterfly_pattern(6 );
    }
}
