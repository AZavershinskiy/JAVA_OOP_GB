package Sem3.HomeWork;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {

    private Node<E> node = null;
    private int counter = 0;

    public MyList() {
        node = new Node<>();
    }

    public int size() {
        return counter;
    }

    public void add(E element) {
        if (counter == 0) {
            node.set(element);
        } else {
            node.add(element);
        }
        counter++;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator(node);
    }

    private class Node<E> { // Так и не понял на что тут ругается VSCode
                            // (The type parameter E is hiding the type E)

        private E element;
        private Node<E> next = null;

        Node() {
        }

        Node(E element) {
            set(element);
        }

        void set(E element) {
            this.element = element;
        }

        void add(E element) {
            if (isNext()) {
                next.add(element);
            } else {
                next = new Node<>(element);
            }
        }

        E get() {
            return element;
        }

        boolean isNext() {
            return next != null;
        }
    }

    private class MyListIterator implements Iterator<E> {

        private Node<E> current;
        private boolean isFirst = true;

        MyListIterator(Node<E> node) {
            current = node;
        }

        @Override
        public boolean hasNext() {
            if (counter == 1 && isFirst) {
                return true;
            } else {
                return current.isNext();
            }
        }

        @Override
        public E next() {
            if (isFirst) {
                isFirst = false;
            } else {
                current = current.next;
            }
            return current.get();
        }
    }
}