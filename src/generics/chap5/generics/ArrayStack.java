package generics.chap5.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 16-12-10.
 */
public class ArrayStack<E> implements Stack<E> {
    private List<E> list;
    public ArrayStack() {
        list = new ArrayList<E>();
    }

    @Override
    public void push(E elt) {
        list.add(elt);
    }

    @Override
    public E pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }
}
