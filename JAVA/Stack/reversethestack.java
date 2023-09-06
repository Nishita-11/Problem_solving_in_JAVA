import java.util.Stack;



public class reversethestack {

    static Stack<Integer> stack = new Stack<>();

    static void insertBottom(int x){
        if(stack.isEmpty()){
            stack.push(x);
        }
        else{
            int a = stack.peek();
            stack.pop();
            insertBottom(x);

            stack.push(a);
        }

    }

    static void reverse(){
        if(!stack.isEmpty()){
            int x = stack.peek();
            stack.pop();
            reverse();

            insertBottom(x);
        }


    }
    public static void main(String[] args) {
        

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse();
        System.out.println(stack);
    }
}
