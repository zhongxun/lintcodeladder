/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

//import java.util.Map.Entry;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author v-xuzhon
 */
public class TrieSerialization {

    class TrieNode {

        public NavigableMap<Character, TrieNode> children;

        public TrieNode() {
            children = new TreeMap<Character, TrieNode>();
        }
    }

    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a trie which denote by a root node to a string which can be
     * easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TrieNode root) {
        // Write your code here
        String s = "<";

        // for lintcode OJ, need to be like for (Map.Entry<Character, TrieNode> c : root.children.entrySet()) {
        for (Entry<Character, TrieNode> c : root.children.entrySet()) {
            s = s + c.getKey().toString() + serialize(c.getValue());
        }

        s = s + ">";
        return s;
    }

    /**
     * This method will be invoked second, the argument data is what exactly you
     * serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TrieNode deserialize(String data) {
        // Write your code here
        if (data == null || data.length() == 0) {
            return null;
        }

        TrieNode root = new TrieNode();
        TrieNode current = root;
        Stack<TrieNode> path = new Stack<TrieNode>();
        for (Character c : data.toCharArray()) {
            switch (c) {
                case '<':
                    path.push(current);
                    break;
                case '>':
                    path.pop();
                    break;
                default:
                    current = new TrieNode();
                    path.peek().children.put(c, current);
            }
        }

        return root;
    }

    private void T() {
        TrieNode root = new TrieNode();
        root.children.put('a', new TrieNode());
        TrieNode c = root.children.get('a');
        c.children.put('b', new TrieNode());
        c.children.put('c', new TrieNode());
        c.children.put('d', new TrieNode());
        TrieNode b = c.children.get('b');
        b.children.put('e', new TrieNode());
        TrieNode d = c.children.get('d');
        d.children.put('f', new TrieNode());

        String s = serialize(root);
        System.out.println(s);
    }

    public static void Test() {
        TrieSerialization t = new TrieSerialization();
        t.T();
    }
}
