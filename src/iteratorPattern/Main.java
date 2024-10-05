package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Define the aggregate interface
interface Aggregate<T> {
    Iterator<T> createIterator();
}

// Concrete implementation of the aggregate interface
class MyList<T> implements Aggregate<T> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    @Override
    public Iterator<T> createIterator() {
        return new MyListIterator<>();
    }

    // Concrete iterator implementation
    private class MyListIterator<E> implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < list.size();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (E) list.get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        // Using iterator to traverse the list
        Iterator<String> iterator = myList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
