import java.util.Stack;


public class sortstack {

    static Stack<Integer> stack = new Stack<>();

    static void sorting(int x){
        if(stack.isEmpty() || x > stack.peek()){
            stack.push(x);
            return;
        }
        
            int a = stack.pop();
            sorting(x);
            stack.push(a);
        

    }

    static void callstack(){

        if(!stack.isEmpty()){
        int x = stack.peek();
        stack.pop();

        callstack();

        sorting(x);
        }
    }
    public static void main(String[] args) {

        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        // prints from bottom to top
        System.out.println(stack);

        callstack();
        System.out.println(" after sorting : "+stack);


        
    }
}
