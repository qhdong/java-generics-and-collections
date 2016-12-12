package generics.chap9.visitor.tree;

/**
 * Created by aaron on 16-12-12.
 */
public abstract class Tree<E> {
    public interface Visitor<E, R> {
        R leaf(E elt);
        R branch(R left, R right);
    }

    public abstract <R> R visit(Visitor<E, R> visitor);

    public static <T> Tree<T> leaf(final T e) {
        return new Tree<T>() {
            @Override
            public <R> R visit(Visitor<T, R> visitor) {
                return visitor.leaf(e);
            }
        };
    }

    public static <T> Tree<T> branch(final Tree<T> l, final Tree<T> r) {
        return new Tree<T>() {
            public <R> R visit(Visitor<T, R> visitor) {
                return visitor.branch(l.visit(visitor), r.visit(visitor));
            }
        };
    }
}
