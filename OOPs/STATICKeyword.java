class Student {
    String name;
    static String school;


    public static void changeSchool(){
        school = "New School";
    }
}
public class STATICKeyword{
    public static void main(String[] args) {
        Student.school = "NMIET";
        // it is class thing not object
        //those are those things which are common to all
        Student s = new Student();
        s.name = "Sahil";
        System.out.println("School name is "+Student.school);
        Student.changeSchool();
        System.out.println(Student.school);
        
    }
}
// class StaticTest {

//     // non-static method
//     int multiply(int a, int b){
//         return a * b;
//     }

//     // static method
//     static int add(int a, int b){
//         return a + b;
//     }
// }

// public class Main {

//    public static void main( String[] args ) {

//         // create an instance of the StaticTest class
//         StaticTest st = new StaticTest();

//         // call the nonstatic method
//         System.out.println(" 2 * 2 = " + st.multiply(2,2));

//         // call the static method
//         System.out.println(" 2 + 3 = " + StaticTest.add(2,3));
//    }
// }