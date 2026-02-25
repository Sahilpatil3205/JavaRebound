package Linklist;

import java.util.*;

public class LLUSINGcollectionframework {
    public static void main(String[] args) {
        
    LinkedList<String> list=new LinkedList<String>();

    list.addFirst("is");
    list.addFirst("this");
    System.out.println(list);

    list.addLast("a");
    list.add("list");
    System.out.println(list);

    System.out.println(list.size());

    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"->");
    }
    System.out.println("Null");

    Collections.reverse(list);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"->");
    }
    System.out.println("Null");

//     list.addFirst("this");
//     System.out.println(list);

//     list.remove(1);
//     System.out.println(list);
}

}
