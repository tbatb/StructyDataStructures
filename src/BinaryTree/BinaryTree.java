package BinaryTree;

import Stack.MyStack;

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
     * Traverse the left subtree in In order fashion. Visit the root node. Print it.
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
     * This method searches for a given key in the binary tree.
     *
     * @param root
     * @param key
     * @return the key in binary tree, if it exists.
     */
    public TreeNode search(TreeNode root, int key){
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * This methods removes the minimum key in the binary tree.
     */
    public void removeMinimum(){
        if (root == null) {
            return;
        }

        TreeNode current = root;
        TreeNode parent = null;
        int result = root.data;

        while (current.left != null) {
            parent = current;
            current = current.left;
        }
        result = current.data;

        if (parent == null) {
            root = root.right;
        } else {
            parent.left = current.right;
        }

    }

    /**
     * Given the root of a binary search tree, determine if it is valid binary search tree (BST).
     * A valid BST is defined as follows:
     * <p>
     * 1. The left subtree of a node contains only nodes with keys less than the nodes key.<p>
     * 2. The right subtree of a node contains only nodes with keys greater than the nodes key. <p>
     * 3. Both the left and right subtrees must also be binary search trees.
     *
     * @param root
     * @param min
     * @param max
     * @return True if the tree is a binary search tree.
     */
    public boolean isValidTree(TreeNode root, long min, long max){
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }

        boolean left = isValidTree(root.left, min, root.data);
        if (left) {
            boolean right = isValidTree(root.right, root.data, max);
            return right;
        }
        return false;
    }


    class TreeNode {
        private int data; //Generic Type
        private TreeNode left, right;

        public TreeNode(int data){
            this.data = data;
        }
    }
}
