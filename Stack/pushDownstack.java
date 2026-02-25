package Stack;

import java.util.Stack;

public class pushDownstack {
    public static void PushatLast(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushatLast(data, s);
        s.push(top);
    }
      public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);

        PushatLast(4, s);

        while(!s.isEmpty()){
            System.out.println(s.get(s.size()-1));//"peek()" refers to an operation that returns the value of the element at the top of the stack without removing it
            s.pop();
        }
    }
}
