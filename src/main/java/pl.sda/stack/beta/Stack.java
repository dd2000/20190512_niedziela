package pl.sda.stack.beta;

public class Stack<E> {
    private StackElement<E> root = null;

    public void push(E value) {
        StackElement<E> stackElement = new StackElement<>(value, root);
        root = stackElement;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E temp = root.getValue();
        root = root.getNext();
        return temp;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return root.getValue();
    }

    public boolean isEmpty() {
        return root == null;
    }
}
