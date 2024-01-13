public class oops_Classes_objects {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.changeCompany("reylonds");
        System.out.println(p1.company);
        p1.changecolor("red");
        System.out.println(p1.color);

    }

}

class pen {
    String company;
    String color;
    int size;

    void changeCompany(String newcompany) {
        company = newcompany;
    }

    void changecolor(String newcolor) {
        color = newcolor;
    }
}