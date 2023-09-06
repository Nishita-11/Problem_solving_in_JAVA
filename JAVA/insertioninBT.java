import java.util.LinkedList;
import java.util.Queue;

public class insertioninBT {

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }

        public Node() {
        }
    }

    static void inorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static void insertion(Node root,int d){
        Node temp = root;

        if(root == null){
            root = new Node(d);
            return;
        }

        Queue<Node> q = new LinkedList<Node>() ;
        q.add(temp);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();
            if(temp.left == null){
                temp.left = new Node(d);
                break;
            }
            else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(d);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        
        //System.out.println(root.data);
        insertion(root, 4);

        insertion(root, 3);

        insertion(root, 2);

        inorder(root);
    }
}
