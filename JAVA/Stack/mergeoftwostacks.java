

class Node{
    int data;
    Node pre;
    Node next;

    Node(int d){
        data = d;
        pre = null;
        next = null;
    }
}

class Stack{
 
    private Node head;
    private Node tail;
     
    
    Stack()
    {
        head = null;
        tail = null;
    }

    void push(int d){
        Node newnode  = new Node(d);
        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next=null;
            tail.pre = null;

        }
        else{
            head.next = newnode;
            newnode.pre = head;
            head = newnode;

        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack underflow");
        }

        if(head == tail){
            head = tail = null; 
        }

        head = head.pre;
        head.next = null;
    }

    public void merge(Stack s2){
        

        tail.pre = s2.head;
        s2.head.next = tail;
        tail = s2.tail;
        s2.head = null;
        s2.tail = null;

    }

    public void display(){
   
    if(head != null)
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.pre;
        }
        System.out.println();
    }
    else
    {
        System.out.println("Stack Underflow");
    }
}
}


public class mergeoftwostacks {

    public static void main(String[] args) {
        
        Stack s1 = new Stack();
        s1.push(6);
        s1.push(5);
        s1.push(4);

        Stack s2 = new Stack();
        s2.push(9);
        s2.push(8);
        s2.push(7);


        s1.merge(s2);
        // System.out.println("POPING");
        // s1.pop();
        s1.display();
        
    }
}
