import java.util.LinkedList;
import java.util.Queue;

public class continousBT {

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


    static int check(Node root){
        Node temp = root;
        if(root == null){
            return 0;
        }
        int flag = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();
            if(temp.left != null){
                if((temp.left.data - temp.data != 1 && temp.left.data - temp.data != -1)){
                    flag=0;
                    break;
                }
                else{
                    q.add(temp.left);
                    
                }
            }

            if(temp.right != null){
                if(temp.right.data - temp.data != 1 && temp.right.data - temp.data != -1){
                    flag=0;
                    break;
                }
                else{
                    q.add(temp.right);
                }
            }
        }

        if (flag != 0)
            return 1;
        else
            return 0;

    }
    public static void main(String[] args) {
         Node root = newNode(3);
        root.left     = newNode(2);
        root.right     = newNode(4);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.right = newNode(5);

        if(check(root) == 1){
            System.out.println("continous");
        }else 
            System.out.println("Non continous");

        }
}
