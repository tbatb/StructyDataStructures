package BinaryTree;

import Stack.MyStack;
import com.sun.source.tree.Tree;

public class BinaryTree {
    /*
    A tree is a non-linear data structure. It contains nodes and edges. No cycle!
    Each node in a tree can point to n number of nodes in a tree.
    The parent node is of a node is its predecessor, which is to be found on a lower Layer.
    A tree contains leaves, which are just like the word states, the last nodes of the last Layer.

                      root --> a
                              /  \
                             b     c
                            / \   / \
                           d   e  f  g

              null <-- left | data | right --> null
     Operations: adding left & right, deleting a node, searching at an index,
     */
    public TreeNode root;

    /**
     * Creates binary tree and assigns first to root, frist.left to second, first.right to third.
     * second <-- first --> third
     */
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    /**
     * Visit the root node, Traverse the left subtree in Pre order fashion.
     * Traverse the right subtree in Pre order fashion.
     *
     * @param root
     */
    public void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * Traverse the left subtree in In order fashion. Visit the root node.
     * Traverse the right subtree in IN order fashion.
     *
     * @param root
     */
    public void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    /**
     * Traverse the left subtree in Post order fashion
     * Traverse the right subtree in Post order fashion.
     *
     * @param root
     */
    public void postOrder(TreeNode root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    /**
     * This methods looks for the maximum value in the Tree.
     * Store each root to result and compare the left and right of it to the result.
     *
     * @param root
     * @return
     */
    public int findMax(TreeNode root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result)
            result = left;
        if (right > result)
            result = right;

        return result;
    }

    /**
     * This method inserts a value into a tree.
     * Since it is a binary, the algorithm will add smaller values to the left and
     * bigger values to the right.
     *
     * @param root
     * @param value
     * @return
     */
    public TreeNode insert(TreeNode root, int value){
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    /**
     *
     */
    public void removeMinimum(){
        if (root == null) {
            return;
        }

        TreeNode current = root;
        TreeNode parent = null;
        int result = root.data;

    }


    class TreeNode {
        private int data; //Generic Type
        private TreeNode left, right;

        public TreeNode(int data){
            this.data = data;
        }
    }
}
