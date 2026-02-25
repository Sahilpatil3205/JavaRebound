package OOPs;
//singlelevel
class Shape{
    public void area(){
        System.out.println("Parent class");
    }

}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Area of Triangle is " +0.5*l*h);
    }
}
//multilevel inheritance
class Equitriangle extends Triangle{       //----This all is m=hybrid inheritance
    public void area(int l,int h){
        System.out.println("Area of Equilateral Triangle is " +0.5*l*h);
    }
}
//hiearchical inheritance
class Square extends Shape{
    public void area(int l){
        System.out.println("Area of Square is " +l*l);
        }
        }
public class Inheritance {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        Equitriangle et=new Equitriangle();
        Square s=new Square();
        t.area(10,20);
        et.area(5,6);
        s.area(5);

    }
    
}
