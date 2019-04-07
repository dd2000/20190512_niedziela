package pl.sda.stack.objectstack;

public class Stack<T> {
    private Node<T> root;

    public void push(T value) {
        root = new Node<>(value, root);
    }

    public T peek() throws Exception {
        if (root == null) {
            throw new Exception("Stack is empty!");
        }
        return root.getValue();
    }

    public T pop() throws Exception {
        if (root == null) {
            throw new Exception("Stack is empty!");
        }
        Node<T> node = root;
        root = node.getNext();
        return node.getValue();
    }

    public boolean isEmpty() {
        return root == null;
    }
}
