

public class sumofcoveredanduncovered{

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

static int ST(Node n){
    if(n == null)
        return 0;

    return n.data + ST(n.left) + ST(n.right);
}

static int SUCL(Node n){
    if(n == null){
        return 0;
    }

    if(n.left != null){
        return n.data + SUCL(n.left);
    }
    else 
        return n.data + SUCL(n.right);
}

static int SUCR(Node n){
    if(n == null){
        return 0;
    }

    if(n.right != null){
        return n.data + SUCR(n.right);
    }
    else 
        return n.data + SUCR(n.left);
}


static int SUC(Node n){


    int ls=0,rs=0;

    ls = SUCL(root.left);

    rs = SUCR(root.right);

    return ls+rs+n.data;
}


static void check(Node root){
    int sumUnCovered = SUC(root);

    int total = ST(root);

    if(sumUnCovered == (total - sumUnCovered))
        System.out.println("True");
    else
        System.out.println("False");
}


    public static void main(String[] args) {
          root = new Node(8);
          root.left = new Node(3);
          root.left.left = new Node(1);
          root.left.right = new Node(16);
          root.left.right.left = new Node(4);
          root.left.right.right = new Node(7);
 
          root.right = new Node(6);
          root.right.right = new Node(7);
         root.right.right.right = new Node(2);

        check(root);
 
    }
}