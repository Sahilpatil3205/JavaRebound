package Stack;

import java.util.Stack;

public class Stacksusngframework {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());//"peek()" refers to an operation that returns the value of the element at the top of the stack without removing it
            s.pop();
        }
    }
}
