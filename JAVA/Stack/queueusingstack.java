import java.util.Stack;


// Time complexity
// Push = O(n)
// Pop = O(1)
public class queueusingstack{

    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();

    void enqueue(int d){
        while(!s1.empty()){
            s2.push(s1.pop());

        }
        s1.add(d);
        while(!s2.empty()){
            s1.push(s2.pop());
            
        }

    }

    void dequeue(){
        System.out.println(s1.pop());
    }
    public static void main(String[] args) {
        
        queueusingstack q = new queueusingstack();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.dequeue();
        q.dequeue();
    }
}