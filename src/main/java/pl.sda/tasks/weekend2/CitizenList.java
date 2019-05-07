package pl.sda.tasks.weekend2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. Stwórz klasę, która będzie przechowywać listę obiektów klasy Citizen.
 *    Dodaj metody, które dodadzą i usuną obywatela z listy.
 *    Zaimplementuj w nowej klasie interfejs Iterable jako zwykłą iterację po liście.
 */
public class CitizenList implements Iterable<Citizen> {
    private List<Citizen> citizens = new ArrayList<>();

    public CitizenList add(Citizen citizen) {
        citizens.add(citizen);
        return this;
    }

    public boolean remove(Citizen citizen) {
        return citizens.remove(citizen);
    }

    @Override
    public Iterator<Citizen> iterator() {
        return citizens.iterator();
    }

    /**
     * 2. Dodaj do klasy z pkt 1 metodę, która zwróci obiekt Iterable to przeszukiwania listy w odwrotnej kolejności.
     */
    public Iterable<Citizen> reversed() {
        return ReversedIterator::new;
    }

    private class ReversedIterator implements Iterator<Citizen> {
        private int id = CitizenList.this.citizens.size();
        @Override
        public boolean hasNext() {
            return (id - 1) >= 0;
        }

        @Override
        public Citizen next() {
            id--;
            return CitizenList.this.citizens.get(id);
        }
    }
}
