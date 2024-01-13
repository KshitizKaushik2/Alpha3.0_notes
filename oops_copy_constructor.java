import java.sql.Struct;

public class oops_copy_constructor {
    public static void main(String[] args) {
        employee e1 = new employee("kshitiz",132566);
        e1.getemployee();
        employee e2 = new employee(e1);
        e2.getemployee();
    }
}

class employee {
    private String name; 
    private int passcode;

    //this is a copy constructor
    employee(employee e1){
        this.name = e1.name;
        this.passcode = e1.passcode;
        
    } 
    employee(String name, int passcode){
        this.name = name;
        this.passcode = passcode;
    }
    void getemployee(){
    System.out.println(name);
    System.out.println(passcode);
    }
}
