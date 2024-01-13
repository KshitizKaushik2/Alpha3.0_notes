public class oops_types0fConstructir {

    public static void main(String[] args) {
        forthis f1 = new forthis();
        forthis f2 = new forthis("kshitiz");
        forthis f3 = new forthis(54);
    }
}

class forthis {
    String name;
    int roll;

    forthis() {
        System.out.println("this is my name");
    }

    forthis(String name) {
        this.name = name;
        System.out.println(name);
    }

    forthis(int roll) {
        this.roll = roll;
        System.out.println(roll);
    }

}