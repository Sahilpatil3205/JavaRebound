package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
    
    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

    } 
}

/*
This is because Queue is an interface in Java, and interfaces cannot be instantiated directly.

Key Difference:
Queue<Integer> q = new Queue<Integer>();

Invalid: This will cause a compile-time error since Queue is an interface. Interfaces only define the methods
 that a class implementing the interface must override. You need to use a concrete class that implements the Queue interface.

Queue<Integer> q = new LinkedList<Integer>();

Valid: LinkedList is a concrete class that implements the Queue interface. 
Therefore, you can use it to create an instance and store it in a Queue reference.

 */
