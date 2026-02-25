package OOPs;

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("We are creating a animal.");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("This is a Horse");
    }
    public void walk(){
        System.out.println("Has 4 legs.");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("This is a Chicken");
    }
    public void walk(){
        System.out.println("Has 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
    Horse h=new Horse();

    Chicken c=new Chicken();
    h.walk();
    c.walk();







    }
}
