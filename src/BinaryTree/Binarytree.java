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
     * It will add all values into a separate list. NOT WORKING ATM
     *
     * @param root
     * @return The method should return a list containing all values of the tree in depth-first order.
     * Time O(n), Space O(n)
     */

    public static List<String> depthFirstValues(TreeNode<String> root){
        //TODO:using java frameworks is not allowed in the EP2 Test1, so still need to ADD own STACK, QUEUE DS.
        ListStack stack = new ListStack();
        stack.push(root.toString());
        List<String> values = new ArrayList<>();
        while (!stack.isEmpty()) {
            //TreeNode current = stack.pop();
            //values.add(current.value)
            return null;
        }

        return values;
    }


    /**
     * This methods takes in the root of a binary tree and traverses the tree using depth first order.
     *
     * @param root
     * @return This method should return a List containing all values of the tree in depth-first order.
     */
    public static List<String> depthFristValueswithStack(TreeNode<String> root){
        if (root == null) {
            return List.of();
        }

        List<String> values = new ArrayList<>();
        Stack<TreeNode<String>> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode<String> current = stack.pop();
            values.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return values;
    }

    /**
     * Base case returns an empty List. root.left, here we have to think what the call should return, the same
     * for root.right. Root.left should return a list of nodes in depth first order [b, d, e], root.right [c,f].
     * Next we must create a List, which also contains the root - root.val.
     *
     * @param root
     * @return A list of all nodes in the binary tree using the depth first order traversal algorithm.
     */
    public static List<String> RecursiveDepthFristValueswithStack(TreeNode<String> root){
        if (root == null) {
            return List.of();
        }

        List<String> leftVals = RecursiveDepthFristValueswithStack(root.left);
        List<String> rightVals = RecursiveDepthFristValueswithStack(root.right);
        List<String> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(leftVals);
        result.addAll(rightVals);

        return result;
    }

    //             a!
    //           /   \
    //          b     c
    //         / \     \
    //        d   e     f
    public static void main(String[] args){

    }

}




