package generics.chap5;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayStack
 * Created by aaron on 16-12-10.
 */
public class ArrayStack implements Stack {
    private List list;

    public ArrayStack() {
        list = new ArrayList();
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public void push(Object elt) {
        list.add(elt);
    }

    @Override
    public Object pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public String toString() {
        return "stack" + list.toString();
    }
}
