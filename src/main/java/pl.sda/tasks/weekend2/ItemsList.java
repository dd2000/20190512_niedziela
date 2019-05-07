package pl.sda.tasks.weekend2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 3. Zmodyfikuj klasę z pkt 1 tak żeby przyjmowała dowolne obiekty.
 */
public class ItemsList<E> implements Iterable<E> {
    private List<E> items = new ArrayList<>();

    public ItemsList add(E item) {
        items.add(item);
        return this;
    }

    public boolean remove(E item) {
        return items.remove(item);
    }

    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    public Iterable<E> reversed() {
        return ReversedIterator::new;
    }

    /**
     * 4. Dodaj do klasy z pkt 3 metodę która przyjmie obiekt klasy Predicate, a zwróci obiekt Iterable,
     *    który zwróci tylko te obiekty które spełniają warunek zapisane w klasie Predicate.
     */
    public Iterable<E> conditionalIterable(Predicate<E> condition) {
        return () -> new ConditionalIterator(condition);
    }

    private class ReversedIterator implements Iterator<E> {
        private int id = ItemsList.this.items.size();
        @Override
        public boolean hasNext() {
            return (id - 1) >= 0;
        }

        @Override
        public E next() {
            id--;
            return ItemsList.this.items.get(id);
        }
    }

    private class ConditionalIterator implements Iterator<E> {
        private Predicate<E> condition;
        private int id = ItemsList.this.items.size();

        private ConditionalIterator(Predicate<E> condition) {
            this.condition = condition;
        }

        @Override
        public boolean hasNext() {
            return getNextId() >= 0;
        }

        @Override
        public E next() {
            id = getNextId();
            return ItemsList.this.items.get(id);
        }

        private int getNextId() {
            int nextId = id - 1;
            while (nextId >= 0) {
                E nextItem = ItemsList.this.items.get(nextId);
                if(condition.test(nextItem)) {
                    return nextId;
                }
                nextId--;
            }

            return nextId;
        }
    }
}