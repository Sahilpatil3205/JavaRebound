package OOPs;

class Pen{
    String color;
    String name;

    public void printcolor(){
        System.out.println(this.color);

    }
    public void write(){
        System.out.println(this.name);
    }
}

public class classesandobjects {

    public static void main(String[] args) {
        Pen pen1=new Pen();
        Pen pen2=new Pen();
        pen1.color="black";
        pen1.name="gel";
        pen2.color="pink";
        pen2.name="ballpoint";

        pen1.printcolor();
        pen1.write();
        pen2.printcolor();
        pen2.write();
        
    }
}
