import java.util.LinkedList;
import java.util.Queue;

public class childrensumproperty {
    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }


    static Node root;

    static void check(Node root){
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        int f=1;

        while(!q.isEmpty()){

            if((root.left != null && root.right == null)){
                if(root.left.data == root.data){
                    q.remove();
                    q.add(root.left);
                    //q.add(root.right);
    
                    root = q.peek();
                }
                else{
                    f=0;
                    break;
                }
            }


            if((root.left == null && root.right != null)){
                if(root.right.data == root.data){
                    q.remove();
                    //q.add(root.left);
                    q.add(root.right);
    
                    root = q.peek();
                }
                else{
                    f=0;
                    break;
                }

                
            }


            if(root.left != null && root.right != null){
                if(root.left.data + root.right.data == root.data){
                    q.remove();
                    q.add(root.left);
                    q.add(root.right);
    
                    root = q.peek();
                }
                else{
                    f=0;
                    break;
                }

            }
            else{
               q.remove();
                continue;
            }
            

            
        }

        if(f==1){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
       // root.right.right = new Node(6);

        check(root);
    }
}
