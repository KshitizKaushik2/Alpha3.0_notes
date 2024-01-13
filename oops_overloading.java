public class oops_overloading {
    
    public static void main(String[] args) {
        //method overloading
        Calculate cals = new Calculate();

        System.out.println(cals.sum(1, 4, 5, 43));
        System.out.println(cals.sum(12, 56));
        System.out.println(cals.sum((float) 4.2, (float) 5.36, (float) 5.2));
    
        //method overriding
        deer ani = new deer();
        ani.eat();
    }

}
class animal {
    void eat() {
        System.out.println("animal eat");
    }
}

class deer extends animal {
    // @Override
    void eat() {
        System.out.println("eats grass");
    }
}

// when we have same names but dif. types or counts it known as function
// overloading
// this is function overloading
class Calculate {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}

// method/function overriding
// same function dif defination

