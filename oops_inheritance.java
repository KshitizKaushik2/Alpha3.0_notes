public class oops_inheritance {
    public static void main(String[] args) {
        fish tuna = new fish();
        // tuna.legs();
        // tuna.swim();
        Whale blue = new Whale();
        blue.Type = "blue whale";
        System.out.println(blue.Type);
        blue.colour = "blue";
    }
}

class Animal {
    String colour;

    void legs() {
        System.out.println("this animal have no legs");
    }
}

//this is a single level inheretence 
class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

//this is multi level inheritence
class Whale extends fish{

    String Type;
}
