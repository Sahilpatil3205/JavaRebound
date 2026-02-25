class Animal{
    String name;
    Animal(){
        System.out.println("Animal called.");
    }
}
class Horse extends Animal{
    Horse(){
        // super();
        super.name="Sahil";
        System.out.println("Horse called");
}
}
public class superkeyword {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.name);
    }
}
