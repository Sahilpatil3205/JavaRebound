package Linklist;

public class LL {
    Node head;

    private int size;
    LL(){
        this.size=0;
    }

    // initialize


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // addfirst
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // addlast
    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }

        currNode.next = newNode;

    }

    //deletefirst
    void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //deletelast
    void deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return;

        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }

        secondlast.next=null;


    }

    public int getsize(){
        return size;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addFirst("this");
        list.printlist();

        list.addLast("list");
        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();

    System.out.println(list.getsize());
    list.addFirst("This");
    System.out.println(list.getsize());
    }
}
