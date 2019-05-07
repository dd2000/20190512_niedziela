package pl.sda.tasks.weekend2;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public Tree(int value) {
        this.root = new Node(value);
    }

    public void add(int value) {
        root.addChild(value);
    }

    public int leafCount() {
        return leafCount(root);
    }

    private int leafCount(Node node) {
        if(node == null) {
            return 0;
        }

        if(node.getLeft() == null && node.getRight() == null) {
            return 1;
        }

        int count = 0;
        if(node.getLeft() != null) {
            count = leafCount(node.getLeft());
        }

        if(node.getRight() != null) {
            count+= leafCount(node.getRight());
        }

        return count;
    }

    public List<Integer> inOrder() {
        List<Integer> values = new ArrayList<>();
        inOrderValueGetter(root, values);
        return values;
    }

    private void inOrderValueGetter(Node node, List<Integer> values) {
        if(node.getLeft() != null) {
            inOrderValueGetter(node.getLeft(), values);
        }

        values.add(node.getValue());

        if(node.getRight() != null) {
            inOrderValueGetter(node.getRight(), values);
        }
    }

    public List<Integer> preOrder() {
        List<Integer> values = new ArrayList<>();
        preOrderValueGetter(root, values);
        return values;
    }

    private void preOrderValueGetter(Node node, List<Integer> values) {
        values.add(node.getValue());

        if(node.getLeft() != null) {
            inOrderValueGetter(node.getLeft(), values);
        }

        if(node.getRight() != null) {
            inOrderValueGetter(node.getRight(), values);
        }
    }

    @Override
    public String toString() {
        List<Integer> inOrder = inOrder();
        return inOrder.toString();
    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        void addChild(int value) {
            if(value < this.value) {
                if(left == null) {
                    left = new Node(value);
                } else {
                    left.addChild(value);
                }
            } else if(value > this.value) {
                if(right == null) {
                    right = new Node(value);
                } else {
                    right.addChild(value);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.add(10);
        tree.add(1);
        tree.add(5);
        tree.add(67);
        tree.add(-9);
        tree.add(10);
        tree.add(10);
        tree.add(66);
        tree.add(100);

        System.out.println(tree);
        System.out.println(tree.preOrder());
        System.out.println("leafCount = " + tree.leafCount());
    }
}
