public class Parent  {
    String name;
    void display(){
        System.out.println("super class is running !");
    }
}
class child extends Parent{
    int age;

    @Override
    void display() {
        System.out.println("sub class is running !");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new child(); // upcasted object
        p.name = " Ashen";
        child c = (child) p ; // down casted object
        c.age = 21;
        System.out.println(c.name);
        System.out.println(c.age);
    }
}
