
interface Animal{
   public void walk();
   
}
interface Herbivore{
    void grass();
}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("It has 4 legs.");
    }
    public void grass(){
        System.out.println("It only eats grass.");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.grass();
    }
}
