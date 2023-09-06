import java.util.HashMap;

public class replacenodewithinorderpresuc {

    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    static Node root;
    //static int[] arr = new int[8];
    static HashMap<Integer,Integer> indexmap = new HashMap<>();
    static HashMap<Integer,Integer> valmap = new HashMap<>();
    static int i=1;

    static void storeinorder(Node root){
        if(root == null){

            return;
        }

        storeinorder(root.left);
        valmap.put(root.data,i);
        indexmap.put(i, root.data);
        // arr[i] = root.data;
        i++;
        storeinorder(root.right);


    }

    static void inorder(Node root){
        if(root == null){

            return;
        }

        inorder(root.left);
        int m = valmap.get(root.data);
        System.out.print(root.data+"-->");
            root.data = indexmap.get(m+1) + indexmap.get(m-1);

        System.out.println(root.data);
        
        inorder(root.right);

    }

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        //arr[0] = arr[8] = 0;
        indexmap.put(0, 0);
        indexmap.put(8, 0);

        storeinorder(root);

        

        inorder(root);
        


        

    }
}
