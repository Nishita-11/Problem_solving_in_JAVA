import java.util.LinkedList;
import java.util.Queue;

public class cousinnodes {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
static Node root;


static int level(Node root, Node a){
    Queue<Node> q = new LinkedList<>();

    int f = 0 ;
    int level = 0;
    q.add(root);
    q.add(null);
    Node temp;

    while(!q.isEmpty()){
        while(q.peek() != null){
            temp = q.peek();
            q.remove();
            if(temp.left == a || temp.right ==a){
                f = 1;
                break;
                
            }
            
            if(temp.left == null || temp.right == null)
                continue;

            q.add(temp.left);
            q.add(temp.right);
        }
        if(f == 1){
            break;
        }
        else{
            q.remove();
            q.add(null);
            level++;
        }
        

    }
    if(f==1){
        System.out.println(level+1);
        return level+1;
    }
    else 
        return 0;
}

static boolean sibiling(Node root, Node a, Node b){
    if(root == null)
        return false;
    
    return ((root.left == a && root.right == b) || (root.left == b && root.right == a) || sibiling(root.left, a, b) || sibiling(root.right, a, b));
}

static boolean isCousin(Node root, Node a, Node b){
    return (level(root, a) == level(root, b) && !sibiling(root, a, b));
}
    public static void main(String[] args) {
          root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.left.right.right = new Node(15);
          root.right.left = new Node(6);
          root.right.right = new Node(7);
          root.right.left.right = new Node(8);
 
        Node Node1, Node2;
        Node1 =   root.left.left;
        Node2 =   root.right.right;

        if (isCousin(root, Node1, Node2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
