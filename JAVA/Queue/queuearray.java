
// 1. What data structure can be used to implement a priority queue?
// Priority queues can be implemented using a variety of data structures, including linked lists, arrays, binary search trees, and heaps. 
// Priority queues are best implemented using the heap data structure.


// 4. What is better, a stack or a queue?
// If you want things to come out in the order you put them in, use a queue. Stacks are useful when you want to reorder things after putting them in. 


// When a resource is shared among multiple consumers. Examples include CPU scheduling, Disk Scheduling. Queues are used


public class queuearray {


    // from front end deletion takes place [has first element index]
    // from rear end insertion takes place [has last element index]
    static class Queue{
        int front,rear,size;
        int capacity;
        int[] arr;

     }

     static Queue createqueue(int n){
        Queue queue = new Queue();
        queue.capacity = n;
        queue.front = 0;
        queue.rear = n-1;
        queue.size = 0;
        queue.arr = new int[n];

        return queue;

     }

     static boolean isFull(Queue q){
        return (q.size == q.capacity);
     }

     static boolean isEmpty(Queue q){
        return (q.size == 0);
     }

     static void enqueue(Queue q,int d){
        if(isFull(q)){
            return;
        }

        q.rear = (q.rear+1)%(q.capacity);
        q.arr[q.rear] = d;
        q.size = q.size+1;

        System.out.println(d+" enqueued");
     }

     static void dequeue(Queue q){
        if(isEmpty(q)){
            return ;
        }

        int i = q.arr[q.front];
        q.front = (q.front+1) % (q.capacity);
        q.size = q.size - 1;
        System.out.println(i+" dequeued");
     }

     static int front(Queue q){
        if(isEmpty(q)){
            return -1;
        }
        return q.arr[q.front];
    }

    static int rear(Queue q){
        if(isFull(q)){
            return -1;
        }

        return q.arr[q.rear];
    }


    public static void main(String[] args) {

        Queue q = createqueue(10);

        enqueue(q, 14);
        enqueue(q, 11);
        enqueue(q, 23);
        enqueue(q, 21);
        System.out.println(front(q));
        System.out.println(rear(q));
        
        
        
        dequeue(q);
        System.out.println(front(q));

        
        
    }
}
