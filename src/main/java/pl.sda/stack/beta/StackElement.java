package pl.sda.stack.beta;

public class StackElement<E> {
    private E value;
    private StackElement<E> next;

    public StackElement(E value, StackElement<E> next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public StackElement<E> getNext() {
        return next;
    }
}
