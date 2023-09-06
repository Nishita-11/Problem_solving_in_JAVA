import java.util.LinkedList;
import java.util.Queue;


public class foldableBT {

    static class Node
    {
        int data;
        Node left, right;
    }

    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return(node);
    }

    static boolean fold(Node root){
        if(root == null){
            return true;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            Node l = q.remove();
            Node r = q.remove();

            if(l == null && r == null)
                continue;

            if(l == null && r != null || l != null && r == null)
                return false;

            q.add(l.left);
            q.add(r.right);
            q.add(l.right);
            q.add(r.left);
        }

        return true;
        


    }

    public static void main(String[] args) {

        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.right.left = newNode(4);
        root.left.right = newNode(5);

        if(fold(root))
            System.out.println("Foladable");
        else
            System.out.println("Not foldable");
        
       
    }
}
