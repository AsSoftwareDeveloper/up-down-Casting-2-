public class Human {
    void printData(){
        System.out.println("Method of super Class");
    }
}
class Man extends Human{
    @Override
    void printData() {
        System.out.println("Method 0f sub Class");
    }
}
class Test{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Man();
        h.printData();
        h1.printData();
    }
}