import java.util.*;

public class Rcursion_basic {

    public static void rec(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        rec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input you number you want reverse of");
        int n = sc.nextInt();
    }
}
