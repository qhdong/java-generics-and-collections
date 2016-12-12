package generics.chap5.generics;

/**
 * Created by aaron on 16-12-10.
 */
public interface Stack<E> {
    void push(E elt);
    E pop();
    boolean empty();
}
