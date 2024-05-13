package BinaryTree;

public class Test {
    public static void main(String[] args){

        BinaryTree btree = new BinaryTree();
        btree.createBinaryTree();
        System.out.println("PreOrder");
        btree.preOrder(btree.root);
        System.out.println();
        System.out.println("inOrder: ");
        btree.inOrder(btree.root);
        System.out.println();
        System.out.println("postOrder: ");
        btree.postOrder(btree.root);
        System.out.println();
        btree.findMax(btree.root);


    }
}
