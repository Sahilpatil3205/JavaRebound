
class Student {
    public String name;          // Public access
    protected String email;      // Protected access
    private String password;     // Private access
    int age;                     //default access

    // Getter for the password
    public String getpassword() {
        return this.password;
    }

    // Setter for the password
    public void setpassword(String password) {
        this.password = password;
    }
}

public class Accessmodify{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sahil";                             // Public access: no restrictions
        s.age=20;
        System.out.println(s.age);
        System.out.println(s.name);
        s.email = "sahilpatil@gmail.com";             // Protected access: allowed in the same package
        System.out.println(s.email);
        s.setpassword("I am groot");                 // Setting the private field using a setter
        System.out.println("Password: " + s.getpassword()); // Getting the private field using a getter
    }
}

