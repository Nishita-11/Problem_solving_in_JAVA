

class Node{
    int data;
    Node left, right;

    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}




public class LCA3c {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        System.out.println(findLCA(root,7,6).data);

 
    }
    static Node findLCA(Node node, int n1, int n2){
        if(node == null)
            return null;
    
        if(node.data == n1 || node.data == n2)
            return node;
    
        Node leftst = findLCA(node.left, n1, n2);
        Node rightst = findLCA(node.right, n1, n2);
        
        if(leftst != null && rightst != null)
            return node;
    
        return (leftst == null)? rightst : leftst;
    }
    
}
