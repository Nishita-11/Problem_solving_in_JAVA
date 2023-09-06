import java.util.Stack;

public class zigzagBT{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

static Node root;


static void printspiral(Node root){

    if(root == null){
        return;
    }

    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();

    s2.push(root);

    while(!s1.isEmpty() || !s2.isEmpty()){
        while(!s2.isEmpty()){
            Node temp = s2.peek();
            s2.pop();
            System.out.println(temp.data+" ");

            if(temp.left != null){
                s1.push(temp.left);
            }

            if(temp.right != null){
                s1.push(temp.right);
            }

            
        }

        while(!s1.isEmpty()){
            Node temp = s1.peek();
            s1.pop();
            System.out.println(temp.data+" ");

            if(temp.right != null){
                s2.push(temp.right);
            }

            if(temp.left != null){
                s2.push(temp.left);
            }

           
        }
    }

} 

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        printspiral(root);
    }
}
