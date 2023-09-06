import java.util.LinkedList;
import java.util.Queue;

// Class containing left and right child
// of current node and key value



public class binarytrees {

    static class Node{
        int data;
        Node left, right;
    
        public Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;


    //inorder traversal
    static void inorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


    // Insertion
    // Time Complexity:  O(V) where V is the number of nodes.
    // Auxiliary Space: O(B), where B is the width of the tree and in the worst case we need to hold all vertices of a level in the queue.
    static void insertion(Node temp2, int d){

        if(temp2 == null){
            temp2 = new Node(d);
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(temp2);
        

        while(!q.isEmpty()){
            
            temp2 = q.peek();
            q.remove();


            if(temp2.left == null){
                Node temp1 = new Node(d);
                temp2.left = temp1;
                break;
            }
            else{
                q.add(temp2.left);
            }

            if(temp2.right == null){
                Node temp1 = new Node(d);
                temp2.right = temp1;
                break;
            }
            else{
                q.add(temp2.right);
            }
        }
        
    }
   

    //constructors
    binarytrees(int d){
        root = new Node(d);
    }

    binarytrees(){
        root = null;
    }
    public static void main(String[] args) {
        binarytrees tree = new binarytrees();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        binarytrees.root.left.left = new Node(4);

        //System.out.println(root.data);
        inorder(root);
        insertion(root, 12);
        System.out.println("After insertion");
        inorder(root);
    }
}
