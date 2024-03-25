//Enum for possible colors for RBTree Nodes
enum NodeColor{
    red, black
}
//Class for RBTreeNode
class RBTreeNode{
    public int key,value; //key and value declaration
    public RBTreeNode left,right,parent; //Left, Right child and Parent Node declaration for a single RBTreeNode
    public NodeColor color; //Color variable that uses data from enum NodeColor

    public RBTreeNode(int key, int value){ //Constructor for RBTree class that sets default values for key and value
        this.key = key;
        this.value = value;
        this.left = null; //Left and right child are default nulls, also parents
        this.right = null;
        this.parent = null;
        this.color = NodeColor.red; //Every new node is red
    }
}
//Class for RBTree
class RBTree {
    private RBTreeNode rootNode; // Declaration of root node and a null node for our node
    private RBTreeNode nullNode;

    public RBTree(){ //Constructor that sets a NIL node (for not having an empty node, rather for having it with NIL value), very important for the root nod of the tree
        RBTreeNode nilNode = new RBTreeNode(0, 0); // a nil node is like a null node, empty but it exists
        nilNode.color = NodeColor.black; //Every null(NIL) node is black
        this.nullNode = nilNode; //So a null node is actually a node with key and value equal to 0
        this.rootNode = this.nullNode; //The root is now a null node (which is NIL), important note: the root color is black now
    }

    public void rotateL(RBTreeNode x){ //Left rotate method, used when there are two consecutive red nodes, and second node is right child
        //X represents existing node, higher in the tree, Y is the lower node that will swap places with X
        RBTreeNode y = x.right; // Y is right child of X
        x.right = y.left; // After the rotation Y's left child will be X right child
        if (y.left != this.nullNode){ //Check if Y's left child is not null
            y.left.parent = x; //Y's left child parent after rotation will be X
        }
        y.parent = x.parent; // X will swap places with Y
        if (x.parent == this.nullNode){ //Check if X is the root
            this.rootNode = y;
        }
        else if (x == x.parent.left){ //Check if the X is left or right child
            x.parent.left = y;
        }else{
            x.parent.right = y;
        }
        y.left = x; //After rotation Y's left child is X
        x.parent = y; //After rotation X's parent is Y
    }
    
    public void rotateR(RBTreeNode x){ //Right rotate method, used when there are two consecutive red nodes, and second node is left
        //X represents existing node, higher in the tree, Y is the lower node that will swap places with X
        RBTreeNode y = x.left; // Y is left child of X
        x.left = y.right; // After the rotation Y's right child will be X left child
        if (y.right != this.nullNode){ //Check if Y's right child is not null
            y.right.parent = x; // Y's right child parent after rotations is X
        }
        y.parent = x.parent; //For swapping places note: Line 68 - complete swap
        if (x.parent == this.nullNode){ //Check if X is the root
            this.rootNode = y;
        } else if (x == x.parent.right){ // Check if X is the right or left child
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x; // Y's right child after rotation is X
        x.parent = y; // Swap places
    }

}


public class Main {
    public static void main(String[] args) {

        System.out.printf("Red-Black Tree: ");

    }
}
