import java.util.Stack;

public class middleofthestack {

    static Stack<Integer> stack = new Stack<>(); 

    static void fill(int x, int i, int n){
        if(i != (n/2)){
            stack.push(x);

        }
    }

    static void callstack(int n, int i){
        if(!stack.isEmpty()){
            int x=stack.peek();
            i--;
            stack.pop();
            callstack(n, i);
            
             fill(x,i,n);
            
        }
    }
    public static void main(String[] args) {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        
        callstack(stack.size(), stack.size());

        System.out.println(stack);
        
    }
}
