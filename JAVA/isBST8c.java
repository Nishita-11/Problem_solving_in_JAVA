class Node{
    int data;
    Node left,right;

    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}

static Node prev;

static boolean isBST(Node root){
    if(root != null){
        if(!isBST(root.left)){
            return false;
        }
        if (prev != null && root.data <= prev.data)
            return false;
 
        prev = root;
 
        return isBST(root.right);
    }
    return true;
}




public class isBST8c {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left =new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.left = new Node(11);
        root.right.right = new Node(19);

        System.out.println(isBST(root));
    }
}
