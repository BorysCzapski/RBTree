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

}


public class Main {
    public static void main(String[] args) {

        System.out.printf("Red-Black Tree: ");

    }
}