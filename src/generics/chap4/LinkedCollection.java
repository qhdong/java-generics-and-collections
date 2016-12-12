package generics.chap4;

import java.util.*;

public class LinkedCollection<E> extends AbstractCollection<E> {
    private static class Node<T> {
        private T element;
        private Node next = null;
        private Node(T elt) { element = elt; }
    }

    private Node<E> first = new Node<>(null);
    private Node<E> last = first;
    private int size = 0;
    public LinkedCollection() {}
    public LinkedCollection(Collection<? extends E> c) {addAll(c);}

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        last.next = new Node<E>(e);
        last = last.next;
        size++;
        return true;
    }

    private static class LinkedIterator<T> implements Iterator<T> {
        private Node<T> current;

        public LinkedIterator(Node<T> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        public T next() {
            if (current.next != null) {
                current = current.next;
                return current.element;
            } else throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<E> iterator() {
        return new LinkedIterator<E>(first);
    }

    public static void main(String[] args) {
        LinkedCollection<Integer> a = new LinkedCollection<>(Arrays.asList(1, 2, 3, 4));
        for (Integer anA : a) {
            System.out.println(anA);
        }
    }
}
