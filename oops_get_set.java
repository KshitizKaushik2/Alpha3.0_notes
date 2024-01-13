public class oops_get_set {
    public static void main(String[] args) {
        // these are type of function which we used to access the private elements
        Student s1 = new Student();
        s1.setname("kshitiz");
        s1.setage(21);
        System.out.println(s1.getname());
        System.out.println(s1.getage());
    }
}

class Student {
    private String name;
    private int age;

    // these functions used to change properties from main
    void setname(String newname) {
        this.name = newname;
    }

    void setage(int newage) {
        this.age = newage;
    }

    // these functions used to print properties from main
    String getname() {
        return this.name;
    }

    int getage() {
        return this.age;
    }
}
