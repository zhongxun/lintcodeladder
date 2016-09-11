/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class FindLCASolution {

    public class Node {

        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node findLCA(Node root, int a, int b) {
        if (root == null) {
            return null;
        }

        if (root.val == a || root.val == b) {
            return root;
        }

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        if (right != null) {
            return right;
        }

        return null;
    }

    public static void Test() {
        FindLCASolution f = new FindLCASolution();
        Node node = f.new Node(1);
        node.right = f.new Node(2);

        Node result = f.findLCA(node, 2, 5);       
        System.out.println(node);
    }
}
