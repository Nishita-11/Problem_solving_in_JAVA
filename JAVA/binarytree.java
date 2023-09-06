public class binarytree {


    // Full Binary Tree:
    // A Binary Tree is a full binary tree if every node has 0 or 2 children.


    // Complete Binary Tree:-
    // A Binary Tree is a Complete Binary Tree if all the levels are completely filled except possibly the last level 
    //    and the last level has all keys as left as possible.


    // Perfect Binary Tree:-
    // A Binary tree is a Perfect Binary Tree in which all the internal nodes have two children and all leaf nodes are at the same level. 


    // A degenerate or pathological tree is the tree having a single child either left or right.
    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }

        public Node() {
        }
    }

        static Node root = new Node();
    public static void main(String[] args) {

        Node tree = new Node(5);

        tree.left = new Node(3);
        tree.right = new Node(4);

        tree.left.right = new Node(2);

        System.out.println("root "+tree.data);
        System.out.println("root left"+tree.left.data);
        System.out.println("root right"+tree.right.data);
        System.out.println("root left right"+tree.left.right.data);
        
    }
}
