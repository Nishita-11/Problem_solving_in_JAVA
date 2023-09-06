public class queueusinglist {

    // Input Restricted Queue
    // This is a simple queue. In this type of queue, the input can be taken from only one end but deletion can be done from any of the ends.
    
    
    // Double-Ended Queue (Deque)
    // In a double-ended queue the insertion and deletion operations, both can be performed from both ends.


    // Priority Queue
    // A priority queue is a special queue where the elements are accessed based on the priority assigned to them.
    
    static class Qnode{
        int data;
        Qnode next;

        Qnode(int data){
            this.data = data;
            next = null;
        }
    }

    static class Queue{
        Qnode front, rear;

        Queue(){
            this.front=null;
            this.rear=null;
        }

    }
    public static void main(String[] args) {

        Queue q = new Queue();
        Qnode newnode = new Qnode(5);

        q.rear = newnode;
        q.front = newnode;

        System.out.println(q.front.data);
        
    }
}
