package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Binarytree {
    /**
     * This class contains programmatic solutions to the binary tree.
     * It covers functions/methods like adding, deleting, searching, exchanging, tree sum, tree min value, tree pathfinder
     * leaf list, level averages, tree levels etc.
     */

    /**
     * A binary has one root and two children. So we will create left and right. And it also stores some value
     * like any other DS.
     *
     * @param <T>
     */
    public class TreeNode<T> {
        T val;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public void run(){
        TreeNode<String> a = new TreeNode<>("a");
        TreeNode<String> b = new TreeNode<>("b");
        TreeNode<String> c = new TreeNode<>("c");

        a.left = b;
        a.right = c;
        System.out.println(a.left.val);

    }

    /**
     * Depth First Traversal Problem: Our method, depthFirstValues, takes in the root of a binary tree.
     * It will add all values onto a seperate list.
     *
     * @param root
     * @return The method should return a list containing all values of the tree in depth-first order.
     * Time O(n), Space O(n)
     */
    /*
    public static List<String> depthFirstValues(TreeNode<String> root){
        ListStack stack = new ListStack();
        stack.push(root.toString());
        List<String> values = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            values.add(current.value)
            return null;
        }

        return values;
    }

     */
    public static List<String> depthFristValueswithStack(TreeNode<String> root){

        Stack<TreeNode<String>> stack = new Stack<>();
        stack.push(root);
        List<String> values = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode<String> current = stack.pop();
            values.add(current.val);
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return values;
    }


}




