public class oops_abstract {
    public static void main(String[] args) {
    
    dog d = new dog();
    d.eat();
    d.walk();

    human h = new human();
    h.eat();
    h.walk(); 

    }
}

abstract class animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class dog extends animal {
    void walk() {
        System.out.println("dog have 4 legs");
    }
}

class human extends animal {
    void walk() {
        System.out.println("human walk on 4 legs");
    }
}