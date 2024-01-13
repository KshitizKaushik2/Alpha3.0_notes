import java.util.*;

public class oops_PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        complex c1 = new complex();

        System.out.println("please enter your number 1");
        double a = sc.nextDouble();

        System.out.println("please enter your number 2");
        double b = sc.nextDouble();

        System.out.println(c1.sum(a, b));
        System.out.println(c1.subtract(a, b));
        System.out.println(c1.devide(a, b));
        System.out.println(c1.multiply(a, b));

    }
}

class complex {
    double sum(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double devide(double a, double b) {
        return a / b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}