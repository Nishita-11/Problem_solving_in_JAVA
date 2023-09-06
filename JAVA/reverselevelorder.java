
    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Stack;

public class reverselevelorder {

   
/* A binary tree node has data, pointer to left and right children */
static class Node 
{
    int data;
    Node left, right;
   
    Node(int item) 
    {
        data = item;
        left = right;
    }
}

static Node root;

static void reverse(Node root){
    Queue<Node> q = new LinkedList<>();
    Stack<Integer> s = new Stack<>();

    q.add(root);

    while(!q.isEmpty()){
        Node temp = q.peek();
        q.remove();

        s.push(temp.data);

        if(temp.right != null){
            q.add(temp.right);
        }

        if(temp.left != null){
            q.add(temp.left);
        }
    }

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }




}

   
    public static void main(String[] args) {

         root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        
         reverse(root);
    }
}
