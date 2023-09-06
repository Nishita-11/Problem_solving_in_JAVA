

public class priorityqusinglist {

    static class Node{
        int data;
        int priority;

        Node next;

        Node(int data,int priority){
            
            this.data = data;
            this.priority = priority;
    
            this.next = null;
        }

       
    }

    // static Node node = new Node();

    // static Node newNode(int data,int priority){
    //     Node temp = new Node();
    //     temp.data = data;
    //     temp.priority = priority;

    //     temp.next = null;
    //     return temp;

    // }

    static Node push(Node pq, int d, int p){

        Node newnode = new Node(d, p);
        Node temp = (pq);

        
        

        if((pq).priority > p){
            newnode.next = pq;
            (pq) = newnode;
        }
        else{
            while(temp.next != null && temp.next.priority < p ){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        return pq;
       // System.out.println(pq.data);
    }

    static Node pop(Node head){
        head = head.next;
        System.out.println(head.data);
        return head;
    }

    static int peek(Node head){
        return head.data;
    }

     static int isEmpty(Node pq) {
        return (pq == null)? 1:0;
    }

    public static void main(String[] args) {

        Node pq = new Node(4, 1);
        //System.out.println(pq.data);
        pq=push(pq, 5, 2);
        //System.out.println(pq.next.data);
       
        pq=push(pq, 6, 3);
        pq=push(pq, 7, 0);
        //push(pq, 12, 4);

        while (isEmpty(pq)==0) {
            System.out.println(peek(pq));
            
            pq=pop(pq);
        }

        // pop(pq);

        
        
        
    }

    
}
